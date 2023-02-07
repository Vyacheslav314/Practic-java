import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

// Реализовать простой калькулятор
// добавить логирование
// В калькулятор добавьте возможность отменить последнюю операцию.

public class Calculate {

    private static Logger logger = Logger.getLogger(sorted.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public static void someMethod() throws SecurityException, IOException{
        FileHandler fh = new FileHandler("calc.log",true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat); 
    }

    public static void main(String[] args) throws SecurityException, IOException {
        someMethod();
        logger.info("Старт программы! ");
        double operand1 = nextInt();
        double operand2 = nextInt();
        char operation = getOperation();
        double result = 0;
        boolean bool = true;
        while (bool) {
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    logger.info("Результат " + operand1 + " " + operation + " " + operand2 + " = " + result);
                    break;
                case '-':
                    result = operand1 - operand2;
                    logger.info("Результат " + operand1 + " " + operation + " " + operand2 + " = " + result);
                    break;
                case '*':
                    result = operand1 * operand2;
                    logger.info("Результат " + operand1 + " " + operation + " " + operand2 + " = " + result);
                    break;
                case '/':
                    result = operand1 / operand2;
                    logger.info("Результат " + operand1 + " " + operation + " " + operand2 + " = " + result);
                    break;
                default:
                    logger.warning("Полученна некорректная операция ");
                    System.out.println("Операция не распознана. Повторите ввод.");
                    operation = getOperation();
                    logger.info("Полученна новая операция " + operation);
                    break;
            }
            logger.info("Выбор команды для дальнейшей работы ");
            System.out.println("\nВведите команду\n1.Продолжить работу с новыми данными\n2.Удалить последнюю операцию\n" +
            "3.Продолжить работу с полученным результатом\n4.Завершить работу программы ");
            int command = nextInt();
            if (command == 1) {
                logger.info("Получение новых данных ");
                operand1 = nextInt();
                operand2 = nextInt();
                operation = getOperation();
            } else if (command == 2) {
                logger.info("Удаление пред идущей операции " + operation);
                operation = getOperation();
            } else if (command == 3) {
                logger.info("Продолжаем работать с полученным результатом ");
                operand1 = result;
                operand2 = nextInt();
                operation = getOperation();
            }else if(command == 4){
                bool = false;
                logger.info("Завершение работы программы ");
            }else{
                logger.warning("Полученна некорректная команда ");
                command = nextInt();
                logger.info("Полученна новая команда " + command);
            }
            
        }
    }

    public static int nextInt() {
        System.out.println("Введите число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
            logger.info("Введено число " + operand);
        } else {
            logger.warning("Допущена ошибка при вводе данных ");
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
            logger.info("Получен тип операции " + operation);
        } else {
            logger.info("Допущена ошибка при вводе данных ");
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}
