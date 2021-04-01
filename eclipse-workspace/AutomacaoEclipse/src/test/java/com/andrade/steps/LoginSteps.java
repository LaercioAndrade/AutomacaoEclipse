package com.andrade.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class LoginSteps {

	private WebDriver driver;
	
	@Dado("que preencho os dados corretos")
	public void quePreenchoOsDadosCorretos() {
	   System.setProperty("webdriver.com.driver", "C:\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com");
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@Quando("clico no botao login")
	public void clico_no_botao_login() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Entao("valido se o login e realizado com sucesso")
	public void validoSeOLoginERealizadoComSucesso() {
	   String texto = driver.findElement(By.xpath("//div[2]/span")).getText();
	   Assert.assertEquals("PRODUCTS", texto);
	}
	
	
}

