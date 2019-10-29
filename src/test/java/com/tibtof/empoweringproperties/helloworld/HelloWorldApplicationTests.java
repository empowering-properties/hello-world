package com.tibtof.empoweringproperties.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

//@SpringBootTest
//@SpringBootTest(properties = "message.languages.en.hello=Cheers!")
//@TestPropertySource("/test.properties")
class HelloWorldApplicationTests {

//    @Autowired
//    private Message message;

    @Test
    void checkProperty() {
//        Assertions.assertEquals("Hi!", message.getLanguages().get("en").getHello());
    }

}
