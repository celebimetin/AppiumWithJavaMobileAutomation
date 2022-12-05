package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementHelper;

import java.time.Duration;
import java.util.List;

public class n11Page {
    AppiumDriver driver;
    WebDriverWait webDriverWait;
    elementHelper elementHelper;
    public n11Page(AppiumDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.elementHelper = new elementHelper(driver);
    }

    By kategorilerButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By filtreleButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By uygulaButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Uygula\")");
    By sonuclariGosterButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By sepeteEkleButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepeteEklenecekUrunCheck = MobileBy.androidUIAutomator("new UiSelector().text(\"Apple iPhone 14 Pro Max 256 GB (Apple Türkiye Garantili)\")");
    By odemeyeGecButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Ödemeye Geç\")");
    By uyeOlmadanDevamEtButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"Üye Olmadan Devam Et\")");
    By musteriAydınlatmaTamamButonu = MobileBy.androidUIAutomator("new UiSelector().text(\"TAMAM\")");
    By adresBasligi = MobileBy.androidUIAutomator("new UiSelector().text(\"Adres Başlığı*\")");
    By adSoyad = MobileBy.androidUIAutomator("new UiSelector().text(\"Ad Soyad*\")");



    public void kategorilereTiklanir() { elementHelper.Click(kategorilerButonu); }
    public void elektronikFiltresineTiklanir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        webElementLists.get(1).click(); }
    public void telefonVeAksesuarFiltresineTiklanir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        webElementLists.get(0).click(); }
    public void cepTelefonuFiltresineTiklanir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/tvCategoryItem\")"));
        webElementLists.get(0).click();
    }
    public void filtrelemeyeTiklanir() { elementHelper.Click(filtreleButonu); }
    public void markaKategorisiSecilir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/typeNameTV\")"));
        webElementLists.get(1).click();
    }
    public void appleMarkasıSecilir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/nameTV\")"));
        webElementLists.get(2).click();
        elementHelper.Click(uygulaButonu);
    }
    public void sonuclariGöstereTiklanir() { elementHelper.Click(sonuclariGosterButonu); }
    public void urunSepeteEklenir() {
        List<WebElement> webElementLists = driver.findElements(MobileBy.androidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivImage\")"));
        webElementLists.get(0).click();
        elementHelper.Click(sepeteEkleButonu);
    }
    public void sepeteUrununGeldigiGorulur() { elementHelper.checkVisible(sepeteEklenecekUrunCheck); }

    public void uyeOlmadanOdemeSayfasınaGecilir() {
        elementHelper.Click(odemeyeGecButonu);
        elementHelper.Click(uyeOlmadanDevamEtButonu);
        elementHelper.Click(musteriAydınlatmaTamamButonu);
        elementHelper.sendKeys(adresBasligi, "Adres başlığı");
        elementHelper.sendKeys(adSoyad, "Metin Çelebi");
    }
}