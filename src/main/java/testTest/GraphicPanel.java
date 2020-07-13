package testTest;

import java.awt.*;
import javax.swing.*;

public class GraphicPanel extends JPanel {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.GREEN);
		g.drawOval(20, 20, 150, 150);
		
		g.setColor(Color.RED);
		g.drawRect(180, 180, 300, 300);
		
	}
	


}
