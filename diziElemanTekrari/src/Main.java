public class Main {

    static boolean isFind(int[] dizi,int value){
        for (int i : dizi) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrar = new int[dizi.length];
        int a=0,index=0;

        for(int i=0;i< dizi.length;i++){
            for(int j=0;j< dizi.length;j++){
                if((dizi[i] == dizi[j])){
                    a++;
                }

            }
            if(isFind(tekrar,dizi[i]) == false){
                tekrar[index++]= dizi[i];
                System.out.println(dizi[i] + " sayisi " + a + " kere tekrar etti ");
                a=0;
            }
            a=0;

        }
    }
}
