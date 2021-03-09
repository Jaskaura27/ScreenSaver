import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Shape2 extends Shape1{
    
    public Shape2(int x, int y, int r){
      super(x,y,r);
    }

    @Override
    public void draw(Graphics2D g2){
      // create and draw a vertical ellipse, and then invoke the superclass
      double x=getX();
      double y=getY();
      double r=getR();
      Color col=getCol();

      Ellipse2D.Double ell=new Ellipse2D.Double(x-r,y-2*r,2*r,4*r);
      g2.setColor(col);
      g2.fill(ell);

      // draw(...) method to draw the horizontal ellipse.
      super.draw(g2);

        
    }

    public double getX(){
      return super.getX();
    }

    public double getY(){
      return super.getY();
    }

    public double getR(){
      return super.getR();
    }

    public Color getCol(){
      return super.getCol();
    }
    public void setX(Double x){
      super.setX(x);
    }

    public void setY(Double y){
      super.setY(y);
    }
  }