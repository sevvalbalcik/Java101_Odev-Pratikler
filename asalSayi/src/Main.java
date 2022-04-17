
public class Main {
    public static void main(String[] args) {

        System.out.print("2 ");

        for(int i=3;i<100;i++)
        {
            int sorgu=0;
            for(int k=2;k<i;k++)
            {
                if((i%k) == 0)
                {
                    sorgu=1;
                    break;
                }
            }

            if(sorgu==0)
            {
                System.out.print(i + " ");
            }
        }


    }
}
