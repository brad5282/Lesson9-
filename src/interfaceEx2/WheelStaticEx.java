
package interfaceEx2;

public class WheelStaticEx {

    
    public static void main(String[] args) {
        Wheel x, y,z;
        x = new Wheel();
        y = new Wheel(10,10,50,5);
        z = new Wheel(10,10,100,3);
        System.out.println(x + "\n");
        System.out.println(y + "\n");
        System.out.println(z);
        System.out.println("======================");
        System.out.println("Wheels made: " + Wheel.getWheelCount());
        System.out.println("Average Size: "  + Wheel.getavgSize());
    }
    
}
