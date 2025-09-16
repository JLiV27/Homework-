public class Gorilla implements Mammal {
    public String name;
    public boolean isAlive;
    public String whoIsTheEnemy;
    public Gorilla(){
        name = "Harambe";
        isAlive = false;
        whoIsTheEnemy = "cincy zookeeper";
    }

    @Override
    public void walk() {
        System.out.println("crawl crawl");
    }


    public void eat() {
        System.out.println("chomp chomp");
    }

    @Override
    public void sleep() {

    }
}
