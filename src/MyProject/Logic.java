package MyProject;

import java.util.Scanner;

public class Logic {

    public enum Arichmetic {
        PLUS,
        MINUS,
        MULTIPLICATION,
        DIVISION;
    }


    static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please, enter number");
        int num = sc.nextInt();
        return num;
    }

    static Arichmetic getOperation() {
        Scanner sc = new Scanner(System.in);
        Arichmetic operation;
        System.out.println("please write the operation in a word, for example:\n  PLUS, MINUS, MULTIPLICATION or DIVISION");

        String tmp = sc.nextLine();
        switch (tmp) {
            case "PLUS":
            case "+":
                operation = Arichmetic.PLUS;
                break;
            case "MINUS":
            case "-":
                operation = Arichmetic.MINUS;
                break;
            case "MULTIPLICATION":
            case "*":
                operation= Arichmetic.MULTIPLICATION;
                break;
            case "DIVISION":
            case "/":
                operation= Arichmetic.DIVISION;
                break;
            default:
                operation = Arichmetic.PLUS;

        }

        return operation;
    }

    static int result(int num1, int num2, Arichmetic operation) {
        int res;

        switch (operation) {
            case PLUS:
                res = num1 + num2;
                break;
            case MINUS:
                res = num1 - num2;
                break;
            case MULTIPLICATION:
                res = num1 * num2;
                break;
            case DIVISION:
                res = num1 / num2;
                break;
            default:
                res = result(num1, num2, getOperation());

        }
        return res;
    }
}