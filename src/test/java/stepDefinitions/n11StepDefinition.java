package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Page;
import util.driverFactory;

public class n11StepDefinition {
    n11Page n11Page = new n11Page(driverFactory.getDriver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() { n11Page.kategorilereTiklanir(); }
    @When("Elektronik filtresine tiklanir")
    public void elektronikFiltresineTiklanir() { n11Page.elektronikFiltresineTiklanir(); }
    @When("Telefon ve Aksesuar filtresine tiklanir")
    public void telefonVeAksesuarFiltresineTiklanir() { n11Page.telefonVeAksesuarFiltresineTiklanir(); }
    @When("Cep telefonu filtresine tiklanir")
    public void cepTelefonuFiltresineTiklanir() { n11Page.cepTelefonuFiltresineTiklanir(); }
    @When("Marka Kategorsi secilir")
    public void markaKategorisiSecilir() { n11Page.markaKategorisiSecilir(); }
    @When("Apple markası secilir")
    public void appleMarkasıSecilir() { n11Page.appleMarkasıSecilir(); }
    @When("filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() { n11Page.filtrelemeyeTiklanir(); }
    @When("Sonuclari göstere tiklanir")
    public void sonuclariGöstereTiklanir() { n11Page.sonuclariGöstereTiklanir(); }
    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() { n11Page.urunSepeteEklenir(); }
    @Then("Sepete urunun geldigi gorulur")
    public void sepeteUrununGeldigiGorulur() { n11Page.sepeteUrununGeldigiGorulur(); }

    @When("Uye olmadan odeme sayfasına gecilir")
    public void uyeOlmadanOdemeSayfasınaGecilir() { n11Page.uyeOlmadanOdemeSayfasınaGecilir(); }
}