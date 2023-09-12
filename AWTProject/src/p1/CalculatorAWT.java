package p1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorAWT extends JFrame implements ActionListener
{
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JLabel l;
	
	public CalculatorAWT()
	{
		setTitle("My Web");
		setSize(700,700);
		setLayout(new FlowLayout());
		setVisible(true);
		
		l=new JLabel();
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("Add");
		b2=new JButton("Sub");
		b3=new JButton("Mul");
		b4=new JButton("Div");
		b5=new JButton("Clear");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(l);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public static void main(String[] args)
	{
		new CalculatorAWT();
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		
		if(ae.getSource()==b1)
		{
			int sum=num1+num2;
			l.setText(sum+" ");
		}
		else if(ae.getSource()==b2)
		{
			int sub=num1-num2;
			l.setText(sub+" ");
		}
		else if(ae.getSource()==b3)
		{
			int mul=num1*num2;
			l.setText(mul+" ");
		}
		else if(ae.getSource()==b4)
		{
			int div=num1/num2;
			int re=num1%num2;
			l.setText(div+" "+re+" ");
		}
		else if(ae.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			l.setText("");
		}
	}
	}

