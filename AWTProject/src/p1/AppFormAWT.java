package p1;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class AppFormAWT extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JRadioButton r1;
	JRadioButton r2;
	Choice c;
	
	public AppFormAWT()
	{
		setTitle("StudentsApplicationForm");
		setLayout(null);
		//setLayout(new FlowLayout());
		setSize(700,700);
		ImageIcon icon=new ImageIcon("image");
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		l1=new JLabel("Application form");
		l1.setBounds(300,10,150,30);
		add(l1);
		
		l2=new JLabel("First Name");
		l2.setBounds(30,100,180,30);
		add(l2);
		
		l3=new JLabel("Last Name");
		l3.setBounds(300,100,180,30);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(30,135,250,30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(300,135,250,30);
		add(t2);
		
		l4=new JLabel("Gender");
		l4.setBounds(30,170,100,30);
		add(l4);
		
		r1=new JRadioButton("Male");
		r1.setBounds(110,170,100,30);
		add(r1);
		
		r2=new JRadioButton("Female");
		r2.setBounds(210,170,100,30);
		add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		l5=new JLabel("Father's Name");
		l5.setBounds(30,210,100,30);
		add(l5);
		
		l6=new JLabel("Mother's Name");
		l6.setBounds(300,210,100,30);
		add(l6);
		
		t3=new JTextField();
		t3.setBounds(30,250,250,30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(300,250,250,30);
		add(t4);
		
		l7=new JLabel("Address");
		l7.setBounds(30,290,100,30);
		add(l7);
		
		t5=new JTextField();
		t5.setBounds(30,325,250,30);
		add(t5);
		
		t6=new JTextField();
		t6.setBounds(300,325,250,30);
		add(t6);
		
		l8=new JLabel("Phone");
		l8.setBounds(30,370,100,30);
		add(l8);
		
		t7=new JTextField();
		t7.setBounds(30,405,250,30);
		add(t7);
		
		t8=new JTextField();
		t8.setBounds(300,405,250,30);
		add(t8);
		
		
		l9=new JLabel("Qualification");
		l9.setBounds(30,445,100,30);
		add(l9);
		
		l10=new JLabel("Course");
		l10.setBounds(300,445,100,30);
		add(l10);
		
		t9=new JTextField();
		t9.setBounds(300,480,250,30);
		add(t9);
		
		c=new Choice();
		c.add("select");
		c.add("Matriculate");
		c.add("Intermediate");
		c.add("Graduate");
		c.add("Post Graduate");
		c.setBounds(140,445,100,30);
		add(c);
		
		b1=new JButton("Submit");
		b1.setBounds(30,520,100,30);
		add(b1);
		
		b2=new JButton("Clear");
		b2.setBounds(140,520,100,30);
		add(b2);
		
		b3=new JButton("Red");
		b3.setBounds(250,520,100,30);
		add(b3);
		b4=new JButton("Green");
		b4.setBounds(360,520,100,30);
		add(b4);
		b5=new JButton("Blue");
		b5.setBounds(470,520,100,30);
		add(b5);
	
		l11=new JLabel();
		l11.setBounds(30,560,700,100);
		add(l11);
		
		t10=new JTextField();
		t10.setBounds(30,560,700,100);
		add(t10);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		r1.addActionListener(this);
		r2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new AppFormAWT();

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String name=t1.getText();
			String fname=t2.getText();
			String gender="";
			if(r1.isSelected())
			{
				gender="Male";
			}
			else if(r2.isSelected())
			{
				gender="Female";
			}
			String fathname=t3.getText();
			String mothername=t4.getText();
			String address=t5.getText();
			String phone=t7.getText();
			String qualification=c.getSelectedItem();
			
			l11.setText(name+" "+fname+" "+gender+" "+fathname+" "+mothername+" "+address+" "+phone+" "+qualification+" ");
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
		}
		else if(e.getSource()==b3)
		{
			getContentPane().setBackground(Color.red);
		}
		else if(e.getSource()==b4)
		{
			getContentPane().setBackground(Color.green);
		}
		else if(e.getSource()==b5)
		{
			getContentPane().setBackground(Color.blue);
		}
	}
	
}
