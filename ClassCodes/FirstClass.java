public class FirstClass{
  public int add(int x, int y){
    return x+y;
  }
  
  public static void main(String[] args){
    FirstClass f = new FirstClass();
    System.out.println(f.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
  }
}