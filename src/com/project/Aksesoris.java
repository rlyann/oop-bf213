import java.util.Scanner;
class Aksesoris extends IndukAcc{
    Scanner keyboard = new Scanner(System.in );
        int a,b,c,d,
        
    f,g;
    protected int norek;

    @Override
        public void MembeliAksesoris(){
            
            Barang b1 = new Barang();
            Barang b2 = new Barang();
            Barang b3 = new Barang();
            b1.getBarang("Casan : Rp 30.000");
            b2.getBarang("Headset QKZ : Rp 50.000");
            b3.getBarang("Casing Hp : Rp 45.000");
        
        System.out.println("1. "+b1.getBarang());
        System.out.println("2. "+b2.getBarang());
        System.out.println("3. "+b3.getBarang());
        System.out.print("Masukan Pilihan Anda :");
        a = keyboard.nextInt();

        if(a==1){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();     

            if(b<30000){
                System.out.println("Uang anda kurang");
            }

            else{
                c = b - 30000;
                System.out.println("Kembalian : "+c );
                System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else if (a==2){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<50000){
                System.out.println("Uang anda kurang");
            }

            else{
                 d = b - 50000;
            System.out.println("Kembalian : "+d );
            System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else if (a==3){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<45000){
                System.out.println("Uang anda kurang");
            }

            else{
                 d = b - 45000;
            System.out.println("Kembalian : "+d );
            System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else{
            System.out.println("Tidak ada");
        }
    }


}