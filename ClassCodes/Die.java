/* A class to represent a game die
 * @Author: Orhan Ozguner*/
public class Die{ //extends Object by default
  //store the current face of the die
  private int currentFace;
  //store the size of the die
  public int dieSize;
  
  //Constructor that takes a dieSize
  public Die(int dieSize){
    this.dieSize=dieSize;
  }
  
  /*Constructor that takes no input:EMpty constructor
   * sets the die size as 6
   */
  public Die(){
    this.dieSize=6;
  }
  
  /* a method to return the current face of the die
   * @return integer representing the current face value
   */
  public int getCurrentFace(){
    return this.currentFace;
  }
  
  /* a method to change the current face of the die
   * @param integer representing the current face value
   */
  public void setCurrentFace(int currentFace){
    this.currentFace = currentFace;
  }
  
  /* a method to return the die size
   * @return integer representing the size of the die
   */
  public int getDieSize(){
    return dieSize;
  }
  
  /* This method rolls the die and returns the face value
   * @return int value of rolled die
   */
  public int roll(){
    this.setCurrentFace((int)(Math.random()*getDieSize()+1));
    return this.getCurrentFace();
  }
  
}