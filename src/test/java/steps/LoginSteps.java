package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import io.restassured.http.ContentType;
import maps.LoginMap;
import utils.RestUtils;

import java.util.Map;

public class LoginSteps {

    String url = "http://localhost:8080/";

    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
        LoginMap.initLogin();
        RestUtils.setBaseUR(url);
    }
    @Quando("envio uma requisicao do tipo POST de Login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
      RestUtils.post(LoginMap.getLogin(), ContentType.JSON, "auth");
    }
    @Entao("armazeno o loken que recebo do response do login")
    public void armazenoOLokenQueReceboDoResponseDoLogin() {
        LoginMap.token = RestUtils.getResponse().jsonPath().get("token");
    }
    @Dado("que tenha um payload da API Login com as seguintes situacoes")
    public void queTenhaUmPayloadDaAPILoginComAsSeguintesSituacoes(Map<String, String> map) {
        LoginMap.initLogin();
        RestUtils.setBaseUR(url);
        LoginMap.getLogin().putAll(map);
    }
}
