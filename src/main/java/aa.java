public class aa {
    public static void main(String[] args) {
        System.out.println("chun");
        int n =4;
        int a = su(n);
        System.out.println(a);
    }
    public static int su(int n){
        System.out.println("a");
        if (n==1){
            return 1;
        }
        return n+su(n-1);
    }
}
