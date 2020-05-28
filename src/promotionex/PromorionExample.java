package promotionex;

class PromotionA {}

class PromotionB extends PromotionA {}
class PromotionC extends PromotionA {}

class PromotionD extends PromotionB {}
class PromotionE extends PromotionC {}

public class PromorionExample {
    public static void main(String[] args) {
        PromotionB promotionB = new PromotionB();
        PromotionC promotionC = new PromotionC();
        PromotionD promotionD = new PromotionD();
        PromotionE promotionE = new PromotionE();

        PromotionA a1 = promotionB;
        PromotionA a2 = promotionC;
        PromotionA a3 = promotionD;
        PromotionA a4 = promotionE;

        PromotionB b1 = promotionD;
//        PromotionB b2 = promotionE;

        PromotionC c1 = promotionE;
//        promotionC c2 = promotionD;
    }
}
