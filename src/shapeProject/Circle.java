package shapeProject;

import TurtleGraphics.Pen;

public class Circle extends Shape {

    //xPos and yPos are inherited from shape
    protected double radius;
    //protected = available here and to package only

    public Circle() {
        super();//up to Shape default constructor
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        super(x, y);// up to Shape
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2* Math.PI * radius ;
    }


    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 120;
        //120 sided shape
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for (int i = 1; i < 120; i++) {
            p.move(side);
            p.turn(3); // 120 * 3 = 360

        }
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = (factor * radius);
    }

    @Override
    public String toString() {
        String str = "CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str+= super.toString();//get the rest from the parent
        return str;
    }

}
