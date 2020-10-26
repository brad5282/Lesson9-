
package shapeProject;
import TurtleGraphics.Pen;


public class Wheel extends Circle {
    //inherits everything form circle
    //except constructor
    private int spokes;//wheel has 4 properties
    
    public Wheel(){
        super();
        spokes = 3;
    }
    
    public Wheel(double x, double y, double r, int s){
        super(x,y,r); //super = call parent constructor
        spokes = s;
    }
    
    public void draw(Pen p){
        //call parent draw to get the circle
        super.draw(p);
        //draw spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i * 360.0 / spokes);
            p.move(radius);
            p.up();
            
        }
    
    }
    
    public void setSpokes(int s){
        spokes = s;
    }
    
    public String toString(){
        String str = "WHEEL\n";
            str+= "Radius: " + radius +  "\n";
            str+= ("(x, y) = (" + xPos + ", " + yPos + ")\n");
            str+= "Number of spokes: " + spokes + "\n";
        str+= "Area: " + area();
        return str;
    }
    
}
