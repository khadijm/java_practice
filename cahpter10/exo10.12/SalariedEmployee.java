  public class SalariedEmployee extends Employee{
    private double weeklySalary; 
	public SalariedEmployee(String firstName, String lastName,String socialSecurityNumber,Date birthday, double weeklySalary)  { 
	super(firstName, lastName, socialSecurityNumber,birthday); 
	if (weeklySalary < 0.0)
	throw new IllegalArgumentException("Weekly salary must be >= 0.0"); 
	this.weeklySalary = weeklySalary; 
	} 
	public void setWeeklySalary(double weeklySalary){ 
	if (weeklySalary < 0.0)
	throw new IllegalArgumentException(  "Weekly salary must be >= 0.0");
	this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary(){ 
	return weeklySalary;
	}
    @Override
	  public String toString(){ 
	  return String.format("salaried employee: %s%n%s: $%,.2f",super.toString(), "weekly salary", getWeeklySalary());
    }
   @Override
   public double earnings(){
		   
   return getWeeklySalary();
   } 

  }   