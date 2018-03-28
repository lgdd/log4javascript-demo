package com.github.lgdd.log4javascript.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log4Js {

    private String logger;
    private String url;
    private String layout;
    private String level;
    private long timestamp;
    private String message;

}
