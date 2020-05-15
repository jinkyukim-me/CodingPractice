package condition.practice;

public class ForExample {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for(x=1; x<11; x++) {
            for(y=1; y<11; y++) {
                if(4*x+5*y==60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
    }
}
