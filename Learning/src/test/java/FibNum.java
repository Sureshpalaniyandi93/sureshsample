public class FibNum {
    public static void main(String[] args) {

        int n=10,
        firsrterm=0,
        seconfterm=1;
        System.out.print(firsrterm+",");
        for(int i=0;i<n;i++){
            int temp= firsrterm+seconfterm;
            firsrterm=seconfterm;
            seconfterm=temp;
            System.out.print(temp+" ,");
        }



    }
}
