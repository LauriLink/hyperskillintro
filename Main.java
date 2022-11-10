import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sumLarger = 0;
        int sumSmaller = 0;
        int sumPerfect = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            int list = scanner.nextInt();
            if (list > 0) {
                sumLarger++;
            } else if (list < 0) {
                sumSmaller++;
            } else if (list == 0) {
                sumPerfect++;
            }
        }
        System.out.print(sumPerfect + " " + sumLarger + " " + sumSmaller);
    }
}