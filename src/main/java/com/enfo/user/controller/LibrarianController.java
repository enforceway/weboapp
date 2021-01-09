package com.enfo.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.enfo.user.service.LibrarianService;
import com.enfo.user.entity.Librarian;

@RestController
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @RequestMapping("/getLibrarian")
    public Librarian getALibrarianInfo(Integer id) {
        //System.out.println("test :id: "+id);
        return librarianService.selectLibrarian(id);
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(name = "id") Integer id) {
        return "hello world!";
    }

}