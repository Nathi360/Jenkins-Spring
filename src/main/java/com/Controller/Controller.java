package com.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.net.InetAddress;

@RestController
@RequestMapping("/jenkins")
public class Controller {

    private ArrayList<String> strings;

    public Controller() throws UnknownHostException {

        strings = new ArrayList<>();

        strings.add("Hello from " + InetAddress.getLocalHost().getHostAddress());
        strings.add("Spring-boot");
        strings.add("Docker");
        strings.add("Jenkins");
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ArrayList<String> phoneHome() {

        return strings;
    }
}
