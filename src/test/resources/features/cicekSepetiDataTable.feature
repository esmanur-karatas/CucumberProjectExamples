@ciceksepeti
  Feature: Cicek sepeti data table
    Scenario: Cicek sepeti urun renk secme
      Given "cicek sepeti" sitesine gidilir
      When cicek sepeti sayfası seçilir.
      When dogum gunu linki tıklanır
      Then dogum gunu sayfasında olduğu dogrulanır
      When tasarim tipi drop down tıklanır
      Then sirasiyla renklerin secildigi dogrulanir
        | Tasarim tipi  |
        | Buketler      |
        | Kutuda Cicek  |
        | Saksida Cicek |
        | Vazoda Cicek  |
        | Celenk        |