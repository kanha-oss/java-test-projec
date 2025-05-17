package com.javatest.javatest.service;

import com.javatest.javatest.Model.Test;
import com.javatest.javatest.Respositary.RespositaryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ServiceTest {

    @Autowired
    private RespositaryTest respositaryTest;

    public String getTestResult(Long id){
        Test test=new Test();
        //test.setId(6789l);
        test.setEmail("drfgbhnj");
        test.setName("dcfvgbhjn");
          Test test2=  respositaryTest.save(test);
         Optional<Test> test1=respositaryTest.findById(test2.getId());
        return test1.get().getName();
    }
}
