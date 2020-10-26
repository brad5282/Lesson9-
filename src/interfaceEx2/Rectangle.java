package interfaceEx2;

import TurtleGraphics.Pen;

public class Rectangle implements Shape {

    private double xPos, yPos;
    private double width, height;

    public Rectangle() {
        xPos = 0;
        yPos = 0;
        width = 1;
        height = 1;
    }
    public Rectangle(double x, double y, double w, double h){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }
    @Override
    public double area() {
        return height * width;
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
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }

    @Override
    public void move(double xloc, double yloc) {
        xPos = xloc;
        yPos = yloc;
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }
    @Override
    public String toString(){
        String str = "RECTANGLE\n";
        str+="Width x Height: " + width + " x " + height + "\n";
        str+=("(x, y) = (" + xPos + ", " + yPos + ")\n");
        str+= "Area: " + area();
        return str;
    }
}
