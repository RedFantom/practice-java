import java.util.Scanner;

public class Console {
    private static int question_one(Scanner input) {
        System.out.printf("Do you like video games? (y/n) ");
        char answer = input.next().trim().charAt(0);
        if (answer == 'n') {
            System.out.printf("Our advice: buy a PC!\n");
            return 0;
        } else if (answer == 'y') {
            return question_two(input);
        } else {
            return -1;
        }
    }

    private static int question_two(Scanner input) {
        System.out.printf("Do you have any friends? (y/n) ");
        char answer = input.next().trim().charAt(0);
        if (answer == 'n') {
            System.out.printf("Our advice: buy a PS3\n");
            return 0;
        } else if (answer == 'y') {
            return question_three(input);
        } else {
            return -1;
        }
    }

    private static int question_three(Scanner input) {
        System.out.printf("Do you ever meet your friends offline? (y/n) ");
        char answer = input.next().trim().charAt(0);
        if (answer == 'n') {
            System.out.printf("Our advice: buy an XBOX\n");
            return 0;
        } else if (answer == 'y') {
            System.out.printf("Our advice: buy a Wii\n");
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.printf("Welcome to the game console selection helpdesk!\n");
        System.exit(question_one(new Scanner(System.in)));
    }
}
