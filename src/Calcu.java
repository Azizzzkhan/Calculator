import java.util.Scanner;

import static java.lang.String.valueOf;

public class Calcu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command (a + b)");
        String data = scanner.nextLine();
        System.out.println(calc(data));
    }

    public static String calc(String input) throws Exception {
        String[] inputInArray = input.split(" ");//a,+,b
        int answer = 0;
        int a;
        int b;
        try {
            a = Integer.parseInt(inputInArray[0]);
            b = Integer.parseInt(inputInArray[2]);
            if (a < 0 || a > 10 || b < 0 || b > 10) {
                throw new Exception();
            }

            switch (inputInArray[1]) {
                case "+" -> answer = a + b;
                case "-" -> answer = a - b;
                case "*" -> answer = a * b;
                case "/" -> answer = a / b;
            }
            return valueOf(answer);


        } catch (Exception e) {
            a = Calc.valueOf(inputInArray[0]).getArabicNum();
            b = Calc.valueOf(inputInArray[2]).getArabicNum();

            if (a < 0 || a > 10 || b < 0 || b > 10) {
                throw new Exception();
            }


            switch (inputInArray[1]) {
                case "+" -> answer = a + b;
                case "-" -> answer = a - b;
                case "*" -> answer = a * b;
                case "/" -> answer = a / b;
            }
            if (answer < 0)
                throw new Exception();


            Calc romanN = null;

            for (Calc elements : Calc.values()) {
                if (answer == elements.getArabicNum())
                    romanN = elements;


            }
            return valueOf(romanN);
        }


    }
}
