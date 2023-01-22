import java.util.Scanner;

// Реализовать простой калькулятор

public class calculate {
    
    public static void main(String[] args) {
        float numA = 0;
        float numB = 0;
        double result = 0;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nВведите команду:\n1.Сложение\n2.Вычитание\n3.Умножение\n4.Деление\n5.Завершить работу");
            int command = scan.nextInt();
            switch (command) {
                case 1:
                    numA = inputNumber("a");
                    numB = inputNumber("b");
                    result = operationResalt(numA, numB, command);
                    System.out.println("Результат сложения " + result);
                    break;
                case 2:
                    numA = inputNumber("a");
                    numB = inputNumber("b");
                    result = operationResalt(numA, numB, command);
                    System.out.println("Результат вычитания " + result);
                    break;
                case 3:
                    numA = inputNumber("a");
                    numB = inputNumber("b");
                    result = operationResalt(numA, numB, command);
                    System.out.println("Результат умножения " + result);
                    break;
                case 4:
                    numA = inputNumber("a");
                    numB = inputNumber("b");
                    result = operationResalt(numA, numB, command);
                    System.out.println("Результат деления " + result);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Вы ввели не верную команду попробуйте ещё раз");
                    break;
            }
        }
    }

    static Integer inputNumber(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("введите число %S ", str);
        int num = scan.nextInt();
        return num;
    }

    static Float operationResalt(float a, float b, int com){
        float result = 0;
        if(com == 1) result = a + b;
        else if(com == 2) result = a - b;
        else if(com == 3) result = a * b;
        else result = a / b;
        return result;
    }
}
