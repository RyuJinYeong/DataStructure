package post;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PostFix {
	public static double evalPostFix(String exp)
	{
		StringTokenizer st = new StringTokenizer(exp, " ");
        int n = st.countTokens();
        double temp = 0;
        double op1, op2;
        
        LinkedStack L = new LinkedStack();
        
        for (int i = 0; i < n; i++) {
            String token = st.nextToken();
            if ((token.equals("+") == false) && (token.equals("-") == false) && (token.equals("*") == false)
                    && (token.equals("/") == false)) {
                try {
                    temp = Double.parseDouble(token);
                    L.push(temp);
                } catch (NumberFormatException e) {

                }
            } else {
                op2 = (double) L.pop();
                op1 = (double) L.pop();

                switch (token) {
                case "+":
                    L.push(op1 + op2);
                    break;
                case "-":
                    L.push(op1 - op2);
                    break;
                case "*":
                    L.push(op1 * op2);
                    break;
                case "/":
                    L.push(op1 / op2);
                    break;
                }
            }
        }
        return temp;
	}
	
	public static String makePostFix(String exp)
	{
		StringTokenizer st = new StringTokenizer(exp, " ");
		LinkedStack L = new LinkedStack();
		ArrayList<String> a = new ArrayList<String>();
        
		for (int i = 0; i < exp.length(); i++) {
            String token = st.nextToken();
            try {
                Double.parseDouble(token);
                a.add(token);
                System.out.print(token + " ");

            } catch (NumberFormatException e) {
            }

            switch (token) {
            case ")":
                while (!("(").equals(L)) {
                    a.add((String) L.peek());

                    System.out.print(L.pop() + " ");
                }
                L.pop();
                break;

            case "+":
            case "*":
            case "-":
            case "/":
            case "(":
                if (pis((String)L.peek()) >= (pie(token))) {
                    while ((double)L.peek() != 0) {
                        a.add((String) L.peek());

                        System.out.print(L.pop() + " ");
                    }
                }
                L.push(token);
                break;

            case "=":
                while ((int)L.peek() != 0) {
                    a.add((String) L.peek());
                    System.out.print(L.pop() + " ");
                }
            }
        }

        String Postfix = String.join("    ", a);
        return Postfix;
	}
	
	private static int pis(String temp) {

        if (("^").equals(temp))
            return 4;
        if (("*").equals(temp) || ("/").equals(temp))
            return 3;
        if (("+").equals(temp) || ("-").equals(temp))
            return 2;
        if ((")").equals(temp))
            return 1;
        if (("(").equals(temp))
            return 0;
        return 0;
    }
	
	private static int pie(String temp) {
	        if (("(").equals(temp))
	            return 5;
	        if (("^").equals(temp))
	            return 4;
	        if (("*").equals(temp) || ("/").equals(temp))
	            return 3;
	        if (("+").equals(temp) || ("-").equals(temp))
	            return 2;
	        if ((")").equals(temp))
	            return 1;
	        if (("=").equals(temp) || ("    ").equals(temp))
	            return -1;
	        return 0;
	}
}
