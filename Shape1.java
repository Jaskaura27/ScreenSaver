import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Shape1 {
    private double x, y, r;
    private Color col;

    /*
    *Constructor
    */
    public Shape1(int x, int y, int r){
      this.x=x;
      this.y=y;
      this.r=r;

      this.col=new Color((int)(Math.random()*0x1000000));

    }


    /*
    Draw the shape1.
    */
    public void draw(Graphics2D g2){
      // create a horizontal ellipse and then draw it
      Ellipse2D.Double ell=new Ellipse2D.Double(x-2*r,y-r,4*r,2*r);
      g2.setColor(col);
      g2.fill(ell);
    }



    /*
    Returns the private variable x.
    */
    public double getX(){
      return x;
    }


    /*
    Returns the private variable y.
    */
    public double getY(){
      return y;
    }

    /*
    Returns the private variable r (radius).
    */
    public double getR(){
      return r;
    }


    /*
    Returns the private variable col.
    */
    public Color getCol(){
      return col;
    }

    /*
    reset the private variable x.
    */
    public void setX(Double x){
      this.x=x;
    }


    /*
    reset the private variable y.
    */
    public void setY(Double y){
      this.y=y;
    }
    
 }