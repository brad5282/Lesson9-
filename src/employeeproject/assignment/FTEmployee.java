
package employeeproject.assignment;

public class FTEmployee extends Employee {

    public FTEmployee(){
        super();
    }
    
    //complete get pay
    
    @Override
    public double getPay() {
        //update totalPay
        //over 40 hrs is double the rate 
        totalPay+= 1; // change later
        return 0;
    }
    
}
