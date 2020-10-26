
package employeeproject.assignment;

public class FTEmployee extends Employee {

    public FTEmployee(){
        super();
       
    }

    @Override
    public double getPay() {
        if(hours > 40){
            totalPay += ((hours-40) *(rate*2)) + (40 * rate);
        return totalPay;
        }
        totalPay+= rate*hours; // change later
        return totalPay;
    }
    
}
