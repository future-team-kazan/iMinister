package ru.digital.breakthrough.iminister.controllers;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 13.06.2019.
 *
 * @authot Julia Savicheva
 */

@RestController
@RequestMapping("hello")
public class TemplateRestController {

    @GetMapping()
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping(path = "{name}")
    public String helloWithParam(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }

}
