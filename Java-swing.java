
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calcu extends JFrame{
 public double fn,ln,result;
  public int op;

public Calc(){
                JPanel jp= new JPanel();



                JTextField jt=new JTextField(12);
                JButton one=new JButton("1");
                JButton two=new JButton("2"); 
                JButton three=new JButton("3");
                JButton mul=new JButton("*");
                JButton four=new JButton("4");
                JButton five=new JButton("5");
                JButton six=new JButton("6");
                JButton div=new JButton("/");
                JButton seven=new JButton("7");
                JButton eight=new JButton("8");
                JButton nine=new JButton("9");
                JButton pl=new JButton("+");
                JButton zero=new JButton("0");
                JButton neg=new JButton("-");
                JButton eq=new JButton("=");
                JButton dec=new JButton(".");
                JButton clr=new JButton("CLEAR");
                jp.add(jt);


// ...........................start of initialization of text field...................



one.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"1");


}
});
two.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"2");


}
});
three.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"3");


}
});
four.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"4");


}
});
five.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"5");


}
});
six.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"6");


}
});
seven.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"7");


}
});
eight.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"8");


}
});
nine.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"9");


}
});
zero.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

jt.setText(jt.getText()+"0");


}
});
dec.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
jt.setText(jt.getText()+".");


}
});

//.................................end of initialization..........................
//........................operations.....................................




pl.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

fn=Double.parseDouble(jt.getText());
op=1;
jt.setText("");


}
});

mul.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

fn=Double.parseDouble(jt.getText());
op=2;
jt.setText("");

}
});

neg.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

fn=Double.parseDouble(jt.getText());
op=3;
jt.setText("");


}
});
div.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

fn=Double.parseDouble(jt.getText());
op=4;
jt.setText("");


}
});

eq.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){

ln=Double.parseDouble(jt.getText());
switch(op)
            {
                case 1: result=fn+ln;
                    break;
        
                case 2: result=fn*ln;
                    break;
        
                case 3: result=fn-ln;
                    break;
        
                case 4: result=fn/ln;
                    break;
        
                default: result=0;
            }
        
            jt.setText(""+result);

}
});

clr.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
jt.setText("");


}
});



//........................end of operations.....................................


                jp.add(one);  
                jp.add(two);
                jp.add(three);
                jp.add(mul);
                jp.add(four);
                jp.add(five);
                jp.add(six);
                jp.add(div);
                jp.add(seven);
                jp.add(eight);
                jp.add(nine);
                jp.add(pl);
                jp.add(zero);
                jp.add(eq);
                jp.add(neg);
                jp.add(dec);
                jp.add(clr);
              
                add(jp);
                setTitle("CALCULATOR");
                setVisible(true);    
                setSize(200,250);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                       }
public static void main (String args[]){
                       new Calcu();
}
}
