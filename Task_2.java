import java.util.Scanner;

// 2. Вывести все простые числа от 1 до 1000

public class javaSeminar1task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число, до которого необходимо найти все простые числа: ");
        int input = scanner.nextInt();
        int count = 0;
        scanner.close();

        for (int i = 2; i < input; i++) {

            boolean isPrimeNumber = true;

                for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }            
            if (isPrimeNumber) {
                count++;
                System.out.print(i + ", ");
            }
        }
        
        System.out.println("всего простых чисел: " + count);
    }

}