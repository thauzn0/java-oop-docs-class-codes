/* This is an example code to show generics
 * @Author Orhan Ozguner
 */
public class Box<T>{
  //this field stores the item
  private T item;
  
  /* This is a constructor that takes a single value
   * @param T - representing the item
   */
  public Box(T item){
    this.item = item;
  }
  
  public T getItem(){
    return item;
  }
  
  public void setItem(T item){
    this.item = item;
  }
  
  public void printItem(T parameter){
    System.out.println("Item: "+getItem()+" , Parameter: "+parameter);
  }
  
  
  
}