import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number= scanner.nextInt();
        while (true) {
            for (int i = 0; i < number; i++) {
                if ((Math.pow(4, i) >= number && (Math.pow(5, i) >= number))) {
                    int[] arr = new int[i];
                    int[] arr2 = new int[i];
                    for (int a = 0; a < i; a++) {
                        arr[a] = (int) Math.pow(4, a);
                        arr2[a] = (int) Math.pow(5, a);
                        System.out.println(arr[a] + "," + arr2[a]);
                    }
                    break;
                }
            }
            break;
        }
    }
}