package testes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class CadastraPF extends JDialog{
    JButton jbtCad,jbtCan;
    JTextField jtfCodigo, jtfCpf;
    JLabel jlCodigo, jlCpf;
    Main pc;
    Handler obj = new Handler();
    public CadastraPF(Main pc){
        this.pc = pc;
        getContentPane().setLayout(null);
		setTitle("Tela PF");
                
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
                jtfCpf = new JTextField(); 
                jtfCpf.setText("");
                jtfCpf.setBounds(25,125,150,30);
                add(jtfCpf);
                jtfCodigo = new JTextField(); 
                jtfCodigo.setText("");
                jtfCodigo.setBounds(25,200,150,30);
                add(jtfCodigo);
                
                //TextLabel
                jlCpf = new JLabel(); 
                jlCpf.setText("CPF:");
                jlCpf.setBounds(25,100,150,30);
                add(jlCpf);
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
                    PF aux =  new PF(Long.parseLong(jtfCodigo.getText()),jtfCpf.getText());
                    pc.cadastra(aux);
                    jtfCodigo.setText("");
                    jtfCpf.setText("");
                }
            }
        }
}
