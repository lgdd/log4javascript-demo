package com.github.lgdd.log4javascript.demo.wrapper;

import com.github.lgdd.log4javascript.demo.model.Log4Js;
import org.slf4j.Logger;

import java.util.List;

/**
 * Log Wrapper for JavaScript Logs.
 */
public abstract class JsLogWrapper {

    private static final String LOG_FORMAT = "Log4JavaScript --- [{}]: {}, {}";

    private JsLogWrapper() {
    }

    /**
     * Trace a list of JavaScript logs using caller's logger.
     * <p/>
     * It uses log level indicated in {@link Log4Js}.
     *
     * @param log        Caller's logger
     * @param log4JsList List of JavaScript logs
     * @see Log4Js
     * @see Log4Js.Level
     */
    public static void log(Logger log, List<Log4Js> log4JsList) {
        log4JsList.forEach(log4js -> {
            switch (log4js.getLevel()) {
                case TRACE:
                    log.trace(LOG_FORMAT, log4js.getLogger(), log4js.getMessage(), log4js.getUrl());
                    break;
                case INFO:
                    log.info(LOG_FORMAT, log4js.getLogger(), log4js.getMessage(), log4js.getUrl());
                    break;
                case WARN:
                    log.warn(LOG_FORMAT, log4js.getLogger(), log4js.getMessage(), log4js.getUrl());
                    break;
                case ERROR:
                case FATAL:
                    log.error(LOG_FORMAT, log4js.getLogger(), log4js.getMessage(), log4js.getUrl());
                    break;
                case DEBUG:
                default:
                    log.debug(LOG_FORMAT, log4js.getLogger(), log4js.getMessage(), log4js.getUrl());
                    break;
            }
        });
    }
}
