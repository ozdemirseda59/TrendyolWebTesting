@Login @test
Feature: Login section
  Background:
    Given I am on "" Home Page
    When  I close popup

  Scenario: Successfully Login to Website
    And  I click Giris Yap user icon on Home Page
    And  I fill E-Posta field and Sifre field and click Giris Yap on LoginPage
    Then I verify user "Hesabım" login on Home Page
