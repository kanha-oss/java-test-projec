package com.javatest.javatest.controller;

import com.javatest.javatest.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @Autowired
   private ServiceTest srv;

    @GetMapping("/gettest")
    public String Test(@Param("id") Long id){
       return srv.getTestResult(id);
    }


}
