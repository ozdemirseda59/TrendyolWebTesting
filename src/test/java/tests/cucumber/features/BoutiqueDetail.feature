@BoutiqueDetail
Feature: Boutique section
  Background:
    Given I am on "" Home Page
    When  I close popup

  Scenario: Successful loading of product images when I click on a random boutique
    And  I click on a random boutique on Home Page
    Then I should see the product images are loaded on the boutique detail page

