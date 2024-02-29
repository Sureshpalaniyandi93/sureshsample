public class call {
    public static void main(String[] args) {

        constructorexample exm2 = new constructorexample(4,5);
        constructorexample exm = new constructorexample(7,9);
        int res1=  exm2.geta();
        System.out.println(res1);
        exm2.seta(89);
        int res2=  exm2.geta();
        System.out.println(res2);
    }
}