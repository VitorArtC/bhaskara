package bhaskara;

import java.util.Scanner;

public class Bhaskara { 

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreva os valores: a, b e c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        bhaskaraclass1 b1 = new bhaskaraclass1(a,b,c);
        
        b1.print();
    }
    
}
