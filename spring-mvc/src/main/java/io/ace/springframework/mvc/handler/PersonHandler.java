package io.ace.springframework.mvc.handler;


import io.ace.springframework.mvc.dao.PersonDAO;
import io.ace.springframework.mvc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Component
public class PersonHandler {

    @Autowired
    PersonDAO personDAO;

    public ServerResponse getPerson(ServerRequest request) {
        String id = request.pathVariable("id");
        Optional<Person> person = personDAO.getPerson(Integer.valueOf(id));
        if (person.isPresent()) {
            return ServerResponse.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(person.get());
        } else {
            return ServerResponse.notFound().build();
        }
    }

    public ServerResponse getAllPersons(ServerRequest request) {
        MultiValueMap<String, String> params = request.params();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(personDAO.getAllPerson());
    }

    public ServerResponse createPerson(ServerRequest request) {
        try {
            List<Person> body = request.body(new ParameterizedTypeReference<List<Person>>() {
            });
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
