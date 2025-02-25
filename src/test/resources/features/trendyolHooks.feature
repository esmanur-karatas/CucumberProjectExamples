@trendyol
Feature: Trendyol Hooks Testi
  Background: Trendyol Hooks Testi
    Given "trendyol" sitesine gidilir
    And arama kutusuna "gömlek" yazilir

    Scenario: Trendyol Hooks Testi Negative
      Then sonuc sayfasinda "gömlek" olduğu dogrulanir
      When sonuc sayfasindaki arama sonuc sayisi alinir
      Then 20 den az urunun ekranda goruntulendigi dogrulanir