package com.company.controller;

import com.company.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());

        return "chucknorris";
    }
}
