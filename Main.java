import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame j;
    JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,a0;
    JButton add,sub,mul,div,eq,point,del,clr;
    JTextField screen;
    double a,b,result=0;
    int o;


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==a0)
        {
            screen.setText(screen.getText()+"0");
        }
        if(e.getSource()==a1)
        {
            screen.setText(screen.getText()+"1");
        }
        if(e.getSource()==a2)
        {
            screen.setText(screen.getText()+"2");
        }
        if(e.getSource()==a3)
        {
            screen.setText(screen.getText()+"3");
        }
        if(e.getSource()==a4)
        {
            screen.setText(screen.getText()+"4");
        }
        if(e.getSource()==a5)
        {
            screen.setText(screen.getText()+"5");
        }
        if(e.getSource()==a6)
        {
            screen.setText(screen.getText()+"6");
        }
        if(e.getSource()==a7)
        {
            screen.setText(screen.getText()+"7");
        }
        if(e.getSource()==a8)
        {
            screen.setText(screen.getText()+"8");
        }
        if(e.getSource()==a9)
        {
            screen.setText(screen.getText()+"9");
        }
        if(e.getSource()==point)
        {
            screen.setText(screen.getText()+".");
        }
        if(e.getSource()==add)
        {
            String x=screen.getText();
            a=Double.parseDouble(x);
            o=1;
            screen.setText("");
        }
        if(e.getSource()==sub)
        {
            String x=screen.getText();
            a=Double.parseDouble(x);
            screen.setText("");
            o=2;
        }
        if(e.getSource()==mul)
        {
            String x=screen.getText();
            a=Double.parseDouble(x);
            screen.setText("");
            o=3;
        }
        if(e.getSource()==div)
        {
            String x=screen.getText();
            a=Double.parseDouble(x);
            screen.setText("");
            o=4;
        }
        if(e.getSource()==clr)
        {
            screen.setText("");
        }
        if(e.getSource()==eq)
        {
            switch (o){
                case 1:
                    b=Double.parseDouble(screen.getText());
                    result=a+b;
                    screen.setText(""+result);
                    break;
                case 2:
                    b=Double.parseDouble(screen.getText());
                    result=a-b;
                    screen.setText(""+result);
                    break;
                case 3:
                    b=Double.parseDouble(screen.getText());
                    result=a*b;
                    screen.setText(""+result);
                    break;
                case 4:
                    b=Double.parseDouble(screen.getText());
                    result=a/b;
                    screen.setText(""+result);
                    break;
            }
        }
    }
    public Main(){
        //declare
        j=new JFrame();
        a0=new JButton("0");
        a1=new JButton("1");
        a2=new JButton("2");
        a3=new JButton("3");
        a4=new JButton("4");
        a5=new JButton("5");
        a6=new JButton("6");
        a7=new JButton("7");
        a8=new JButton("8");
        a9=new JButton("9");
        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("x");
        div=new JButton("/");
        eq=new JButton("=");
        point=new JButton(".");
        del=new JButton("Delete");
        clr=new JButton("Clear");
        screen =new JFormattedTextField();

        //size__location
        j.setBounds(100,100,800,800);
        screen.setBounds(100,50,400,100);

        a7.setBounds(100,150,100,100);
        a8.setBounds(200,150,100,100);
        a9.setBounds(300,150,100,100);
        add.setBounds(400,150,100,100);
        a4.setBounds(100,250,100,100);
        a5.setBounds(200,250,100,100);
        a6.setBounds(300,250,100,100);
        sub.setBounds(400,250,100,100);
        a1.setBounds(100,350,100,100);
        a2.setBounds(200,350,100,100);
        a3.setBounds(300,350,100,100);
        mul.setBounds(400,350,100,100);
        a0.setBounds(100,450,100,100);
        point.setBounds(200,450,100,100);
        eq.setBounds(300,450,100,100);
        div.setBounds(400,450,100,100);
        clr.setBounds(100,550,100,100);

        //add
        j.add(screen);
        j.add(a0);
        j.add(a1);
        j.add(a2);
        j.add(a3);
        j.add(a4);
        j.add(a5);
        j.add(a6);
        j.add(a7);
        j.add(a8);
        j.add(a9);
        j.add(point);
        j.add(eq);
        j.add(add);
        j.add(sub);
        j.add(mul);
        j.add(div);
        j.add(clr);

        //action
        a0.addActionListener(this);
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        eq.addActionListener(this);
        point.addActionListener(this);
        clr.addActionListener(this);

        //default
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}