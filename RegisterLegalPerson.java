package List6;
import javax.swing.*;
import java.awt.event.*;
public class RegisterLegalPerson extends JDialog{
    JButton buttonRegistration,buttonToBack;
    JTextField fieldCode, fieldCnpj;
    JLabel labelCode, labelCnpj;
    Main main;
    Handler handleClick = new Handler();
    public RegisterLegalPerson(Main main){
        this.main = main;
        getContentPane().setLayout(null);
		setTitle("Registrar pessoa juridica");
		int[] buttonRegistrationSize  = {10,10,150,30};
		buttonRegistration = SwingUtils.createButton(handleClick,"Cadastrar", buttonRegistrationSize);
        add(buttonRegistration);
        
        int[] buttonToBackSize  = {10,60,150,30};
        buttonToBack = SwingUtils.createButton(handleClick,"Voltar", buttonToBackSize);
        add(buttonToBack);

        int[] fieldCnpjSize  = {25,125,150,30};
        fieldCnpj = SwingUtils.createTextField(fieldCnpjSize);
        add(fieldCnpj);

        int[] fieldCodeSize  = {25,200,150,30};
        fieldCode = SwingUtils.createTextField(fieldCodeSize);
        add(fieldCode);
        
        int[] labelCnpjSize  = {25,100,150,30};
        labelCnpj = SwingUtils.createLabel("CNPJ:",labelCnpjSize);
        add(labelCnpj);

        
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
                    LegalPerson aux =  new LegalPerson(Long.parseLong(fieldCode.getText()),fieldCnpj.getText());
                    main.register(aux);
                    fieldCode.setText("");
                    fieldCnpj.setText("");
                }
            }
        }
}