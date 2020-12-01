public class aa {
    public static void main(String[] args) {
        System.out.println("1111111111111");
        int n =4;
        int a = su(n);
        System.out.println(a);
    }
    public static int su(int n){
        if (n==1){
            return 1;
        }
        return n+su(n-1);
    }
}
