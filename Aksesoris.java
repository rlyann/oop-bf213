import java.util.Scanner;
class Aksesoris extends IndukAcc{
    Scanner keyboard = new Scanner(System.in );
        int a,b,c,d,
    f,g;
    private void display(){
        System.out.println("001");
    }
    protected int norek;

    @Override
        public void MembeliAksesoris(){
        
        System.out.println("1 . Casan Type C : Rp 30.000");
        System.out.println("2. Headset QKZ : Rp 50.000");
        System.out.println("3. Casing Hp : Rp 45.000");
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