import java.util.List;
import java.util.Stack;

public class evaluation {
    Stack<Double> stack = new Stack<>();

    void evaluate(String postfix) {
        for (String current : postfix.split(" ")) {
            if (isNumeric(current)) {
                stack.push(Double.parseDouble(current));
            } else {
                if(!stack.isEmpty()){
        double a=stack.pop();
        double b=stack.pop();

                switch (current) {
                    case "+" -> stack.push(b + a);
                    case "-" -> stack.push(b- a);
                    case "*" -> stack.push(b * a);
                    case "/" -> stack.push(b / a);
                    case "%" -> stack.push(b % a);
                }}
        }


    }

        System.out.println(stack.pop());

    }

boolean isNumeric(String component){
        try{Double.parseDouble(component);
        return true;}
        catch(NumberFormatException e)
        {return false;
}
}}