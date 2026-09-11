
public class PeakofMountenArray {
    public static void main(String[] args) {
        int[] arr = { 11, 34, 56, 78, 99, 102, 105, 107, 100, 99, 87, 76, 65, 54, 32, 21, 11, 9 };
        int start = 0;
        int end = arr.length - 1;
        int peakindx = arr[0];
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] < arr[mid + 1]) {
                peakindx = arr[mid + 1];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println(peakindx);
    }
}
