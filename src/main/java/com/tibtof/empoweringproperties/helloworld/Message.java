package com.tibtof.empoweringproperties.helloworld;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

//@Component
//@ConfigurationProperties("message")
//@Validated
//@PropertySource("message.properties")
@Data
public class Message {

    /**
     * Greeting message
     */
//    @NotEmpty
    private String greeting;

}

