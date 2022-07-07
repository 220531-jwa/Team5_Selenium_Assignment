#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Employee Login

  @login
  Scenario Outline: A valid user can Login using their uname and pass
    Given the user is on the login page
    When the user types in their "<uname>" and "<pass>" and clicks login
    Then the user should be on the home page

    Examples: 
      | uname                   | pass         |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  @lockedout
  Scenario: A locked out user cannot log in
    Given the user is on the login page
    When the user types in locked out user credentials and clicks login
    Then the user should recieve a locked out user error

  @invalid
  Scenario: An invalid user cannot log in
    Given the user is on the login page
    When the user types in invalid user credentials and clicks login
    Then the user should recieve an invalid credentials error