package cn.jacken.Thread.Timetask;

public class ThreadTimer {
    static  int count=0;
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是第"+(++count)+"个任务");
                }
            }
        }).start();
    }
}
