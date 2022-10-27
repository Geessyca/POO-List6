package List6;
import javax.swing.*;
import java.awt.event.*;

public class RegisterPhysicalPerson extends JDialog{
    JButton buttonRegistration,buttonToBack;
    JTextField fieldCode, fieldCpf;
    JLabel labelCode, labelCpf;
    Main main;
    Handler handleClick = new Handler();
    public RegisterPhysicalPerson(Main main){
        this.main = main;
        getContentPane().setLayout(null);

		setTitle("Registrar pessoa fisica");    
			int[] buttonRegistrationSize  = {10,10,150,30};
			buttonRegistration = SwingUtils.createButton(handleClick,"Cadastrar", buttonRegistrationSize);
	        add(buttonRegistration);
	        
	        int[] buttonToBackSize  = {10,60,150,30};
	        buttonToBack = SwingUtils.createButton(handleClick,"Voltar", buttonToBackSize);
	        add(buttonToBack);

	        int[] fieldCpfSize  = {25,125,150,30};
	        fieldCpf = SwingUtils.createTextField(fieldCpfSize);
	        add(fieldCpf);

	        int[] fieldCodeSize  = {25,200,150,30};
	        fieldCode = SwingUtils.createTextField(fieldCodeSize);
	        add(fieldCode);
	        
	        int[] labelCpfSize  = {25,100,150,30};
	        labelCpf = SwingUtils.createLabel("CPF:",labelCpfSize);
	        add(labelCpf);

	        
	        int[] labelCodeSize  = {25,175,150,30};
	        labelCode = SwingUtils.createLabel("Codigo:",labelCodeSize);
	        add(labelCode);
	        
            setBounds(10,10,300,300);
    }
    public class Handler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource()== buttonToBack){
                    main.screenMain();
                }
                if(e.getSource()== buttonRegistration){
                    PhysicalPerson aux =  new PhysicalPerson(Long.parseLong(fieldCode.getText()),fieldCpf.getText());
                    main.register(aux);
                    fieldCode.setText("");
                    fieldCpf.setText("");
                }
            }
        }
}
