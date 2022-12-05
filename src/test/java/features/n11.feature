@n11
  Feature: n11 Mobil Uygulaması
    Scenario: n11 Mobil Uygulaması ile Telefon Satın Alma Otomasyonu
      When Kategorilere tiklanir
      When Elektronik filtresine tiklanir
      When Telefon ve Aksesuar filtresine tiklanir
      When Cep telefonu filtresine tiklanir
      When filtrelemeye tiklanir
      When Marka Kategorsi secilir
      When Apple markası secilir
      When Sonuclari göstere tiklanir
      When Urun sepete eklenir
      Then Sepete urunun geldigi gorulur
      When Uye olmadan odeme sayfasına gecilir