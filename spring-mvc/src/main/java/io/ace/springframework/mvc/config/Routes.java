package io.ace.springframework.mvc.config;

import io.ace.springframework.mvc.handler.PersonHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.TEXT_HTML;
import static org.springframework.web.servlet.function.RequestPredicates.accept;

@Configuration
public class Routes {

    @Autowired
    PersonHandler personHandler;

    @Bean
    public RouterFunction<ServerResponse> personRoute() {
        return RouterFunctions.route()
                .GET("/person/{id}", accept(APPLICATION_JSON), personHandler::getPerson)
                .GET("/persons", accept(APPLICATION_JSON), personHandler::getAllPersons)
                .POST("/person", personHandler::createPerson)
                .build();
    }
    @Bean
    public RouterFunction<ServerResponse> test() {
        return RouterFunctions.route()
                .GET("/home", accept(TEXT_HTML),serverRequest -> ServerResponse.ok().body("Hello Dude!"))
                .build();
    }

}
