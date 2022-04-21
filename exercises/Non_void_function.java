// this is a example of concrete type (instead of void) to return a specific result of a function. it helps with keeping the main method simple and breaking the code into smaller parts when debugging.

public class NonVoidExample {
  public static int sum(
    int a, int b) { 
    int c = a+b;
    return c;
  }
  
  // concat - concatenate function, don't forget ; when ending line
  
  public static String concat(
    String d, String e) {
    String f = d + e;
  return f;
}

public static void main () {
  System.out.println((sum(2,3)); 
                     System.out.println(concat("John ", "Doe"));
                    }
                     }
                     
