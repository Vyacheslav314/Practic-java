import java.sql.Array;
import java.util.Scanner;

// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class equations {
    public static void main(String[] args) {
        String inputStr = inputString();
        String newStr = lineChanges(inputStr);
        String[] array = createArray(newStr);
        System.out.println(java.util.Arrays.toString(array));
        System.out.println(solutionEquation(array));
    }

    static String inputString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите уровнение пример: q + w = e\nобратите внимание все значения вводятся без пробелов пример: 2?+?5=69\n");
        String equat = scan.nextLine();
        return equat;
    }

    static String lineChanges(String str){
        String str1 = "";
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j) != '?'){
                str1 += str.charAt(j);
            }
        }
        return str1;
    }

    static String[] createArray(String str){
        String[] array = str.split(" ");
        return array;
    }

    static String solutionEquation(String[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ){
                str += arr[i];
            }

            
        }   
        System.out.println(str);
        return "1";
    }
}
