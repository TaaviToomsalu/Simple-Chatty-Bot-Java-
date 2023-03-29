import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // start coding here
        int a = s.nextInt();
        int b = s.nextInt();
        int product = 1;
        for (int i = a; i < b; i++){
            product *= i;
        }
        System.out.println(product);
    }
}