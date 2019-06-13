package ru.digital.breakthrough.iminister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created on 13.06.2019.
 *
 * @authot Julia Savicheva
 */
@Controller
public class FrontendController {

    @RequestMapping(value = "/")
    public String index(HttpSession session) {

        return "index.html";
    }
}
