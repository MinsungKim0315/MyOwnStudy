package Study;

public class ZooKeeper {
    public void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Crocodile crocodile = new Crocodile();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
        }
}
