package io.ace.springframework.mvc.example.urllinks;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class UriComponentExample {

    public static void main(String[] args) {

        UriComponents uriComponents = UriComponentsBuilder
                .fromUriString("https://example.com/hotels/{hotel}")
                .queryParam("q", "{q}")
                .encode()
                .build();
        URI western = uriComponents.expand("Western", 123).toUri();
        System.out.println(western);

    }
}
