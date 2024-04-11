import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (less than 1,000,000): ");
        int n = scanner.nextInt();

        SinglyLinkedList primeList = new SinglyLinkedList();
        for (int i = 0; i <= n; i++) {
            if (SinglyLinkedList.isPrime(i)) {
                primeList.add(i);
            }
        }

        System.out.println("The sum of prime numbers with 3 between 0 and " + n + " is: " + primeList.sumOfNumbersWith3());

        scanner.close();
    }
}


