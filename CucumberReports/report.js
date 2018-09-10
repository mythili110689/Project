$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/DeleteLead.feature");
formatter.feature({
  "name": "Leaftaps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Deleting the Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter userName \u003cuName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Login",
  "keyword": "And "
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.step({
  "name": "Click the Leads",
  "keyword": "And "
});
formatter.step({
  "name": "Click Find Leads",
  "keyword": "And "
});
formatter.step({
  "name": "Enter First Name \u003cfirstName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click FindLeads Button",
  "keyword": "And "
});
formatter.step({
  "name": "Click Id",
  "keyword": "And "
});
formatter.step({
  "name": "Click Delete",
  "keyword": "And "
});
formatter.step({
  "name": "Click Find Leads",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Id",
  "keyword": "And "
});
formatter.step({
  "name": "Click FindLeads Button",
  "keyword": "When "
});
formatter.step({
  "name": "verify the message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uName",
        "password",
        "firstName"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "Mythili"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Deleting the Lead",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter userName DemoSalesManager",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter Password crmsfa",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click CRMSFA",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click the Leads",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Find Leads",
  "keyword": "And "
});
formatter.match({
  "location": "LeadsPage.clickFindLeads()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter First Name Mythili",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click FindLeads Button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Id",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click Delete",
  "keyword": "And "
});
formatter.match({
  "location": "ViewLeadPage.clickDelete()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Find Leads",
  "keyword": "And "
});
formatter.match({
  "location": "LeadsPage.clickFindLeads()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Id",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click FindLeads Button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});