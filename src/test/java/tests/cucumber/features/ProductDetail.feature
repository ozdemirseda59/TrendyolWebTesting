@ProductDetail
Feature: Home Page Section
  Background:
    Given I am on "" Home Page
    When  I close popup
    And   I click on a random boutique on Home Page

  Scenario: Successfully go to any product detail and add to cart
    When I click any product on Boutique Detail Page
    And  I click Sepete Ekle button
    Then I should see Sepete Eklendi button