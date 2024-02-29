public class constructorexample {
    private int a;
    private int b;
    public constructorexample(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("hello i am fom const 1 a is"+a +"bis"+b);
    }
    public int geta(){
        return this.a;
    }
    public void seta(int a){
       this.a=a;
    }
}