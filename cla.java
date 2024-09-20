class cla {
    public static void main(String[] args) {
        int S=0;
        for (String e: args) {
            int n= Integer.parseInt(e);
            S+= n;

        }
    System.out.print((float)S/args.length);
}
}
