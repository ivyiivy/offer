public class Single {

}

//饿汉式
class S1 {
    private final static S1 s = new S1();

    private S1() {
    }

    public static S1 getS() {
        return s;
    }
}

//懒汉式
class S2 {
    private static S2 s = null;

    private S2() {
    }

    public static S2 getS(){
        if (s==null){
            synchronized(S2.class){
                if (s==null){
                    s=new S2();
                }
                return s;
            }
        }
        return s;
    }
}
//静态内部类

class S3{
    private S3(){}

    private static class SingleHolder{
        private static S3 s=new S3();
    }

    public static S3 getInstance(){
        return SingleHolder.s;
    }
}

