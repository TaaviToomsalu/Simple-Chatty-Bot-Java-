import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // start coding here
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % n == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}