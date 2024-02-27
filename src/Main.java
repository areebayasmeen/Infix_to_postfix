import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

             INfixToPostfix iNfixToPostfix=new INfixToPostfix();
             evaluation evaluation=new evaluation();
             Scanner scanner=new Scanner(System.in);
             System.out.println("give an infix notation");
             String postfix=  iNfixToPostfix.conversion(scanner.nextLine());
             System.out.println(postfix);
             evaluation.evaluate(postfix);

    }
}