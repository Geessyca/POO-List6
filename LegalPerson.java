package List6;
 
public  class LegalPerson extends Client{
    private String cnpj;

    public LegalPerson(long codigo,String cnpj) {
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
        return "Codigo:"+getClientCode() + "CNPJ" + getCnpj();
   
    }
}