
package interfaceEx2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class DrawShapes2 {


    public static void main(String[] args) {
        Shape shapes[] = new Shape[10];  
        Pen p = new StandardPen(new SketchPadWindow(1000,800));
        p.setWidth(3);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
            p.setColor(getRandomColour());
            shapes[i].draw(p);
            System.out.println(shapes[i]);
            System.out.println("======================");
        }
    }
    
    public static Color getRandomColour(){
        int rre, rg, rb;
        rre = (int) (Math.random()*256);
        rg = (int) (Math.random()*256);
        rb = (int) (Math.random()*256);
        
        return new Color(rre,rg,rb);
    }
    
    public static Shape getRandomShape(){
        Shape s;
        int rx, ry, rr, rw, rh,rs, randshp;
        rx = (int) (Math.random()*600 - 300);// from -300 to +299
        ry = (int) (Math.random()*600 - 300);// from -300 to +299
        rr = (int) (Math.random()*100 + 10);
        rw = (int) (Math.random()*250 + 10);
        rh = (int) (Math.random()*250 + 10);
        rs = (int) (Math.random()*97 + 3);
        randshp = (int) (Math.random()*3 + 1);
        
        if(randshp==1)
            s = new Rectangle(rx,ry,rw,rh);
        else if(randshp==2)
            s = new Circle(rx,ry,rr);
        else
            s = new Wheel(rx,ry,rr,rs);
        return s;
    }
    
}