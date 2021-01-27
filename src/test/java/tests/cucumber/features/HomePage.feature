@HomePage @prod @test
Feature: Home Page Section
  Background:
    Given I am on "" Home Page
    When  I close popup
  Scenario: Successful loaded  boutique images when I click all categories on Home Page
    And    I should see the boutique images are loaded when I click all categories
