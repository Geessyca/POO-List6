package testes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;

import listaPoo.CadastraPF;

public class MostraDados extends JDialog{
        JButton jbtFechar;
	JTextArea jtaTDados;
	Vector<Cliente> clientes;
	public MostraDados(Vector<Cliente> c) {
		clientes = c;
		getContentPane().setLayout(null);
		setTitle("Dados Gerais");
		Handler obj = new Handler(); 
		jbtFechar = new JButton("Voltar");
		jbtFechar.setBounds(10, 10, 100, 40);
		jbtFechar.addActionListener(obj);
		add(jbtFechar);
		jtaTDados = new JTextArea();
		jtaTDados.setBounds(50, 100, 350, 200);
		jtaTDados.setText(dadosFormatados());
		add(jtaTDados);
		setBounds(120,120,450,450);
		setVisible(true);
		setModal(true);
	}

	public String dadosFormatados() {
		String m = "";
		for(int i=0;i<clientes.size();i++) {
			m = m + "\n" + clientes.get(i).todosDados();
		}
		return m;
	}
	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jbtFechar) {

				setVisible(false);
			}
		}
	}
}
