package subsistema2.cep;

public class CepApi {
    //padrão Singleton
    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia() {
        return instancia;
    }
    public String buscarCidade(){
        return "Belo Horizonte";
    }

    public String buscarEstado(){
        return "MG";
    }

}
