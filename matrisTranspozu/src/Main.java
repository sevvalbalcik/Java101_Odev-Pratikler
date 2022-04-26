import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int satir,sutun;

        System.out.print("Dizinizin satir sayisini giriniz : ");
        satir = inp.nextInt();
        System.out.print("Dizinizin sutun sayisini giriniz : ");
        sutun = inp.nextInt();

        int[][] dizi = new int[satir][sutun];
        int[][] yeni = new int[sutun][satir];

        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print("Dizinizin " + (i+1) + ". degerini giriniz : ");
                dizi[i][j] = inp.nextInt();
            }
        }

        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                yeni[j][i]=dizi[i][j];
            }
        }

        for(int i=0;i<sutun;i++){
            for(int j=0;j<satir;j++){
                System.out.print(yeni[i][j] + " ");
            }
            System.out.println();
        }
    }
}
