package com.andrade.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.andrade.page.LoginPage;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class LoginSteps {
	
	private LoginPage login = new LoginPage();

	private WebDriver driver;
	
	@Dado("que preencho os dados corretos")
	public void quePreenchoOsDadosCorretos() {
	   login.acessarSite();
	   login.username("standard_user");
	   login.senha("secret_sauce");
	}

	@Quando("clico no botao login")
	public void clico_no_botao_login() {
	   login.botaoentrar();
	}

	@Entao("valido se o login e realizado com sucesso")
	public void validoSeOLoginERealizadoComSucesso() {
	   login.validarlogin();
	   login.finalizarTeste();
	}
	
	
	
	
}

