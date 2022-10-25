package testes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CadastraPJ extends JDialog{
    JButton jbtCad,jbtCan;
    JTextField jtfCodigo, jtfCnpj;
    JLabel jlCodigo, jlCnpj;
    Main pc;
    Handler obj = new Handler();
    public CadastraPJ(Main pc){
        this.pc = pc;
        getContentPane().setLayout(null);
		setTitle("Tela PJ");
                //Butoes
                jbtCad = new JButton("Cadastrar");
                jbtCad.setBounds(10,10,150,30);
                jbtCad.addActionListener(obj);
                add(jbtCad);
                jbtCan = new JButton("Cancelar");
                jbtCan.setBounds(10,60,150,30);
                jbtCan.addActionListener(obj);
                add(jbtCan);
                
                //TextField
                jtfCnpj = new JTextField(); 
                jtfCnpj.setText("");
                jtfCnpj.setBounds(25,125,150,30);
                add(jtfCnpj);
                jtfCodigo = new JTextField(); 
                jtfCodigo.setText("");
                jtfCodigo.setBounds(25,200,150,30);
                add(jtfCodigo);
                
                //TextLabel
                jlCnpj = new JLabel(); 
                jlCnpj.setText("CNPJ:");
                jlCnpj.setBounds(25,100,150,30);
                add(jlCnpj);
                jlCodigo = new JLabel(); 
                jlCodigo.setText("Codigo:");
                jlCodigo.setBounds(25,175,150,30);
                add(jlCodigo);
                
                setBounds(10,10,300,300);
    }
    public class Handler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource()== jbtCan){
                    pc.showPrincipal();
                }
                if(e.getSource()== jbtCad){
                    PJ aux =  new PJ(Long.parseLong(jtfCodigo.getText()),jtfCnpj.getText());
                    pc.cadastra(aux);
                    jtfCodigo.setText("");
                    jtfCnpj.setText("");
                }
            }
        }
}