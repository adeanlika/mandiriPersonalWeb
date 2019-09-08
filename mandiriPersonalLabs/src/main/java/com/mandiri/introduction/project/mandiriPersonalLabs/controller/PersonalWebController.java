package com.mandiri.introduction.project.mandiriPersonalLabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalWebController {

    @RequestMapping("/myprofile")
    public String home() {
        return "Hello My Name is Ade.";
    }
}
