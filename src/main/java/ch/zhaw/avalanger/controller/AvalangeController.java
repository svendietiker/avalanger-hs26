package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/avalange")
public class AvalangeController {

    @GetMapping("")
    public String getAllAvelanges(@PathVariable(required = false) String country, @PathVariable(required = false) String state) {
        return "No avelanges found..";
    } 

    @PostMapping("path")
    public String createAvalange(@RequestBody String avalange) {
        return "Avalange created: " + avalange;
    }
    
}

