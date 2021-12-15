@RegisterUser
Feature: Register
  As a Wedding Stories
  I want to Register Account as A User
  So that I can login on Website Wedding Stories

  Scenario: Register user Success
    Given I am on the register page
    When I enter my username email and password correctly
    And I click Register button
    Then I am Successfully registered my Account

  Scenario: Register user Failed email registered
    Given I am on the register page
    When I enter my username email registered and password correctly
    And I click Register button when email already registered
    Then I am Failed to registered my Account that email existed

  Scenario: Register user Failed username registered
    Given I am on the register page
    When I enter my username registered email and password correctly
    And I click Register button when username already registered
    Then I am Failed to registered my Account that username existed

  Scenario: Register user Failed username blank
    Given I am on the register page
    When I enter my email and password correctly but username blank
    And I click Register button when username is blank
    Then I am Failed to registered my Account that username blank

  Scenario: Register user Failed email blank
    Given I am on the register page
    When I enter my username and password correctly but email blank
    And I click Register button when email is blank
    Then I am Failed to registered my Account that email blank

  Scenario: Register user Failed password blank
    Given I am on the register page
    When I enter my username adn email correctly but password blank
    And I click Register button when password is blank
    Then I am Failed to registered my Account that password blank