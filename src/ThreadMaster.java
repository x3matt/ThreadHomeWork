public class ThreadMaster extends Thread{
    static int counter = 0;
    static boolean status = true;
    public void run(){
        status=!status;
        while(counter<1000) {
            if (!status) {
                counter++;
            } else {
                counter--;
            }
        }
    }
    public int getCounter(){
        return counter;
    }
}
