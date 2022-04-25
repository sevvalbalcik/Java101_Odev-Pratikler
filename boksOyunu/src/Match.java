public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double oran=50.0;
    int i=1;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.oran = oran;
    }

    void run(){
        if(checkWeight()){

            while (f1.health > 0 && f2.health > 0){
                System.out.println(i + ". ROUND ");
                i++;
                if(isFighter()){
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }else{
                    f1.health = f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                }
                printScore();
            }
        }else{
            System.out.println("Dovusculerin kilolari uyusmuyor!");
        }
    }

    boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println("\n" + this.f2.name + " Kazandi!");
            return true;
        }if(this.f2.health == 0){
            System.out.println("\n" + this.f1.name + " Kazandi!");
            return true;
        }
        return false;
    }

    void printScore(){
        System.out.println(this.f1.name + " " + this.f1.health + " Cani Kaldi ");
        System.out.println(this.f2.name + " " + this.f2.health + " Cani Kaldi \n");
    }

    boolean isFighter(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.oran;
    }
}
