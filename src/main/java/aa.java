public class aa {
    public static void main(String[] args) {
        /*int n=0;

        for (int i =0;i<=100;i++){
            n+=i;
            int a=n;
            System.out.println(n);
        }*/
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
