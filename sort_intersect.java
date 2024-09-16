import java.util.Scanner;

class sort_intersect {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements for Array 1? ");
        n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("How many elements for Array 2? ");
        m = sc.nextInt();

        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("> ");
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr1[j+1] < arr1[j]) {
                    int t = arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = t;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < m - 1; j++) {
                if (arr2[j+1] < arr2[j]) {
                    int t = arr2[j+1];
                    arr2[j+1] = arr2[j];
                    arr2[j] = t;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Array 1 Sorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        System.out.println("Array 2 Sorted: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        int least = m < n ? m : n;

        int[] intersection = new int[least];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection[index++] = arr1[i];
                }
            }
        }

        System.out.println("Intersection is: ");
        for (int i = 0; i < index; i++) {
            System.out.print(intersection[i] + ", ");
        }

        System.out.println();
    }
}
