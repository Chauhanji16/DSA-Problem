import java.util.Scanner;

public class ElementSearchIn2DMatrux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of row ");
        int n = sc.nextInt();
        System.out.println("enter the length  colomn");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("value for row = " + i + "and  colomn = " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("element in array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Target is preset in this matrix at index of row" +i+j);
                    return;
                }
            }
        }
        System.out.println("target is not present in this matrix");
       sc.close();
    }
}
