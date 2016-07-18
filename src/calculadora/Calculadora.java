package calculadora;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author igor_
 */
public class Calculadora extends JFrame{
    private int num1=0, num2=0;
    float resultado=0;
    private char operacao='a';
    
    private static String labelPrefix = "Soma:   ";
    final JLabel lblMsg = new JLabel(labelPrefix);
    final JButton btn0 = new JButton("0");
    final JButton btn1 = new JButton("1");
    final JButton btn2 = new JButton("2");
    final JButton btn3 = new JButton("3");
    final JButton btn4 = new JButton("4");
    final JButton btn5 = new JButton("5");
    final JButton btn6 = new JButton("6");
    final JButton btn7 = new JButton("7");
    final JButton btn8 = new JButton("8");
    final JButton btn9 = new JButton("9");
    final JButton btnDiv = new JButton("/");
    final JButton btnMult = new JButton("*");
    final JButton btnSub = new JButton("-");
    final JButton btnSoma = new JButton("+");
    final JButton btnIgual = new JButton("=");
    final JButton btnLimpa = new JButton("C");
    
    JPanel painel = new JPanel();
    
    public Calculadora (String titulo){
        setTitle(titulo);
        setSize(300,200);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.add(lblMsg);
        painel.add(btn0);
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(btn4);
        painel.add(btn5);
        painel.add(btn6);
        painel.add(btn7);
        painel.add(btn8);
        painel.add(btn9);        
        painel.add(btnDiv);
        painel.add(btnMult);
        painel.add(btnSub);
        painel.add(btnSoma);
        painel.add(btnIgual);
        painel.add(btnLimpa);
        add(painel);
        
        setVisible(true);
        
        btn0.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn0_actionPerformed(e);
            }    
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn1_actionPerformed(e);
            }    
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn2_actionPerformed(e);
            }    
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn3_actionPerformed(e);
            }    
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn4_actionPerformed(e);
            }    
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn5_actionPerformed(e);
            }    
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn6_actionPerformed(e);
            }    
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn7_actionPerformed(e);
            }    
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn8_actionPerformed(e);
            }    
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btn9_actionPerformed(e);
            }    
        });        
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnSoma_actionPerformed(e);
            }    
        });
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnSub_actionPerformed(e);
            }    
        });
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnMult_actionPerformed(e);
            }    
        });
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnDiv_actionPerformed(e);
            }    
        });        
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnIgual_actionPerformed(e);
            }    
        });                
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                btnLimpa_actionPerformed(e);
            }    
        });                
    }
    public void btn0_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=0;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=0;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }            
    }
    public void btn1_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=1;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=1;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btn2_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=2;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=2;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }            
    }
    public void btn3_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=3;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=3;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                 
    }
    public void btn4_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=4;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=4;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btn5_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=5;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=5;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }           
    }
    public void btn6_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=6;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=6;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btn7_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=7;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=7;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btn8_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=8;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=8;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btn9_actionPerformed(java.awt.event.ActionEvent e){
        if (operacao == 'a'){        
            num1=9;
            lblMsg.setText(labelPrefix + num1);        
        }
        else{
            num2=9;
            lblMsg.setText(labelPrefix + num1 + operacao + num2 );
        }                  
    }
    public void btnSoma_actionPerformed(java.awt.event.ActionEvent e){
        operacao='+';
        lblMsg.setText(labelPrefix + num1 + operacao);        
    }
    public void btnSub_actionPerformed(java.awt.event.ActionEvent e){
        operacao='-';
        lblMsg.setText(labelPrefix + num1 + operacao);        
    }
    public void btnMult_actionPerformed(java.awt.event.ActionEvent e){
        operacao='*';
        lblMsg.setText(labelPrefix + num1 + operacao);        
    }
    public void btnDiv_actionPerformed(java.awt.event.ActionEvent e){
        operacao='/';
        lblMsg.setText(labelPrefix + num1 + operacao);        
    }
    public void btnIgual_actionPerformed(java.awt.event.ActionEvent e){
        switch(operacao){
            case '+':
                resultado=num1+num2;
                break;
            case '-':
                resultado=num1-num2;
                break;
            case '*':
                resultado=num1*num2;
                break;
            case '/':                
                if(num2==0){                    
                    break;
                }
                else{
                    resultado=(float)num1/num2;
                    break;
                }                
        }
        if ((num2==0) && (operacao=='/')){
            lblMsg.setText(labelPrefix + "Erro!");            
        }    
        else{
            lblMsg.setText(labelPrefix + num1 + operacao + num2 + "=" + resultado);
        }
    }
    public void btnLimpa_actionPerformed(java.awt.event.ActionEvent e){
        num1=0;
        num2=0;
        operacao='a';
        lblMsg.setText(labelPrefix);        
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora("Calculadora");
    }    
}