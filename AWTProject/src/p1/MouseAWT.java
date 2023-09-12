

package p1;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAWT extends JFrame 
{
	JLabel l;
	public MouseAWT()
	{
		setVisible(true);
		setSize(600,600);
		l=new JLabel("Mouse Game");
		setLayout(null);
		l.setBounds(20,20,100,100);
		add(l);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				int a=me.getX();
				int b=me.getY();
				l.setText("X:"+a+" "+"Y:"+b);
			}
		});
		}
		

	public static void main(String[] args) {
		new MouseAWT();

	}

}
