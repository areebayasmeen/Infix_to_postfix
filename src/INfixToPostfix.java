import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class INfixToPostfix {

    List<String> postfix=new ArrayList<>();
    Stack<String> operators=new Stack<>();
    StringBuilder result=new StringBuilder();

    String conversion(String infix) {

        for (String current : infix.split(" ")) {
            if (isoperator(current)) {
                while (!operators.isEmpty() && lessprecedence(current, operators.peek())) {
                    postfix.add(operators.pop());
                }
                operators.push(current);
            } else {
                postfix.add(current);
            }}
            while (!operators.isEmpty()) {
                postfix.add(operators.pop());
            }


        for (String s : postfix) {
            result.append(s).append(" ");
        }

        return result.toString().trim();

    }
boolean isoperator(String operator){
        return List.of("+","-","%","*","/").contains(operator);}

boolean lessprecedence(String a,String b){
       return precedence(a)<precedence(b);
}
int precedence(String operator){
        if(Objects.equals(operator, "+") || Objects.equals(operator, "-")){
            return 1;}
        if(Objects.equals(operator, "*") || Objects.equals(operator, "/")){
            return 2;}
            if(Objects.equals(operator, "%")){
                return 3;
            }


return 4; }
    }
