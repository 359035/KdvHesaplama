import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kdvsizTutar,kdvorani=0.18,kdvliTutar,kdvTutar;
        System.out.print("�cret Tutar�n� Giriniz:");
        kdvsizTutar=input.nextDouble();
        kdvTutar=kdvsizTutar*0.18;
        kdvliTutar=kdvsizTutar+kdvTutar;
        System.out.println("Kdvsiz Tutar:"+kdvsizTutar);
        System.out.println("Kdv Oran�:"+kdvorani);
        System.out.println("Kdv Tutar�:"+kdvTutar);
        System.out.println("Kdvli Tutar:"+kdvliTutar);
    }
}
