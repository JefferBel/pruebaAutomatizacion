#Author JeffersonBeltran

Feature: Me as a user I need login in the website

Background: Open page evalart
  When Open page evalart

      @Login
      Scenario Outline: Login
      Given Insert dates of user
        |<user> |<password>|
      When complete validations
      Then Validate message succesful
        Examples:
          | user         | password |
          |700399        | 10df2f32286b7120Mi00LTk5MzAwNw==30e0c83e6c29f1c3       |