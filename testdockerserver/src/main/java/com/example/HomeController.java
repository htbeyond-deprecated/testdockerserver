package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SukkyoSuh on 2017-03-02.
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value="/server")
    public String home(){
	return "server";
    }

}
