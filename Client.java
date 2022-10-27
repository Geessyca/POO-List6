package List6;

public abstract class Client {
    private long clientCode;

    public Client(long clientCode) {
        this.clientCode = clientCode;
    }
    public long getClientCode() {
        return clientCode;
    }
    public void setClientCode(long clientCode) {
    	this.clientCode = clientCode;
    }
	public abstract String allCustomerData();
        
}
