public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int target = 6;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                System.out.println("target is present " + arr[mid]);
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid=(start+end)/2;
        }
        if (arr[mid] != target) {
            System.out.println("target is not present");
        }

    }

}
