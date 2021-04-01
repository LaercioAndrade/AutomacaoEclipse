$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Realizar Login no site",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizar login",
  "description": "",
  "keyword": "Cenario"
});
formatter.step({
  "name": "que preencho os dados corretos",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginSteps.quePreenchoOsDadosCorretos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botao login",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.clico_no_botao_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido se o login e realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.validoSeOLoginERealizadoComSucesso()"
});
formatter.result({
  "status": "passed"
});
});