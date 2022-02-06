package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class LoginSteps {

    @Dado("que tenha um payload valido da API de Login")
    public void queTenhaUmPayloadValidoDaAPIDeLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("envio uma requisicao do tipo POST de Login")
    public void envioUmaRequisicaoDoTipoPOSTDeLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("armazeno o loken que recebo do response do login")
    public void armazenoOLokenQueReceboDoResponseDoLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Dado("que tenha um payload da API Login com as seguintes situacoes")
    public void queTenhaUmPayloadDaAPILoginComAsSeguintesSituacoes(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
}
