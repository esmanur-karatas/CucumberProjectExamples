
Feature: SearchMadamaCocoTr
  Scenario: Madam coco sitesinden tr arama yaptırma
    Given madama coco sitesine gidilir.
    And arama kutusuna vazo yazılır
    Then sonuçlarda vazo olduğu doğrulanır.


  @madamacoco
  Scenario: Parametreli Arama Kutusu Testi
    Given madame coco sitesine gidilir.
    And ingilizce menü seçilir
    And Arama kutusuna "<urun>" yazilir
    Then sonuçlarda "<urun>" olduğu doğrulanır.