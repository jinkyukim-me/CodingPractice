package condition.sec02;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
