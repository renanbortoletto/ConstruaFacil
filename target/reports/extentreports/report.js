$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comprarCursoPO.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Comprar Curso CS PO",
  "description": "",
  "id": "comprar-curso-cs-po",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 365954,
  "status": "passed"
});
formatter.before({
  "duration": 4184020562,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Pesquisar Curso com Click e Incluir no Carrinho PO",
  "description": "",
  "id": "comprar-curso-cs-po;pesquisar-curso-com-click-e-incluir-no-carrinho-po",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso o site da Iterasys  PO",
  "keyword": "Dado "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Mantis\" PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 6,
  "name": "clico na Lupa PO",
  "keyword": "E "
});
formatter.step({
  "line": 7,
  "name": "vejo a lista de resultados para o curso \"Mantis\" PO",
  "keyword": "Entao "
});
formatter.step({
  "line": 8,
  "name": "clico em Matricule-se PO",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "confirmo o nome do curso como \"Mantis\" e o preco de \"R$ 49,99\" PO",
  "keyword": "Entao "
});
formatter.match({
  "location": "comprarCursoPO.queAcessoOSiteDaIterasysPO()"
});
formatter.result({
  "duration": 5638226134,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 14
    }
  ],
  "location": "comprarCursoPO.pesquisoPorPO(String)"
});
formatter.result({
  "duration": 422464914,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPO.clicoNaLupaPO()"
});
formatter.result({
  "duration": 2612153824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 41
    }
  ],
  "location": "comprarCursoPO.vejoAListaDeResultadosParaOCursoPO(String)"
});
formatter.result({
  "duration": 122497545,
  "status": "passed"
});
formatter.match({
  "location": "comprarCursoPO.clicoEmMatriculeSePO()"
});
formatter.result({
  "duration": 3495364687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mantis",
      "offset": 31
    },
    {
      "val": "R$ 49,99",
      "offset": 53
    }
  ],
  "location": "comprarCursoPO.confirmoONomeDoCursoComoEOPrecoDePO(String,String)"
});
formatter.result({
  "duration": 9017530285,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using css selector\u003dspan.item-tittle\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MacBook-Air-de-Renan.local\u0027, ip: \u00272804:14d:7862:8485:89a1:b169:f510:c226%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy24.getText(Unknown Source)\n\tat pages.Carrinho.lerNomeCurso(Carrinho.java:25)\n\tat stepsPO.comprarCursoPO.confirmoONomeDoCursoComoEOPrecoDePO(comprarCursoPO.java:84)\n\tat ???.Entao confirmo o nome do curso como \"Mantis\" e o preco de \"R$ 49,99\" PO(comprarCursoPO.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 174612,
  "status": "passed"
});
formatter.after({
  "duration": 269305907,
  "status": "passed"
});
});