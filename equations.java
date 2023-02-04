import java.util.Scanner;

// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class equations {

    public static void main(String[] args) {
        String inputStr = inputString();
        String[] array = createArray(inputStr);
        System.out.println(String.join(" ", array));   
    }

    static String inputString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уровнение пример: q + w = e\nобратите внимание все значения вводятся через пробел пример: 2? + ?5 = 69");
        String equat = scan.nextLine();
        return equat;
    }

    static String[] createArray(String str){
        String[] array = str.split(" ");
        int i = 0;
        int j = 0;
        Boolean isValid = true;
        while (isValid) {
            array = str.split(" ");
            array[0] = array[0].replace("?", String.valueOf(i));
            array[2] = array[2].replace("?", String.valueOf(j));
            if(Integer.parseInt(array[0]) + Integer.parseInt(array[2]) != Integer.parseInt(array[4])){
                j++;
                if (j > 9) {
                    j = 0;
                    i++;
                }
                if(i > 9){
                    System.out.printf("Уровнение %s не имеет решения", str);
                    System.exit(1);
                }
            }else{
                System.out.printf("%s найдено верное равенство ", str);
                isValid = false;
            }
        }
        return array;
    }

}
