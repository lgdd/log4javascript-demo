package com.github.lgdd.log4javascript.demo;

import com.github.lgdd.log4javascript.demo.model.Log4Js;
import com.github.lgdd.log4javascript.demo.wrapper.JsLogWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public class DummyController {

        @PostMapping("/log/javascript")
        public void javascriptLogging(@RequestBody List<Log4Js> log4jsList) {
            JsLogWrapper.log(log, log4jsList);
        }

    }

}
