package MyProject;

/*
ДЗ 25. Добавление Enum в программу калькулятор
Вынести все арифметические операторы в Enum и использовать их в классе логике в том методе, где это необходимо!
 */

public class Main extends Logic{

    public static void main(String[] args) {
	// write your code here
        int num1 = getNum();
        int num2 = getNum();
        Arichmetic operation = getOperation();
        int calc = result(num1, num2, operation);
        System.out.println("result is " + calc);
    }
}
