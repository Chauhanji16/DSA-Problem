public class NumberReapeateinarray {
        public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9 };
        int target = 3;
        int numoccer=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target is found  on the index of " + i);
                break;
            }   
        }
        System.out.println();
         for( int i=0; i<arr.length; i++){
            if(target==arr[i]){ 
              numoccer=numoccer+1; 
            }
         }
           System.out.println("the num occer in array is "+numoccer+ " time");
    }
}


