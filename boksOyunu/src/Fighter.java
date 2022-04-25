public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    double dodge;


    Fighter(String name,int damage,int weight,int health,double dodge){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        this.dodge = dodge;
        if(this.dodge >= 0 && this.dodge <= 100){
            this.dodge = dodge;
        }else{
            System.out.println("Gecerli bir yuzde girin!");
        }
    }

    int hit(Fighter foe){

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");

        if(foe.isDodge()){
            System.out.println(foe.name + " Gelen Hasari Savurdu ! ");
            return foe.health;
        }

        if(foe.health - this.damage < 0){
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }


}
