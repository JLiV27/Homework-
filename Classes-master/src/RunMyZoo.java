public class RunMyZoo {
    public static void main(String[] args) {
        System.out.println("Mx. Bradford's ZOOO!!!!!!!!!");
        RunMyZoo r = new RunMyZoo();
    }
    public RunMyZoo(){
        Elephant e = new Elephant();
        e.eat();
        e.walk();
        Gorilla h = new Gorilla();
        h.walk();
        h.eat();

        Pengiun p = new Pengiun();
        p.fly();

        Tucan t = new Tucan();
        t.sleep();
    }
}
