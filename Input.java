import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // take input from the user
        int number = input.nextInt();
        System.out.println("You entered " + number);

        //closing the scanner object
        input.close();
    }
}
