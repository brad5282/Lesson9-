package employeeproject.assignment;

// abstract = we can no longer make employee objects
abstract public class Employee {

    protected String name;
    protected double rate;
    protected int hours;

    private static double MIN_RATE = 6.50;
    private static double MAX_RATE = 30.50;
    private static double MIN_HOURS = 1;
    private static double MAX_HOURS = 60;
    
    protected static double totalPay=0;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    // static methods - apply to all employess
    public static String getNameRules() {
        return "nonblank";
    }

    public static String getRateRules() {
        return "between " + MIN_RATE + " and " + MAX_RATE;
    }

    public static String getHoursRules() {
        return "between " + MIN_HOURS + " and " + MAX_HOURS;
    }
    
    public static double getTotalPay(){
        return totalPay;
    }

    //FTEmployee and PTEmployee dont need to override these 
    //so they become final.
    final public boolean setName(String nm) {
        if (nm.equals("")) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    //dont need type any more 
    //instead we will create instances of FT and PT
    /*public boolean setType(int tp) {
		if (tp != 1 && tp != 2)
			return false;
		else{
			type=tp;
			return true;
		}
	}*/
    final public boolean setRate(double rt) {
        if (rt < MIN_RATE || rt > MAX_RATE) {
            return false;
        } else {
            rate = rt;
            return true;
        }
    }

    final public boolean setHours(int hrs) {
        if (hrs < MIN_HOURS || hrs > MAX_HOURS) {
            return false;
        } else {
            hours = hrs;
            return true;
        }
    }

    final public String getName() {
        return name;
    }

    //abstract because both FT & PT will define it 
    //but it will be different for both
    abstract public double getPay();
}
