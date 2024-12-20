import java.util.Scanner;

public class Deljenje_nula {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int x = sc.nextInt();
        int y;
        do {
            System.out.println("Unesite drugi broj: ");
            y = sc.nextInt();


        } while (y == 0);

        int z = x / y;
        System.out.println("Rezultat je " + z);
    }
}
