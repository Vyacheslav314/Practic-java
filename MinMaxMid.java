// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinMaxMid {
    
    public static void main(String[] args) {
        ArrayList<Integer> myList = (ArrayList<Integer>) fillRandomArray(); 
        System.out.println(myList);
        System.out.println(min(myList));
        System.out.println(max(myList));
        System.out.println(arithmeticMean(myList));
    }

    public static double arithmeticMean(ArrayList<Integer> list){
        double sumElem = 0;
        for (int i = 0; i < list.size(); i++) {
            sumElem += list.get(i);
        }
        double result = sumElem / list.size();
        System.out.println(list.size());
        return result;
    }

    public static int min(ArrayList<Integer> list){
        int indexmin = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(indexmin) > list.get(i)){
                indexmin = i;
            }
        }
        return list.get(indexmin);
    }

    public static int max(ArrayList<Integer> list){
        int indexmax = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(indexmax) < list.get(i)){
                indexmax = i;
            }
        }
        return list.get(indexmax);
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
