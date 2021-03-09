import javax.swing.JFrame;
public class ShapeViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 1000;
      final int FRAME_HEIGHT = 700;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Shape");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ShapeComponent component = new ShapeComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
