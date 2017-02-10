
import java.util.Scanner;



/**

 * Created by Sharron on 2/9/2017.

 */



public class Lab7 {

    public static void main(String[] args) {

        int numStudents = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Java Class");

        System.out.print("Which student would you like to learn more about? " );


        //between 1 - 20: use 100

        System.out.println("Enter student number: ");


        numStudents = scan.nextInt();

        ///System.out.println("! = Please try again");

        String[] students = {"Kane", "Abel", "Matha", "Mary", "Jay", "Blige", "Moses", "Isiah", "Thomas", "Ken",
                "Peter", "Paul", "Jethro", "Darnell", "David", "Johnny", "Dewey", "Howe", "Ben", "Wallace"};
        String[] hometown = {"New York "};

        String[] favoritefood = {"T-Bone Steak " , "Bake Potate "};

        System.out.println("Student Name" + students[0] + hometown[0] + " " + favoritefood[0]);

        numStudents = scan.nextInt();

        if(numStudents > 20 || numStudents < 0){
            System.out.println("Please try again!");
        }
        String input = scan.next();

        if(input.equals("hometown")){

            System.out.println("");

        } else if (input.equals("food")){
            System.out.println("");
        } else{

            System.out.println("Try again");

        }
    }
}