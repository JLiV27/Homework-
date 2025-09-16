import java.sql.SQLOutput;

public class Elephant implements Mammal {
    int tuskLength;
    int wieght;
    int lenght;
    String name;
    boolean isAlive;
    String color;
    public Elephant(){
        tuskLength =0;
        wieght = 60;
        lenght = 1;
        name = "Robert";
        isAlive = true;
        color = "Pink";

    }

    @Override
    public void walk() {
        System.out.println("step step step");
    }

    @Override
    public void eat() {
        System.out.println("nom nom");
    }

    @Override
    public void sleep() {

    }
}
