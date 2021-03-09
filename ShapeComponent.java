import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
*/
public class ShapeComponent extends JComponent
{  
	private ArrayList<Shape3Animated> shapeList;

	public ShapeComponent(){
		Scanner sca=new Scanner(System.in);
		shapeList=fillShapeList();

		new Timer(100, (ActionEvent e) -> {
            repaint();
        }).start();
	}

	private ArrayList<Shape3Animated> fillShapeList() {
		ArrayList<Shape3Animated> arr=new ArrayList<Shape3Animated>();
		
		int a=0;

		int x,y,r,VerticleVelocity,HorizontalVelocity,VerticleDirection,HorizentalDirection;
		Random random=new Random();

		while(a<15){
			r=random.nextInt(21)+10;
			x = random.nextInt(1000-(4*r))+(2*r);
			y = random.nextInt(700-(4*r))+(2*r);
			VerticleVelocity = random.nextInt(10)+1;
			HorizontalVelocity = random.nextInt(10)+1;
			VerticleDirection = random.nextInt(2)+1;
			HorizentalDirection = random.nextInt(2)+1;
			Shape3Animated sha =new Shape3Animated(x, y, r, HorizentalDirection, VerticleDirection, HorizontalVelocity, VerticleVelocity);
			arr.add(sha);
			a++;


		}


		return arr;
	}

	public void paintComponent(Graphics g)
	{  
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
	
		// Create your test cases here
		g2.drawLine(1000, 0, 1000, 700);
		g2.drawLine(0,700,1000,700);
		shapeList.forEach((sha)->sha.draw(g2));


		
	  
	}
}
