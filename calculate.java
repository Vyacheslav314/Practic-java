import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

// Реализовать простой калькулятор
// добавить логирование

public class calculate {
    
    private static Logger logger = Logger.getLogger(calculate.class.getName());

    public static void someMethod() throws SecurityException, IOException{
        FileHandler fh = new FileHandler("calc.log");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat); 
    }


    public static void main(String[] args) {
        try {
            someMethod();
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        logger.info("Start program ");
        float numA = 0;
        float numB = 0;
        double result = 0;
        while (true) {
            int command = inputNumber("Выберите номер команды\n1.Сложение\n2.Вычитание\n3.Умножение\n4.Деление\n5.Завершить работу\n");
            switch (command) {
                case 1:
                    logger.info("Выбранна операция сложение ");
                    numA = inputNumber("Введите число a ");
                    logger.info("Введенно число " + numA);
                    numB = inputNumber("Введите число b ");
                    logger.info("Введенно число " + numB);
                    result = operationResalt(numA, numB, command);
                    logger.info("Результат сложения " + result);
                    break;
                case 2:
                    logger.info("Выбранна операция вычитание ");
                    numA = inputNumber("Введите число a ");
                    logger.info("Введенно число " + numA);
                    numB = inputNumber("Введите число b ");
                    logger.info("Введенно число " + numB);
                    result = operationResalt(numA, numB, command);
                    logger.info("Результат сложения " + result);
                    break;
                case 3:
                    logger.info("Выбранна операция умножение ");
                    numA = inputNumber("Введите число a ");
                    logger.info("Введенно число " + numA);
                    numB = inputNumber("Введите число b ");
                    logger.info("Введенно число " + numB);
                    result = operationResalt(numA, numB, command);
                    logger.info("Результат сложения " + result);
                    break;
                case 4:
                    logger.info("Выбранна операция деление ");
                    numA = inputNumber("Введите число a ");
                    logger.info("Введенно число " + numA);
                    numB = inputNumber("Введите чилсо b ");
                    logger.info("Введенно число " + numB);
                    result = operationResalt(numA, numB, command);
                    logger.info("Результат сложения " + result);
                    break;
                case 5:
                    logger.info("Работа приложения завершена!!!");
                    return;
                default:
                    logger.warning("Введены некорректные данные ");
                    System.out.println("Вы ввели не верную команду попробуйте ещё раз");
                    break;
            }
        }
    }

    static Integer inputNumber(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.print(str);
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
