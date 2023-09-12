package p1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorAWT extends JFrame implements ActionListener 
{
	JButton b1;
	JButton b2;
	JButton b3;
	
	public ColorAWT()
	{
		b1=new JButton("Red");
		b2=new JButton("Green");
		b3=new JButton("Blue");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String click=ae.getActionCommand();
		System.out.println(click+"clicked");
		if(ae.getSource()==b1)
		{
			getContentPane().setBackground(Color.red);
		}
		else if(ae.getSource()==b2)
		{
			getContentPane().setBackground(Color.green);
		}
		else if(ae.getSource()==b3)
		{
			getContentPane().setBackground(Color.blue);
		}
		
	}

}
