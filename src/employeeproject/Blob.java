
package employeeproject;
/*
static variables are NOT instance variables, which apply to an 
individual object. They are CLASS_LEVEL variables that apply
to the entire class.
static methods - abilities of the entire CLASS and not 
of an individuals object/instance. These are run through the 
class itself and not through the object.
*/

public class Blob {
    private String name;
    //blobCOunt applies to entire class, not individual blobs.
    private static int  blobCount = 0;
    
    //instances of Blob can modify a static variable
    //when we construct a blob it increases count by 1
    public Blob(String n){
        name = n;
        blobCount++;
    }
    
    public String getName(){
        return name;
    }
    
    //use a static method to get a static private variable
    //static methods cannot change instance vriables, 
    //but instance methods CAN change static variables
    public static int getblobCount(){
        //name = " nothing";
        return blobCount;
    }
    
}
