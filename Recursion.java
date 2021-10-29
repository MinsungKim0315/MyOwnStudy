package Study;

public class Recursion {
    public static void mystery(int i) {
        if (i <= 0) { // base case
        return;
        }
        // recursive case                 recursions does not change the acutual value, it is like counter
        System.out.println(i);
        mystery(i - 1);
        System.out.println(i);
        }
        

    public static void main(String[] args){
        mystery(2);
    }
}
