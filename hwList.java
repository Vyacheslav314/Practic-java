// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class hwList {
    

    public static void main(String[] args) {
        ArrayList<Integer> myList = (ArrayList<Integer>) fillRandomArray();
        System.out.println(myList);
        deleteItemList(myList);
        System.out.println(myList);
        
    }

    public static void deleteItemList(ArrayList<Integer> list){
        for(Iterator<Integer> i = list.iterator(); i.hasNext(); ) {
            Integer number = i.next();
            if (number % 2 == 0) {
            i.remove();
    }
        }
    }


    public static List<Integer> fillRandomArray(){
        ArrayList<Integer> listNum = new ArrayList<>();
        int listNumSize = 10;
        Random random = new Random();
        for (int i = 0; i < listNumSize; i++) {
            listNum.add(random.nextInt(0,10));
        }

        return listNum;
    }
}
