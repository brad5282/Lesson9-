
package employeeproject.assignment;


public class PTEmployee extends Employee {
    public PTEmployee(){
        super();
    }

    @Override
    public double getPay() {
        totalPay+= rate*hours;//adding to TotalPay
        return hours * rate;
    }
    
}

