import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

         int k,i;
        System.out.print("Bir sayi giriniz:");
        k=inp.nextInt();
         if(k>0){
        for( i=1;i<=k;i++){
            if(i % 12==0){
                System.out.println(i);
            }}}
        else{
                 System.out.println("Lütfen 0 dan büuük bit sayi giriniz");
        }


    }

}