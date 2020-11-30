$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ardcs/eclipse-workspace-two/CucumberWithDataProv/src/test/resources/features/Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Signup",
  "description": "",
  "id": "facebook-signup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7780786700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "facebook-signup;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter firstName \"khan\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter lastName \"jan\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter email \"khanjan@edu.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter password \"khanjan\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "duration": 1996123500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khan",
      "offset": 22
    }
  ],
  "location": "StepDefinitions.user_enter_firstName_khan(String)"
});
formatter.result({
  "duration": 674907799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jan",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.user_enter_lastName_jan(String)"
});
formatter.result({
  "duration": 256928900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khanjan@edu.com",
      "offset": 18
    }
  ],
  "location": "StepDefinitions.user_enter_email_khanjan_edu_com(String)"
});
formatter.result({
  "duration": 402017300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khanjan",
      "offset": 21
    }
  ],
  "location": "StepDefinitions.user_enter_password_khanjan(String)"
});
formatter.result({
  "duration": 477525200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_click_on_signup_button()"
});
formatter.result({
  "duration": 251891100,
  "status": "passed"
});
});