// В калькулятор добавьте возможность отменить последнюю операцию.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;
import java.util.logging.*;

public class CalculateVersionTwo {

    private static Logger logger = Logger.getLogger(CalculateVersionTwo.class.getName());

    public static void someMethod() throws SecurityException, IOException{
        FileHandler fh = new FileHandler("calc.log", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat); 
    }

    
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(Arrays.util.toString(exp));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if(isDigit(exp[i])){
                stack.push(Integer.parseInt(exp[i]));
            }else{
                switch(exp[i]){
                    case "+":
                    res = stack.pop() + stack.pop();
                    stack.push(res);
                    break;
                    case "-":
                    res = stack.pop() - stack.pop();
                    stack.push(res);
                    break;
                    case "*":
                    res = stack.pop() * stack.pop();
                    stack.push(res);
                    break;
                    case "/":
                    res = stack.pop() / stack.pop();
                    stack.push(res);
                    break;
                }
            }
            System.out.printf("%d\n", stack.pop());
        }
        

    }

    private static boolean isDigit(String string) {
        try {  
            Double.parseDouble(string);  
            return true;
          } catch(NumberFormatException e){  
            return false;  
          } 
    }

    static Integer inputNumber(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.print(str);
        int num = scan.nextInt();
        return num;
    }
}
