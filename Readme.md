Automated Test Repo
======
This repo contains the Selenium tests run by [QA](http://eureka.stepstone.com/display/QT/Jobsite+QA+Team).

Getting Started
------
To run and edit these tests locally, you will need:
* A JDK - Recommended: Latest Version of Java 8.
* A Java IDE - Recommended: [IntelliJ Community Edition](https://www.jetbrains.com/idea/).
* ChromeDriver - [Latest Version](https://sites.google.com/a/chromium.org/chromedriver/downloads)

Once you have the above dependencies installed, checkout this repo and import the maven project using the IDE of your choice.

How to run your First Story
----
Create a configuration with the following parameters:

* Class: AccaptanceTestSuite.java
* VM Oprions: -ea -Drun.story=SignInSignOut.story
* JDK set to Java 8 JDK

How to run the SignInSignOut.story with your existing account
----

* Class: AccaptanceTestSuite.java
* VM Oprions: -ea -Drun.story=SignInSignOut.story -Demail=YOUR EMAIL ADDRESS -Dpassword=YOUR PASSWORD
* JDK set to Java 8 JDK
