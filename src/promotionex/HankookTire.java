package promotionex;

public class HankookTire extends Tire {
    public HankookTire(String locaton, int maxRotation) {
        super(locaton, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
