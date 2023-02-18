import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class PhoneBook {

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        boolean isValid = true;

        while (isValid) {
            System.out.println("\n");
            int command = Integer.parseInt(inpuString("Выберите команду:\n1.Добавить контакт\n2.Найти контакт\n3.Показать все контакты\n4.Завершить работу\n"));
            switch(command){
                case 1:
                    int howManyPhoneNumber = Integer.parseInt(inpuString("Сколько номеров вы хотите добавить к этому пользователю: "));

                    List<String> phoneList = addPhoneNumber(howManyPhoneNumber);
                    phoneBook.put(inpuString("Введите имя: "), phoneList);
                break;
                case 2:
                    String name = inpuString("Введите имя: ");
                    findInPhoneBook(name);
                break;
                case 3:
                    System.out.println(phoneBook);
                break;
                case 4:
                    isValid = false;
                break;
                default:
                    System.out.println("Вы ввели неверную команду. Попробуйте ещё раз");
                break;
            }
        }
    }

    

    public static List<String> addPhoneNumber(int quantityElem) {
        List<String> phoneList = new LinkedList<>();
        for (int i = 0; i < quantityElem; i++) {
            phoneList.add(inpuString("Введите номер телефона: "));
        }
        return phoneList;
    }

    public static String inpuString(String message) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(message);
        String string = scanner.nextLine();
        return string;
        
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}