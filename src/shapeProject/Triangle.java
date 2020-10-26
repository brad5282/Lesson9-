
package shapeProject;

import TurtleGraphics.Pen;


public class Triangle extends Shape {
    
    protected double x2, y2,x3,y3;
    protected double changex, changey;

    public Triangle() {
        super();
        x2 = 100;
        y2 = 0;
        x3 = 50;
        y3 = 100;
        
    }

    public Triangle(double x, double y, double x2, double y2, double x3, double y3) {
        super(x, y);//calls Shape (parent constuctor)
        x2 = x2;
        y2 = y2;
        x3 = x3;
        y3 = y3;
    }

    @Override
    public double area() {
        return Math.abs(((xPos*y2-x2*yPos) + (x2*y3 - x3*y2) + (x3*yPos-xPos*y3)) / 2);
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor) {
        x2 *= factor;
        y2 *= factor;
        x3 *= factor;
        y3 *= factor;
        
    }

    @Override
    public double perimeter() {
        return (Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2) * (yPos-y2))
                + Math.sqrt((x2-x3)*(x2-x3) + (y2-y3) * (y2-y3))
                + Math.sqrt((x3-xPos)*(x3-xPos) + (y3-yPos) * (y3-yPos)));
    }
    
    public void move(double xLoc, double yLoc){
        double changex = xLoc - xPos;
        double changey = yLoc - yPos;
        xPos = xLoc;
        yPos = yLoc;
        x2 += changex;
        x3 += changex;
        y2 += changey;
        y3 += changey;
    }
    
    @Override
    public String toString() {
        String str = "TRIANGLE\n";
        str += "Point locations: (" + xPos + " , " + yPos +"), ("+ x2 + " , " + y2 +"), ("+ x3 + " , " + y3 +")\n";
        str+= super.toString();
        return str;
    }
    
}
