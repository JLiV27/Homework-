public class Tucan implements Mammal {
    public String name;
    public boolean isExtinct;
    public int beakLength;
    public Tucan(){
        name = "Bart";
        isExtinct = true;
        beakLength = 10;
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
        System.out.println("Zzz");
    }
}
