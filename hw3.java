// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class hw3 {
    
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите команду:\n1.Что бы вычеслить n-ое треугольного числа\n2.Что бы вычислить факторил числа n\n3.Завершить работу");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    triangularNumber();
                    break;
                case 2:
                    factorial();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Вы ввели не верную команду попробуйте ещё раз");
                    break;
            }
        }
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n");
        int num = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
            System.out.println(result);
        }
    }

    static void triangularNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n");
        int num = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
            System.out.println(result);
        } 
    }
}
