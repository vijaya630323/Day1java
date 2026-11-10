 class Scope {
    public static void main(String[] args) {
        int a=10;
        int c=100;
        System.out.println(c);
        {
            int b=20;
            c = b;
            System.out.println(a);
            System.out.println(b);
        }
 System.out.println(a);
 System.out.println(c);
    }
}
