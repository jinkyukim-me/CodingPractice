package referencetype.sec02;

public class ArraryCreateByNewExample {
    public static void main(String[] args) {

        int[] arr1 = new int[3];
        for(int i=0; i<arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println("------------");
        for(int i=0; i<arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        System.out.println("------------");

        double[] arr2 = new double[3];
        for(int i=0; i<arr2.length; i++) {
            System.out.println("arr2[" + i +"] : " + arr2[i]);
        }
        arr2[0] = 10.1;
        arr2[1] = 20.2;
        arr2[2] = 30.3;
        System.out.println("-----------");
        for(int i=0; i<arr2.length; i++) {
            System.out.println("arr2[" + i +"] : " + arr2[i]);
        }
        System.out.println("-----------");

        String[] arr3 = new String[3];
        for(int i=0; i<arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
        System.out.println("-----------");
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i=0; i<arr3.length; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }




    }
}
