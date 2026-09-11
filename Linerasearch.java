public class Linerasearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target is found  on the index of " + i);
                return;
            }   
        }
         System.out.println("target is not foun");
    }
}
