package referencetype.practice;

public class StringExample {
    public static void main(String[] args) {
        String str1;
        str1 = "초코 오레오";
        String str2 = " 맥플러리";
        System.out.println(str1 + str2);

        String str3 = new String("초코 오레오");
        System.out.println(str3);

        System.out.println("==============");
        System.out.println(str1.equals(str3));
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str3));
    }
}
