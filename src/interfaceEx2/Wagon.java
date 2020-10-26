
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;


public class Wagon {

    
    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800,600));
        Shape w = new Rectangle(200,45,10,10);
        Shape x = new Rectangle(50,100,300,100);
        Shape y = new Wheel(100,-5, 50,50);
        Shape z = new Wheel(300,-5,50,50);
        
        p.setWidth(10);
        p.setColor(Color.red);
        x.draw(p);
        w.draw(p);
        
        p.setWidth(2);
        p.setColor(Color.black);
        y.draw(p);
        z.draw(p);
    }
    
}
