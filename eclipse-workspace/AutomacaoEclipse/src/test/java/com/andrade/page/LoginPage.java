package com.andrade.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
	
	private WebDriver driver;
	
	
	public void acessarSite() {
		System.setProperty("webdriver.com.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	
	public void username(String valor){
		driver.findElement(By.id("user-name")).sendKeys(valor);
		
	}
	
	public void senha(String valor) {
		driver.findElement(By.id("password")).sendKeys(valor);
	}
	
	public void botaoentrar() {
		driver.findElement(By.id("login-button")).click();
	}
	
	public void validarlogin() {
		String texto = driver.findElement(By.xpath("//div[2]/span")).getText();
		Assert.assertEquals("PRODUCTS", texto);
	}
	
	public void finalizarTeste() {
		driver.quit();
	}
}
