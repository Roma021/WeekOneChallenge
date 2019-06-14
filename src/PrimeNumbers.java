import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int primeNumber;
        int number;
        //String anotherNum;
        boolean prime = true;

        System.out.print("Enter a Number: ");
        primeNumber = keyboard.nextInt();


        for (number = 1; number <= primeNumber; number++) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }


            }
            if (number == 1) {
                System.out.println(number + " Not a Prime Number ");
            } else if (prime) {
                System.out.println(number + " Prime Number ");
            } else {
                System.out.println(number + " Not a prime number ");
            }
        }
    }
}
