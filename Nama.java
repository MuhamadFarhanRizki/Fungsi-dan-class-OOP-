package nama;
import java.util.Scanner;
public class Nama {
    public static void Nama(){
        String nama;
        int NPM;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        nama = input.next();
        System.out.print("Masukan NPM : ");
        NPM = input.nextInt();
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + NPM);
        System.out.println("---------------------------------------------------------------------");

        
    }
}

