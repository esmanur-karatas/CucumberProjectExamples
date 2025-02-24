
Feature: Boyner Negatif Uyelik
  @boyner
  Scenario Outline: Negatif Uyelik
    Given boyner sitesine gidilir
    When login butonunun ustune gidilir.
    And uye ol linkine tiklanir
    Then cerezler kabul edilir
    And uyelik sayfasinda ad bolumune "<ad>" girilir
    And uyelik sayfasinda email bolumune "<email>" girilir
    And uyelik sayfasinda sifre bolumune "<sifre>" girilir
    And uyelik sayfasinda cep telefonu bolumune "<ceptelefonu>" girilir
    And uyelik sayfasinda uyelik metni "<uyelik metni>" checkbox secilir
    And uyelik sayfasinda riza metni "<riza metni>" checkbox secilir
    And uye ol butonuna tiklanir
    Then uye olunamadigi dogrulanir
    Examples:
      | ad     | email            | sifre     | ceptelefonu | uyelik metni | riza metni |
      | deneme | deneme@gmai      | deneme23W | 5555555555  | 1            | 1          |
      | deneme | deneme@gmail     | deneme23W | 5555555555  | 1            | 1          |
      | deneme | deneme@gmail.com | deneme23W | 5555555555  | 1            | 1          |


