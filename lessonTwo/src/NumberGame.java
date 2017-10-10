import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("-------------------");
            System.out.println("Insert the number: ");
            int guess = sc.nextInt();
            if (guess > randNumber) {
                System.out.println("Please, try with an smaller number next time");
            } else if (guess < randNumber) {
                System.out.println("Please, try with an bigger number next time");
            } else {
                System.out.println("Wow! You did it!");
                System.exit(0);
            }
            System.out.println("You still have " + i + " chances");
        }
    }
}
