package testTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITest extends JFrame implements ActionListener{
	
	private JButton b1,b2;
	GraphicPanel pa1;

	public static void main(String[] args) {
		new GUITest();

	}
	public GUITest() {
		super("Hallo Test");
		
		JPanel p1 =new JPanel();
		p1.add(b1=new JButton("Drücken"));
		p1.add(b2=new JButton("Färben"));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(p1,BorderLayout.SOUTH);
		add(pa1=new GraphicPanel(),BorderLayout.CENTER);
		
		setVisible(true);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			
			pa1.repaint();
		}if(e.getSource()==b2) {
			Color c= JColorChooser.showDialog(null, "Wähle eine Farbe", Color.RED);
			b1.setBackground(c);
			b2.setBackground(c);
			repaint();
		}
	}

}
