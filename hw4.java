// Вывести все простые числа от 1 до 1000


public class hw4 {
    
    public static void main(String[] args) {
        int num = 1000;
        boolean isValid = true;
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(i);
            }else{
                isValid = true;
            }
        }
        
    }
}
