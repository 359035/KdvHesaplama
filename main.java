import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kdvsizTutar,kdvorani=0.18,kdvliTutar,kdvTutar;
        System.out.print("Ücret Tutarýný Giriniz:");
        kdvsizTutar=input.nextDouble();
        kdvTutar=kdvsizTutar*0.18;
        kdvliTutar=kdvsizTutar+kdvTutar;
        System.out.println("Kdvsiz Tutar:"+kdvsizTutar);
        System.out.println("Kdv Oraný:"+kdvorani);
        System.out.println("Kdv Tutarý:"+kdvTutar);
        System.out.println("Kdvli Tutar:"+kdvliTutar);
    }
}
