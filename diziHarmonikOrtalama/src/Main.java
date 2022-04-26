public class Main {
    public static void main(String[] args) {
        int[] dizi = {3,5,9,6,7};
        int i;
        double toplam = 0.0;

        for(i=0;i<dizi.length;i++){
            toplam = 1.0/ dizi[i];
        }

        System.out.println("Harmonik Ortalama : " + (dizi.length/toplam));
    }
}
