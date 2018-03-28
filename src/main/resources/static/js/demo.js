
var log = log4javascript.getLogger("demoLogger"),
  ajaxAppender = new log4javascript.AjaxAppender('/log/javascript/error');

ajaxAppender.addHeader("Content-Type", "application/json");
ajaxAppender.setLayout(new log4javascript.JsonLayout(false, true));

log.addAppender(ajaxAppender);

window.onerror = function(errorMsg, url, lineNumber) {
  log.fatal(errorMsg + " in " + url + ", line " + lineNumber);
};