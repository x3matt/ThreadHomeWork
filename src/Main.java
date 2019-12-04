public class Main {
    public static void main(String[] args){
        ThreadMaster master1 = new ThreadMaster();
        ThreadMaster master2 = new ThreadMaster();
        master1.start();
        master2.start();
        System.out.println(master2.getCounter());
    }
}
