public class Doubt {
    public static void main(String[] args) throws CloneNotSupportedException {
        Doubt d = new Doubt();
        Object clone = d.clone();
//        System.out.println(clone);
//        d.sample();
//        d.sample1();

    }
    void  sample(){
        System.out.println("sample1");

    }
    void  sample1(){
        System.out.println("sample2");

    }

}
