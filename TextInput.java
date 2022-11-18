import java.util.Scanner;

class TextInput {
    public static void main(String[] args) {
        // creating an object of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myString = input.nextLine();
        System.out.println("You entered = " + myString);

        // closing the scanner object
        input.close();
    }
}