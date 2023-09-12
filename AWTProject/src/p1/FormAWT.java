package p1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormAWT extends JFrame implements ActionListener 
{
	JButton b1,b2;
	JTextField t1,t2;
	JLabel l1,l2,l3;
	
	public FormAWT()
	{
		setTitle("Login");
		setSize(400,400);
		getContentPane().setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		l2=new JLabel("Username:");
		l2.setBounds(30,30,100,30);
		add(l2);
		
		l3=new JLabel("Password:");
		l3.setBounds(30,70,100,30);
		add(l3);
		
		t1=new JTextField();
		t1.setBounds(200,30,150,30);
		t1.setColumns(10);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(200,70,150,30);
		t2.setColumns(10);
		add(t2);
		
		b1=new JButton("Login");
		b1.setBounds(30,110,150,30);
		add(b1);
		
		b2=new JButton("Reset");
		b2.setBounds(200,110,150,30);
		add(b2);
		
		l1=new JLabel();
		l1.setBounds(30,150,300,50);
		add(l1);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
		public static void main(String[] args) {
		new FormAWT();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=t1.getText();
		String s2=t2.getText();
		
		if(e.getSource()==b1)
		{
			l1.setText(s1+" "+s2);
			
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
	
	}

}
