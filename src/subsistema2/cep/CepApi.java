package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Nova Friburgo";
    }
    public String recuperarEstado(String estado){
        return "Rio de Janeiro";
    }
}
