// задача 1. 
// Вычислить n-ое треугольного число
// (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    static public void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number!");
        int n = in.nextInt();
        int T= n*(n+1)/2;
        System.out.println(T);
    }
}