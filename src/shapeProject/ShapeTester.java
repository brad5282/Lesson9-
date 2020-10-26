
package shapeProject;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;
import java.util.Scanner;


public class ShapeTester {

    
    public static void main(String[] args) {
       Pen p = new StandardPen(new SketchPadWindow(800,600));
       
      //Shape s = new shape
      Shape a = new Wheel(100,100,50,6);//ok
      Shape b = new Rectangle(-200,-200,75,50);//ok
      
      a.draw(p);
      b.draw(p);
      Scanner s = new Scanner(System.in);
        System.out.println("Press <enter> to change Wheel to rectangle, "
                + "and rect to Circle");
        s.nextLine();
        p.setColor(Color.white);
        a.draw(p);
        b.draw(p);
        a = makeOneShapeFromAnother(a,1);
        b = makeOneShapeFromAnother(b,2);
        p.setColor(Color.blue);
        a.draw(p);
        b.draw(p);
      Circle c = new Wheel();//ok parent can be child
      Circle cc = new Circle();
      Wheel w = new Wheel();//w is a Wheel, circle and shape
      //Wheel w = new Circle(); //no Child can be parent 
      //All wheels are Circles, but all Circles are 
      //not neccessarily Wheel
        //System.out.println("Is c a shape?: " + (c instanceof Shape));//t
       // System.out.println("Is c a circle?: " + (c instanceof Circle));//t
        //System.out.println("Is c a wheel?: " + (c instanceof Wheel));//t
       // System.out.println("Is w a circle?: " + (w instanceof Circle));//t
       // System.out.println("Is c a shape?: " + (c instanceof Shape));//t
       // System.out.println("Is cc a Wheel?: " + (cc instanceof Wheel));//f
    }
    
    public static Shape makeOneShapeFromAnother(Shape inShape, int type){
        //1 = Rect, 2=Circle, 3 = Wheel
        Shape outShape;
        if(type == 1){
            double area = inShape.area();
            return new Rectangle(inShape.getXPos(), inShape.getYPos(),
            Math.sqrt(area), Math.sqrt(area));
        }
        else if (type==2){
            double area = inShape.area();
            double rad = Math.sqrt(area/Math.PI);
            return new Circle(inShape.getXPos(), inShape.getYPos(), rad);
        }
        else 
        {
            double area = inShape.area();
            double rad = Math.sqrt(area/Math.PI);
            return new Wheel(inShape.getXPos(), inShape.getYPos(), rad, 5);
            
            
        }
    }
    
}
