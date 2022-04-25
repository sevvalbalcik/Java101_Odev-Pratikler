public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Sevval",10,90,100,30);
        Fighter f2 = new Fighter("Baris",10,100,100,40);

        Match m1 = new Match(f1,f2,85,110);
        m1.run();
    }
}
