/* This is our first class */
// Author: Orhan Ozguner
public class MyFirstClass{
  // this field will have a separate copy for each instance
  private int myInstanceField=12;
  // this is a class field, one copy all instances share
  private static int myClassField;
  
  /*This is a method that averages given two integer values
   * @param x first input integer
   * @param y second input integer
   * @return int that is the average of the inputs
   * */
  public int average(int x, int y){
    int value = (x+y)/2;
    return value;
  }
  
  /*This is a static method that multiplies given two integer values
   * @param x first input integer
   * @param y second input integer
   * @return int that is the multiple of the inputs
   * */
  public static int mult(int x, int y){
    int value = x*y;
    return value;
  }
}