import java.util.Scanner;
class Anak implements Induk{
    Scanner keyboard = new Scanner(System.in );
    
    int a,b,c,d,
    f,g;

    private void display(){
        System.out.println("002");
    }
    protected int norek;

    @Override
    public void MembeliLaptop(){
        
        System.out.println("1. Acer Nitro 5 : 14.000.000");
        System.out.println("2. Asus ROG  : 27.000.000");
        System.out.println("3. MacBook  : 28.000.000");
        System.out.print("Masukkan pilihan anda : ");
        a = keyboard.nextInt();

        if(a==1){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();
            
            if(b<14000000){
                System.out.println("Uang anda kurang");
            }

            else{
                c = b - 14000000;
                System.out.println("Kembalian : "+c );
            }
           
        }

        else if (a==2){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<27000000){
                System.out.println("Uang anda kurang");
            }

            else{
                 d = b - 27000000;
            System.out.println("Kembalian : "+d );
            System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else if (a==3){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<28000000){
                System.out.println("Uang anda kurang");
            }

            else{
                 d = b - 28000000;
            System.out.println("Kembalian : "+d );
            System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else{
            System.out.println("Tidak ada");
        }
    }


    @Override
    public void MembeliHandphone(){
        System.out.println("1. IP 13 : 25.000.000");
        System.out.println("2. IP 13 pro : 27.000.000");
        System.out.println("3. Samsung Galaxy S20 : 28.000.000");
        System.out.print("Masukkan pilihan anda : ");
        a = keyboard.nextInt();

        if(a==1){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<25000000){
                System.out.println("Uang anda kurang");
            }

            else{
                f = b - 25000000;
                System.out.println("Kembalian : "+f );
                System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else if (a==2){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<27000000){
                System.out.println("Uang anda kurang");
            }

            else{
                 g = b - 27000000;
                System.out.println("Kembalian : "+g );
                System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else if (a==3){
            System.out.print("Masukkan No Rek : ");
            norek = keyboard.nextInt();

            System.out.print("Masukkan uang anda : ");
            b = keyboard.nextInt();

            if(b<28000000){
                System.out.println("Uang anda kurang");
            }

            else{
                 g = b - 28000000;
                System.out.println("Kembalian : "+g );
                System.out.println("Terima kasih Telah membeli diStore kami");
            }
           
        }

        else{
            System.out.println("Tidak ada");
        }
}
}
