/* A class that represents an employee.
 * 
 * Employees have names, numbers, and salaries
 */
public class Employee{
  //remember the employee name
  private String name;
  //remember the employee number
  private int number;
  //store employee salary
  private double salary;
  // store the last employee number used as a class field
  private static int lastEmployeeNumber = 0;
  
  /* A constructor to create an employee with a name, salary, and number */
  public Employee(String name, double salary, int number){
    this.name=name;
    this.salary=salary;
    this.number=number;
  }
  

  
  /* A constructor to create an employee with a name and salary*/ 
  public Employee(String name, double salary){
    super(); //Java adds this automatically if we do not write it
    this.name = name;
    this.salary=salary;
    this.number = Employee.lastEmployeeNumber+1;
    lastEmployeeNumber=number;
  }
    
  /* Retrieve the name of the employee
   * @return String employee name
   */
  public String getName(){
    return name;
  }
  
   /* Change the name of the employee
   * @param String employee name
   */
  public void setName(String name){
    this.name=name;
  }
  
  /* Retrieve the salary of the employee
   * @return double employee salary
   */
  public double getSalary(){
    return salary;
  }
  
  /* Retrieve the number of the employee
   * @return int employee number
   */
  public int getNumber(){
    return number;
  }
  
   /* Change the salary of the employee
   * @param double employee salary
   */
  public void setSalary(double salary){
    this.salary=salary;
  }
  
  
}