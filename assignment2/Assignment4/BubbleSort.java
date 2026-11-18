package assignment2.Assignment4;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {42, 17, 35, 8, 36};
        int n = a.length;
        
        for (int pass = 1; pass < n; pass++) { // Outer loop
            boolean swapped = false;
            for (int i = 0; i < n - pass; i++) {// Inner loop
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            System.out.print("Pass " + pass + ": ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
