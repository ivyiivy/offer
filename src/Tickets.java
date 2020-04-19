//线程安全的购票程序

public class Tickets {
    public static void main(String[] args){
        Sale sale=new Sale(100000);
        new Thread(sale).start();
        new Thread(sale).start();
        new Thread(sale).start();
        new Thread(sale).start();

    }
}


class Sale implements Runnable{
    private int ticketsNum;

    public Sale(int ticketsNum){
        this.ticketsNum=ticketsNum;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                    if(ticketsNum>0) {
                        System.out.println(Thread.currentThread() + "剩余票数： " + ticketsNum--);
                    }
                    else{
                        break;
                    }
                }
        }
    }
}