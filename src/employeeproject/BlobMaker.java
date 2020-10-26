
package employeeproject;


public class BlobMaker {

    public static void main(String[] args) {
        Blob a , b , c;
        System.out.println("I have " + Blob.getblobCount() + " Blobs");
        a =new Blob("Joey");
        b =new Blob("Frankie");
        c =new Blob("Moe");
        System.out.println("I have " + Blob.getblobCount() + " Blobs");
        System.out.println("My blobs are called: ");
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
        //you CAN access ststic methods through an object but normally you don't
        System.out.println("c will tell me hoe many: " + c.getblobCount());
    }
    
}
