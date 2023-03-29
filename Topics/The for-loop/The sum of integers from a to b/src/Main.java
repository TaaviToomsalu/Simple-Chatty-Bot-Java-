import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}