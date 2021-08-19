$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginWithParameters.feature");
formatter.feature({
  "name": "login as different users",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login as a \"\u003cuser\u003e\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user logs in using following credentials",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "username",
        "\u003cuser\u003e"
      ]
    },
    {
      "cells": [
        "password",
        "UserUser123"
      ]
    },
    {
      "cells": [
        "firstname",
        "\u003cfirstname\u003e"
      ]
    },
    {
      "cells": [
        "lastname",
        "\u003c lastname\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "user10",
        "Toney",
        "Hegmann"
      ]
    },
    {
      "cells": [
        "storemanager85",
        "Marcella",
        "Huels"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login as a \"user10\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.the_user_logs_in_using_following_credentials(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cToney [\u003c lastname\u003e]\u003e but was:\u003cToney [Hegmann]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.vytrack.step_definitions.ContactsStepDefs.the_user_logs_in_using_following_credentials(ContactsStepDefs.java:36)\r\n\tat ✽.the user logs in using following credentials(file:///C:/Users/lenovo%20z70/IdeaProjects/EU5CucumberSelenium/src/test/resources/features/LoginWithParameters.feature:28)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "login as a \"storemanager85\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContactsStepDefs.the_user_logs_in_using_following_credentials(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cMarcella [\u003c lastname\u003e]\u003e but was:\u003cMarcella [Huels]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.vytrack.step_definitions.ContactsStepDefs.the_user_logs_in_using_following_credentials(ContactsStepDefs.java:36)\r\n\tat ✽.the user logs in using following credentials(file:///C:/Users/lenovo%20z70/IdeaProjects/EU5CucumberSelenium/src/test/resources/features/LoginWithParameters.feature:28)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "screenshot");
formatter.after({
  "status": "passed"
});
});