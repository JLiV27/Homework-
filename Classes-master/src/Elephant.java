import java.sql.SQLOutput;

public class Elephant implements Mammal {
    private int tuskLength;
    private int weight;
    private int length;
    private String name;
    private boolean isAlive;
    private String color;
    public Elephant(){
        tuskLength =0;
        weight = 60;
        length = 1;
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

    public int getTuskLength(){
        return tuskLength;
    }

    public void setTuskLength(int pTuskLength){
        tuskLength = pTuskLength;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int pWeight){
        weight = pWeight;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int pLength){
        length = pLength;
    }

    public String getName(){
        return name;
    }

    public void setName(String pName){
        name = pName;
    }

    public boolean getIsALive(){
        return isAlive;
    }

    public void setIsAlive(boolean pIsAlive){
        isAlive = pIsAlive;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String pColor){
        color = pColor;
    }
}
