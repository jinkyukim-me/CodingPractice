package methodex;

public class Calculator {
    // 메소드
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double plus1(double x, double y) {
       double result = x / y;
       return result;
    }
    
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
    
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }


    int sum(int[] values)  {
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
