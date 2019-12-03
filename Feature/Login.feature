@tag
Feature: Test login to cloudamize response 

  @tag1
  Scenario: Login to the cloudamize application with valid credentials and report response time
  Given User is on cloudamize login page and have valid credentials
  When  User enter valid username and password 
  And   click on login button 
  Then Application should redirect user to home page of cloudamize and response time will be reported