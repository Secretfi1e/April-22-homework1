import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("bir eded daxil edin");
        int eded = scanner.nextInt();



        Power(eded);

    }

    public static void Power(int eded) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir number daxil edin");
        int number = scanner.nextInt();
        int qiymet=1;


        for (int i=0; i<eded;i++) {
            qiymet *=number;

        }
        System.out.println(qiymet);

    }}

