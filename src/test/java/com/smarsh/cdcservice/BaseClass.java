package com.smarsh.cdcservice;

import com.smarsh.cdcservice.rest.CDCController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CdcServiceApplication.class)
public class BaseClass {
    @Autowired
    private CDCController controller;

    @Before
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(controller);
        System.out.println("inside base class setup...");
    }
}
