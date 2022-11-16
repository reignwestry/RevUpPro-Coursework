import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    
    // Create a scanner object
    Scanner input = new Scanner(System.in);

    // Console messae to user
    System.out.println("What numbers would you like to do math with?");

    // Use Scanner Object to obtain values fore two variables, x and y
    int x = input.nextInt();
    int y = input.nextInt();

    // Close the scanner object
    input.close();

    System.out.println(x + y);
    
    System.out.println(x - y);

    System.out.println(x * y);
    
    System.out.println(x / y);
    
    System.out.println(x % y);

    System.out.println("Post-Increment Operator:");
    int post = 10;
    System.out.println(post++);
    System.out.println(post);

    System.out.println("Pre-Increment Operator:");
    int pre = 10;
    System.out.println(++pre);
    System.out.println(pre);
  }
}
