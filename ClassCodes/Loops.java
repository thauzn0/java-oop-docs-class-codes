/* In this class, we showed examples of for and while loops */
public class Loops{

 /* this method returns the greatest common divisor of the two input numbers */
  public static int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
  
  /* this function returns the square root of the input */
  public static double squareroot(double a) {
    /*
    double x1 = a + 2; // x1 is the second best guess for square root of a
    double x2 = a + 1; // x2 is the best guess for square root of a
      
    while (x1 - x2 > 1e-20) {
      x1 = x2;
      x2 = x1 - (x1 * x1 - a) / (2 * x1);
    }
    return x2;
    */
    
    double x = a + 1;   // the current best guess for square root of a
    
    while (x * x - a > 1e-10)
      x = x - (x * x - a) / (2 * x);
    
    return x;
  }
  
  /*for loop that converts all letters of the string to uppercase*/
  // "Hello" -> builder = HELLO -> "HELLO"
  public static String capitalize1(String s){
    StringBuilder b = new StringBuilder();
    for(int index=0; index<s.length(); index=index+1){
      char c = s.charAt(index);
      if(c>='a' && c<='z'){
        c = (char)(c - 'a'+'A');
        b.append(c);
      }
      else
        b.append(c);
    }
    return b.toString();
  }
  
  /*while loop that converts all letters of the string to uppercase*/
  public static String capitalize2(String s){
    StringBuilder build = new StringBuilder();
    int index=0;
    while(index<s.length()){
      char c = s.charAt(index);
      if(c>='a' && c<='z'){
        c = (char)(c - 'a'+'A');
        build.append(c);
      }
      else
        build.append(c);
      
      //increment
      index = index+1;
    } //WHILE LOOP ENDS
    //index
    return build.toString();
    
  }
  
  /*method that checks if a word is palindrome*/
  //"racecar" , "tacocat"
  public static boolean isPalindrome(String s){
    for(int front=0,back=s.length()-1; front<back; front=front+1, back=back-1){
      if(s.charAt(front) != s.charAt(back))
        return false;
    }
    return true;
    
  }
  
  /*method that checks if a word is palindrome*/
  //"racecar" , "tacocat"
  public static boolean isPalindrome2(String s){
    for(int index=0; index<s.length()/2; index=index+1){
      if(s.charAt(index) != s.charAt(s.length()-1-index))
        return false;
    }
    return true;
    
  }
  
}