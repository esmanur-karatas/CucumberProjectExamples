@paralel
Feature: Pazarama Paralel Test
  Scenario: Pazarama paralel test
    Given "pazarama" sitesine gidilir
    When search box içine "Jenga" yazilir
    Then goruntulenen sonuclarda "Jenga" oldugu dogrulanir
    When ilk urun favorilere ekler
    Then giris sayfasi acilir
    And email ve password kutularina veri girilir
      | email                     | password |
      | hakandenememail@gmail.com | 1234567  |
    Then giris yapilamadigi dogrulanir
