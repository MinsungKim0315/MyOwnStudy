package Study;

public class Bouncer {
    public void barkAnimal(Barkable barkable) {
        barkable.bark();
    }
    public static void main(String[] args) {
        Bouncer bouncer= new Bouncer();
        Tiger tiger = new Tiger();
        Crocodile crocodile = new Crocodile();
        Lion lion = new Lion();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(crocodile);
        }
}
