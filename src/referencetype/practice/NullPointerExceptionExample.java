package referencetype.practice;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = "Jayden";
        System.out.println("총 문자수: " + str.length());

        int[] intArray = {1,2,3,4,5};
        intArray[0] = 10;
        for(int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
