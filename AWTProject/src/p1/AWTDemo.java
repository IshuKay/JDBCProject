
package p1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AWTDemo extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1;
	JLabel l;
	JRadioButton r1;
	JRadioButton r2;
	JCheckBox c1;
	JCheckBox c2;
	
	public AWTDemo()
	{
		setTitle("my web");
		setLayout(new FlowLayout());//showing multiple label
		
		l=new JLabel();
		t1=new JTextField(20);
		
		b1=new JButton("Submit");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		c1=new JCheckBox("Imphal");
		c2=new JCheckBox("Thoubal");
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(r1);
		bg.add(r2);
		
		add(t1);
		
		add(r1);
		add(r2);
		
		ButtonGroup bg1=new ButtonGroup();


		bg1.add(c1);
		bg1.add(c2);
		add(c1);
		add(c2);
		add(b1);
		
		add(l);
		
		b1.addActionListener(this);
		
		
		ImageIcon icon=new ImageIcon("image/camera.jpg");
		setIconImage(icon.getImage());
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminate the app

	}
	public void actionPerformed(ActionEvent ae)
	{
		String name=t1.getText();
		if(r1.isSelected())
		{
			name=name+" is Male";
		}
		if(r2.isSelected())
		{
			name=name+"is Female";
		}
		if(c1.isSelected())
		{
			name=name+" from Imphal";
		}
		if(c2.isSelected())
		{
			name=name+" from Thoubal";
		}
		l.setText(name);
	}
	}


