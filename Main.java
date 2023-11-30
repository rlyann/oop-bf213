import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in );

        int a;
        Induk induk = new Anak();
        IndukAcc indukAcc = new Aksesoris();

        System.out.println("Selamat datang di Program UAS PBO");
        System.out.println("1. Handphone");
        System.out.println("2. Laptop");
        System.out.println("3. Aksesoris");
        System.out.print("Masukkan Pilihan : ");
        a = keyboard.nextInt();

        if(a==1){
            induk.MembeliHandphone();
        }

        else if(a==2){
            induk.MembeliLaptop();
        }

         else if(a==3){
            indukAcc.MembeliAksesoris();
        }

        else{
            System.out.println("Pilihan Tidak Ada");
        }


    }
}