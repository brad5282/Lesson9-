package shapeProject;

import TurtleGraphics.Pen;

//abstract = cant make direct objects from shape class
abstract public class Shape {

    protected double xPos, yPos;

    public Shape() {
        xPos = 0;
        yPos = 0;

    }

    public Shape(double xp, double yp) {
        xPos = xp;
        yPos = yp;
    }

    //all shapes have area, diferent for each
    //must declare that here
    //must make method abstract
    //abstract method is declared like it is in interface
    //these MUST be defined by child class
    abstract public double area();

    abstract public void draw(Pen p);
    
    abstract public void stretchBy(double factor);
    
    abstract public double perimeter();
    //final means children cannot override this method
    final public double getXPos() {
        return xPos;
    }

    final public double getYPos() {
        return yPos;
    }
   

   public void move(double xloc, double yloc) {
        xPos = xloc;
        yPos = yloc;
    }

    

    //should not be final, children override this method
    public String toString(){
        String str = ("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area() + "\n";
        str += "Perimeter: " + perimeter() + "\n";
        return str;
    }
}
