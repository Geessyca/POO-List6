package testes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class Main extends JFrame{
	JButton jbtPF, jbtPJ,jbtDad;
        Vector <Cliente> meusclientes = new Vector<Cliente>();
        CadastraPJ pj = new CadastraPJ(this);
        CadastraPF pf = new CadastraPF(this);
        
	public Main(){
		getContentPane().setLayout(null);
		setTitle("Tela Principal");
		Handler obj = new Handler();
		
                
                jbtDad = new JButton("Todos Cadastros");
                jbtDad.setBounds(10,110,150,30);
                jbtDad.addActionListener(obj);
                add(jbtDad);
                
                jbtPF = new JButton("Pessoa Fisica");
                jbtPF.setBounds(10,10,150,30);
                jbtPF.addActionListener(obj);
                add(jbtPF);
                jbtPJ = new JButton("Pessoa Juridica");
                jbtPJ.setBounds(10,60,150,30);
                jbtPJ.addActionListener(obj);
                add(jbtPJ);
                setBounds(10,10,300,300);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void cadastra(Cliente c){
            meusclientes.add(c);
        }
        public void showPrincipal(){
            pf.setVisible(false);
            pj.setVisible(false);
        }
        public void showCadastraPJ(){
            pf.setVisible(false);
            pj.setVisible(true);
        }
        public void showCadastraPF(){
            pf.setVisible(true);
            pj.setVisible(false);
        }
        public void TodosCadastros(){
            
            pf.setVisible(false);
            pj.setVisible(false);
        }
        public class Handler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==jbtPF){
                    showCadastraPF();
                }
                if(e.getSource()==jbtPJ){
                    showCadastraPF();
                }
                if(e.getSource()==jbtDad){
                   new MostraDados(meusclientes);
                }
            }
        }
        public static void main(String[] args) {
            new Main();
        }

}