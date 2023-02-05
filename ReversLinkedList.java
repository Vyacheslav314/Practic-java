import java.util.Collections;
import java.util.LinkedList;
import java.util.List.*;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список

public class ReversLinkedList {
    
    

    public static void main(String[] args) {
        LinkedList<Integer> listNum = new LinkedList<>();
        listNum.add(2);
        listNum.add(5);
        listNum.add(7);
        listNum.add(8);
        System.out.println(listNum);
        listNum = reverse(listNum);  // первый способ 
        System.out.println(listNum);
        Collections.reverse(listNum); // второй способ
        System.out.println(listNum);
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            reversList.add(list.get(i));
        }
        return reversList;
    }
}
