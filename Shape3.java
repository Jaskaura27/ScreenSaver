import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Shape3 extends Shape2{
    public Shape3(int x, int y, int r){
        super(x, y, r);
    }
   

    @Override    
    public void draw(Graphics2D g2){
        // create and draw a square then invoke the super class draw(...)
        double x=getX();
        double y=getY();
        double r=getR();
        Color col=getCol();

        Rectangle2D rect = new Rectangle2D.Double(x-3*r/2,y-3*r/2,3*r,3*r);
        g2.setColor(col);
        g2.fill(rect);

        // method to draw the vertical and horizontal ellipse.
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

    public void setX(Double x){
        super.setX(x);
    }

    public void setY(Double y){
        super.setY(y);
    }

}