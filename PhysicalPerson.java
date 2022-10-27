package List6;
 
public class PhysicalPerson extends Client{
	private String cpf;

	public PhysicalPerson(long codigo,String cpf) {
		 super(codigo);
	     this.cpf = cpf;
    }
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    public String todosDados(){
        return "Codigo:"+getClientCode() + " CPF:" + getCpf();
    }
}
