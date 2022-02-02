$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/sample_login_positive_scenario.feature");
formatter.feature({
  "name": "Mainteny Login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the Login page with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want login to Mainteny Website",
  "keyword": "Given "
});
formatter.match({
  "location": "login.loginURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the valid user name \u0026  password click on the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "login.loginCreds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be navigated to Mainteny Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "login.dashboard()"
});
formatter.result({
  "status": "passed"
});
});