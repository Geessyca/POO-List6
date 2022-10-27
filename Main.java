package List6;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
public class Main extends JFrame{
	JButton buttonPhysicalPerson, buttonLegalPerson,buttonAllRegistration;
        Vector <Client> myCustomers = new Vector<Client>();
        RegisterLegalPerson legalPerson = new RegisterLegalPerson(this);
        RegisterPhysicalPerson physicalPerson = new RegisterPhysicalPerson(this);
        
	public Main(){
		getContentPane().setLayout(null);
		setTitle("Gerenciamento de clientes");
		Handler handleClick = new Handler();
		
				int[] buttonAllRegistrationSize  = {10,110,150,30};
                buttonAllRegistration = SwingUtils.createButton(handleClick,"Todos Cadastros", buttonAllRegistrationSize);
                add(buttonAllRegistration);
                
                int[] buttonPhysicalPersonSize  = {10,10,150,30};
                buttonPhysicalPerson = SwingUtils.createButton(handleClick,"Pessoa Fisica", buttonPhysicalPersonSize);
                add(buttonPhysicalPerson);
                
                int[] buttonLegalPersonSize  = {10,60,150,30};
                buttonLegalPerson = SwingUtils.createButton(handleClick,"Pessoa Juridica", buttonLegalPersonSize);
                add(buttonLegalPerson);


                setBounds(10,10,300,300);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void register(Client customer){
            myCustomers.add(customer);
        }
        public void screenMain(){
            physicalPerson.setVisible(false);
            legalPerson.setVisible(false);
        }
        public void screenAllRegistration(){
            physicalPerson.setVisible(false);
            legalPerson.setVisible(false);
        }
        public class Handler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttonPhysicalPerson){
                	physicalPerson.setVisible(true);
                    legalPerson.setVisible(false);
                }
                if(e.getSource()==buttonLegalPerson){
                    physicalPerson.setVisible(false);
                    legalPerson.setVisible(true);
                }
                if(e.getSource()==buttonAllRegistration){
                   new ShowData(myCustomers);
                }
            }
        }
        public static void main(String[] args) {
            new Main();
        }

}