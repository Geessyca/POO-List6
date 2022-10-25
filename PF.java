package testes;
 
public class PF extends Cliente{

    public PF(double alt,double larg) {
    	this.alt = alt;
        this.larg = larg;
    }
    public double getCpf() {
        return cpf;
    }
    
    public String todosDados(){
        return "Codigo:"+getCodigo() + " CPF:" + getCpf();
    }
}
