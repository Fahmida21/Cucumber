$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login4.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verification",
  "description": "",
  "id": "login;verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter mobile banking in search field",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdep.Launch_URL()"
});
formatter.result({
  "duration": 8568420400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdep.Enter_mobile_banking_in_search_field()"
});
formatter.result({
  "duration": 190142400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdep.Click_search_button()"
});
formatter.result({
  "duration": 220547500,
  "status": "passed"
});
});