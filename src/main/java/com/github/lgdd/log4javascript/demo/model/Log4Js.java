package com.github.lgdd.log4javascript.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representation of a JavaScript log.
 *
 * @see Log4Js.Level
 * @see <a href="http://log4javascript.org/docs/manual.html#jsonlayout">
 * docs/manual.html#jsonlayout
 * </a>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log4Js {

    private String logger;
    private String url;
    private String layout;
    private Level level;
    private long timestamp;
    private String message;

    /**
     * JavaScript log levels available.
     *
     * @see <a href="http://log4javascript.org/docs/manual.html#levels">
     * docs/manual.html#levels
     * </a>
     */
    public enum Level {
        TRACE, DEBUG, INFO, WARN, ERROR, FATAL
    }
}
