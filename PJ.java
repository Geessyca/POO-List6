package testes;
 
public class PJ extends Cliente{
    private String cnpj;

    public PJ(long codigo,String cnpj) {
        super(codigo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String todosDados(){
        return "Codigo:"+getCodigo() + "CNPJ" + getCnpj();
   
}
}
