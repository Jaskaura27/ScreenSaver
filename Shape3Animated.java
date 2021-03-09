import java.awt.Graphics2D;
public class Shape3Animated extends Shape3{
   
    private int HorizontalDirection; // a random direction.
    private int VerticleDirection;
    private int HorizontalVelocity;
    private int verticleVelocity;
    // a random velocity in pixel 
    // Add instance fields that required
    
    public Shape3Animated(int x, int y, int r, int Horizontaldirection, int VerticleDirection, int HorizontalVelocity, int verticleVelocity){
        super(x,y,r);
        this.VerticleDirection=VerticleDirection;
        this.HorizontalDirection=Horizontaldirection;
        this.HorizontalVelocity=HorizontalVelocity;
        this.verticleVelocity=verticleVelocity;
    }

    // moves the x or y coordinates of the shape based on direction 
    // and velocity
    public void move(){  
        double x=super.getX();
        double y=super.getY();
        double r=super.getR();

        if(HorizontalDirection==1){
            if( ((y-(2*r)) - HorizontalVelocity) < 1 ){
                super.setY(0.0+(2*r));
                this.HorizontalDirection=2;
            }
            else    super.setY(y-HorizontalVelocity);
        }

        else if(HorizontalDirection==2){
            if( ((y+2*r) + HorizontalVelocity) > 699 ){
                super.setY(700.0-(2*r));
                this.HorizontalDirection=1;
            }
            else    super.setY(y+HorizontalVelocity);
        }

        if(VerticleDirection==1){
            if( ((x-2*r) - verticleVelocity) < 1 ){
                super.setX(0.0+(2*r));
                this.VerticleDirection=2;
            }
            else    super.setX(x-verticleVelocity);
        }

        else if(VerticleDirection==2){
            if( ((x+2*r) + verticleVelocity) > 999 ){
                super.setX(1000.0-(2*r));
                this.VerticleDirection=1;
            }
            else    super.setX(x+verticleVelocity);
        }

    }

   @Override    
    public void draw(Graphics2D g2){
        move();
        super.draw(g2);
    }
}