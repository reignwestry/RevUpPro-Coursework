import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // init Scanner
    Scanner choice = new Scanner(System.in);

    //ask question
    System.out.println("Welcome to our Diner! Please select an entree:\n"
                      + "1) steak\n"
                      + "2) wings\n"
                      + "3) salad\n"
                      + "and any other number for nothing!");
    
      // System.out.println(choice);

    //get input
    int num = choice.nextInt();

    //Find choice
    switch(num) {
      case 1: System.out.println("Here is your steak!");
        break;
      case 2: System.out.println("Here is your wings!");
        break;
      case 3: System.out.println("Here is your salad!");
        break;
      default: System.out.println("You want nothing?!");
        break;
    }

    System.out.println("\nPlease select a drink:\n"
                   + "1) iced tea\n"
                   + "2) soda\n"
                   + "3) lemonade\n"
                   + "and any other number for nothing!");

    int numTwo = choice.nextInt();

    switch(numTwo){
      case 1: System.out.println("Here is your Iced Tea!");
        break;
      case 2: System.out.println("Here is your soda!");
        break;
      case 3: System.out.println("Here is your lemonade!");
        break;
      default: System.out.println("You want nothing?");
    }
    choice.close();
  }
}

