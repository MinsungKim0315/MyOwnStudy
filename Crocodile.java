package Study;

public class Crocodile extends Animal implements Predator, Barkable {
    public String getFood(){
        return "pear";
    }
    public void bark(){
        System.out.println("쩝쩝");
    }
}