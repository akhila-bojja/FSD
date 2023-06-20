import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="pgm1" height=500 width=700>
</applet>
*/
public class pgm1 extends JApplet implements ActionListener
{
JButton b1,b2;
JTextField t1,t2;
JLabel l1,l2,l3,l4,msg;
Container cp;
JRadioButton r1,r2,r3;
JCheckBox ch1,ch2,ch3;
String str,x1,x2;
ButtonGroup bg,bg1;
JPanel p1,p2,p3,p4,p5,p6;
public void init()
{
cp=getContentPane();
cp.setLayout(new GridLayout(7,1));
p1=new JPanel();
p1.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
p2=new JPanel();
p2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
p3=new JPanel();
p3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
p4=new JPanel();
p4.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
p5=new JPanel();
p5.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
p6=new JPanel();
p6.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
cp.add(p1);
cp.add(p2);
cp.add(p3);
cp.add(p4);
cp.add(p5);
cp.add(p6);
l1=new JLabel("Enter your Name");
t1=new JTextField(20);
l2=new JLabel("Enter your Age");
t2=new JTextField(20);
bg=new ButtonGroup();
l3=new JLabel("Enter your City");
r1=new JRadioButton("Madurai");
r2=new JRadioButton("Chennai");
r3=new JRadioButton("Trichy");
bg.add(r1);
bg.add(r2);
bg.add(r3);
bg1=new ButtonGroup();
l4=new JLabel("Select your software");
ch1=new JCheckBox("C");
ch2=new JCheckBox("C++");
ch3=new JCheckBox("Java");
bg1.add(ch1);
bg1.add(ch2);
bg1.add(ch3);
b1=new JButton("OK");
b2=new JButton("CANCEL");
b1.addActionListener(this);
b2.addActionListener(this);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
ch1.addActionListener(this);
ch2.addActionListener(this);
ch3.addActionListener(this);
msg=new JLabel("");
p6.add(msg);
p1.add(l1);
p1.add(t1);
p2.add(l2);
p2.add(t2);
p3.add(l3);
p3.add(r1);
p3.add(r2);
p3.add(r3);
p4.add(l4);
p4.add(ch1);
p4.add(ch2);
p4.add(ch3);
p5.add(b1);
p5.add(b2);
msg=new JLabel("");
p6.add(msg);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
if(r1.isSelected()==true)
{
x1=r1.getText();
}
else if(r2.isSelected()==true)
{
x1=r2.getText();
}
else if(r3.isSelected()==true)
{
x1=r3.getText();
}
str=" from the city:"+x1;
if(ch1.isSelected()==true)
{
x2=ch1.getText();
}
if(ch2.isSelected()==true)
{
x2+=","+ch2.getText();
}
if(ch3.isSelected()==true)
{
x2+=" ,"+ch3.getText();
}
str+=" and You have Selected:"+x2;
msg.setText("Welcome!!"+t1.getText()+" ("+t2.getText()+" )"+str);
}
if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
ch1.setSelected(false);
ch2.setSelected(false);
ch3.setSelected(false);
r1.setSelected(false);
r2.setSelected(false);
r3.setSelected(false);
msg.setText("Your Registration is Cancelled");
}
}
}



