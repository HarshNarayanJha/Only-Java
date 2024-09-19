import java.util.ArrayList;


class inheritence {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[4] = 8;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        printArray(arr);

        arr[6] = 10;

        for (int e: arr) {
            System.out.println(e);
        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);

        System.out.println(al);
    }
}
