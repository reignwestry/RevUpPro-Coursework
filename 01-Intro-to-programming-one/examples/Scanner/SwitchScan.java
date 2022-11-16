import java.util.Scanner;

class SwitchScan {
  public void scannerSwitchExample() {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the time of Day?");

    String input = scan.next();
    switch (input.toLowerCase()) {
      case "morning":
        System.out.println("Time for breakfast!");
        // Other logic can go here...
        break;
      case "afternoon":
        System.out.println("A nice day for a walk!");
        // Other logic can go here...
        break;
      case " evening":
        System.out.println("Its about bed time!");
        // Other logic can go here...
        break;
      default:
        System.out.println("Sorry, I didn't understand that, but have a nice day anyway!");
    }
  }
}