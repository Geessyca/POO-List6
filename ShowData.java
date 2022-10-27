package List6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;

public class ShowData extends JDialog{
        JButton buttonToBack;
	JTextArea textArea;
	Vector<Client> client;
	public ShowData(Vector<Client> clients) {
		client = clients;
		getContentPane().setLayout(null);
		setTitle("Dados dos clientes");
		Handler handleClick = new Handler(); 
		 
        int[] buttonToBackSize  = {10, 10, 100, 40};
        buttonToBack = SwingUtils.createButton(handleClick,"Voltar", buttonToBackSize);
        add(buttonToBack);


        textArea = SwingUtils.createTextArea(formattedData());
        add(textArea);
       
		setBounds(120,120,450,450);
		setVisible(true);
		setModal(true);
	}

	public String formattedData() {
		String message = "";
		for(int i=0;i<client.size();i++) {
			message = message + "\n" + client.get(i).getClientCode();
		}
		return message;
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == buttonToBack) {
				setVisible(false);
			}
		}
	}
}
