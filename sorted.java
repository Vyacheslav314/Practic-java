// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;


public class sorted {

    private static Logger logger = Logger.getLogger(sorted.class.getName());

    public static void someMethod() throws SecurityException, IOException{
        FileHandler fh = new FileHandler("log.log",true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat); 
    }

    public static void main(String[] args) throws IOException {
        someMethod(); 
        int[] arr = new int[]{1, 12, 17, 22, 2, 4, 1, 5, 6}; 
        bubbleSort(arr);
    }
    

    static void bubbleSort(int[] sortarr){
        for (int i = 0; i < sortarr.length - 1; i++) {
            for(int j = 0; j < sortarr.length - i - 1; j++) {
                if(sortarr[j + 1] < sortarr[j]) {
                    int swap = sortarr[j];
                    sortarr[j] = sortarr[j + 1];
                    sortarr[j + 1] = swap; 
                    logger.info(sortarr[j + 1] + " меньше чем " + sortarr[j]);
                    logger.info("меняем местами числа " + sortarr[j + 1] + " и " + sortarr[j]);
                }else{
                    logger.info(sortarr[j + 1] + " больше чем " + sortarr[j]);
                    logger.info("Елементы остаются на своих местах ");
                }
                logger.log(Level.INFO, java.util.Arrays.toString(sortarr));
            }
        }
    }

}
