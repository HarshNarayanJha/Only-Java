class FactFibo {

    int x;
    int y;

    FactFibo() {}

    FactFibo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int[] factorial() {
        int[] facts = new int[2];
        int fx = 1;
        int fy = 1;

        for (int i = 2; i <= x; i++) {
            fx *= i;
        }

        for (int i = 2; i <= y; i++) {
            fy *= i;
        }

        facts[0] = fx;
        facts[1] = fy;

        return facts;
    }

    int[] fibonacci() {
        assert y > x;
        int[] series = new int[y - x];

        int i = 0;

        int a = 0;
        int b = 1;
        int c = a + b;

        while (a <= y) {
            if (a >= x) {
                series[i++] = a;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return series;
    }
}

class constructors {

    public static void main(String args[]) {
        FactFibo fact = new FactFibo(4, 5);
        FactFibo fibo = new FactFibo(10, 50);

        int[] f = fact.factorial();
        int[] series = fibo.fibonacci();

        System.out.print("4! = " + f[0]);
        System.out.println(" 5! = " + f[1]);

        System.out.println("Fibonacci Series between 10 and 50: ");
        for (int i = 0; i < series.length; i++) {
            if (series[i] == 0 && i != 0) break;
            System.out.print(series[i] + " ");
        }

        System.out.println();
    }
}
