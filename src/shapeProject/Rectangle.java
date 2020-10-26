package shapeProject;

import TurtleGraphics.Pen;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle() {
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double x, double y, double w, double h) {
        super(x, y);//calls Shape (parent constuctor)
        width = w;
        height = h;
    }

    @Override
    public double area() {
        return height * width;
    }
    
    @Override
    public double perimeter() {
        return (2*width) + (2*height);
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);//points right
        p.move(width);
        p.turn(-90);//move left
        p.move(height);
        p.turn(-90);//right(down)
        p.move(width);
        p.turn(-90);
        p.move(height);

    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        String str = "RECTANGLE\n";
        str += "Width x Height: " + width + " x " + height + "\n";
        str+= super.toString();
        return str;
    }
}
