function globalLogging() {
  var log = log4javascript.getLogger("Global"),
    ajaxAppender = new log4javascript.AjaxAppender('/log/javascript');

  ajaxAppender.addHeader("Content-Type", "application/json");
  ajaxAppender.setLayout(new log4javascript.JsonLayout(false, true));

  log.addAppender(ajaxAppender);

  window.onerror = function (errorMsg, url, lineNumber) {
    log.fatal(errorMsg + " in " + url + ", line " + lineNumber);
  };
}

function loggingDemo() {
  var log = log4javascript.getLogger("Demo"),
    ajaxAppender = new log4javascript.AjaxAppender('/log/javascript');

  ajaxAppender.addHeader("Content-Type", "application/json");
  ajaxAppender.setLayout(new log4javascript.JsonLayout(false, true));

  log.addAppender(ajaxAppender);

  log.debug("Hello, debug log!");
  log.info("Hello, info log!");
  log.warn("Hello, warn log!");
  log.error("Hello, error log!");
  log.fatal("Hello, fatal log!");
}

globalLogging();
loggingDemo();
