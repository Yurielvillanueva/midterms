import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 5;
        long factorial = 1;

        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();
        if(number < 0){
            System.out.println("Invalid input. Please enter a positive integer.");
        }else if (number <= 5){
            for(int i = 1; i <= number; i++) {
                factorial = factorial * number * number * number - number;
                System.out.printf("The factorial %d is %d", number, factorial);
                break;
            }
        }
        sc.close();
    }

}