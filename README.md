# Cucumber & JUnit ile Otomasyon Testleri

## 📌 Proje Hakkında
Bu proje, **Cucumber** ve **JUnit** kullanarak gerçekleştirdiğim otomasyon testlerini içermektedir. Gerçek zamanlı siteler üzerinde farklı test senaryolarını uygulayarak **BDD (Behavior-Driven Development)** prensiplerine uygun testler gerçekleştirdim.

## 🔧 Kullanılan Teknolojiler ve Yapılar
- **Cucumber & JUnit**: BDD tabanlı testlerin yazılması.
- **Hooks**: Test başlangıç ve bitiş aşamalarını yönetme.
- **Page Object Model (POM)**: Testlerin daha düzenli ve sürdürülebilir olması.
- **Step Definitions & Runners**: Cucumber testlerini yapılandırma.
- **Scenario Outline & Data Table**: Parametreli testler oluşturma.
- **ReRun**: Başarısız testleri tekrar çalıştırma.
- **Parallel Testing**: Testleri farklı thread'lerde çalıştırarak hızlandırma.
- **Jenkins**: CI/CD süreçlerine entegrasyon.

## 🚀 Gerçekleştirilen Testler
- **Madame Coco** - Parametreli ve parametresiz arama testi (**MadameCocoSearchStepDefinition**).
- **Etstur** - Kullanıcı giriş testi.
- **Boyner** - Negatif üyelik testi (**Scenario Outline** kullanımı).
- **Çiçek Sepeti** - **Data Table** ile test senaryoları.
- **Trendyol** - Negatif test ve **Hooks Class** kullanımı.
- **Mynet** - **ReRun** testi ile başarısız testleri yeniden çalıştırma.
- **Pazarama** - **Paralel test** uygulaması.
- **Trendyol** - **Test raporlama** entegrasyonu.
- **Jenkins** - Otomatik test çalıştırma.

## 🏗 Proje Yapısı
```
📂 src/test/java
 ├── 📂 features         # Test senaryolarının yazıldığı Gherkin dosyaları
 ├── 📂 stepDefinitions  # Step definition'ların bulunduğu klasör
 ├── 📂 pages            # Sayfa nesnelerinin bulunduğu klasör (POM)
 ├── 📂 runners          # Testlerin çalıştırıldığı Cucumber Runner dosyaları
 ├── 📂 utilities        # Ortak kullanılan yardımcı sınıflar (Driver, ConfigReader vb.)
 ├── 📂 reports          # Test raporları
 └── 📂 configurations   # Test yapılandırma dosyaları
```

## 📎 Kurulum ve Çalıştırma
1. **Proje deposunu klonlayın:**
   ```sh
   git clone [GITHUB_REPO_LINK]
   ```
2. **Gerekli bağımlılıkları yükleyin.** (Maven kullanılıyorsa `pom.xml` dosyasını güncelleyin.)
3. **Testleri çalıştırın:**
   ```sh
   mvn test
   ```

## 📌 Sonuç ve Kazanımlar
Bu proje sayesinde:
- Gerçek siteler üzerinde test senaryoları oluşturma deneyimi kazandım.
- Manuel test sırasında fark edilmeyen hataları otomasyon testleriyle tespit ettim.
- Cucumber, JUnit ve Jenkins gibi araçlarla **test otomasyon sürecini** geliştirdim.
- BDD yaklaşımıyla **daha anlaşılır ve sürdürülebilir testler yazmayı öğrendim.**

---

🔗 **Detaylar için LinkedIn gönderime göz atabilirsiniz:** [LinkedIn Gönderi Bağlantısı]

📌 **Geliştirme ve katkılar için PR'lere açığım!** 🚀

