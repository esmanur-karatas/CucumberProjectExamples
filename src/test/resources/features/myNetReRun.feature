@rerun
Feature: Mynet Rerun testi pozitive negative
  Background: Mynet arama
    Given "mynet" sitesine gidilir
    And arama butonuna basar
    And arama kutusuna "qa tester" yazar

  Scenario:Mynet rerun testi positive
    Then sonuclarda "Qa tester Haberleri" oldugu dogrulanir

  Scenario:Mynet rerun testi negatif
    Then sonuclarda "testere" oldugu dogrulanir