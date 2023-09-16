/* An hourly employee is an employee that gets paid by the hour */
public class HourlyEmployee extends Employee{
  // Store the amount earned per hour
  private double hourlyRate;
  // Store the number of hours worked
  private double hoursWorked;
  
  /* The constructor requires that we specify the name for the hourly employee */
  public HourlyEmployee(String name){
    super(name,0.0);
    
  }
    /* The constructor calls another constructor in the same class */
  public HourlyEmployee(String name, double salary){
    this(name);
  }
  
  /* Get the amount earned per hour 
   * @param double hourly rate
   */
  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }
  
  /* Set the number of hours worked 
   * @param double hours worked*/
  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }
  
  /* Get the number of hours worked 
   * @return double hours worked
   */
  public double getHoursWorked() {
    return hoursWorked;
  }
  
  /* Get the amount earned per hour 
   * @param double hourly rate
   */
  public double getHourlyRate() {
    return hourlyRate;
  }
  
  /* Change how salary works so that the amount "earned" by an hourly employee
   * is the amount of hours worked times the amount paid per hour
   *@return double salary of the employee */
  public double getSalary(){
    return getHourlyRate()*getHoursWorked();
  }
}