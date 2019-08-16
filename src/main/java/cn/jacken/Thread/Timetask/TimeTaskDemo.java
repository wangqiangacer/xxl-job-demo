package cn.jacken.Thread.Timetask;

import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskDemo {
    static  int count=0;
    public static void main(String[] args) {
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println("我是第"+(++count)+"个任务");
            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask,0,1000);
    }
}
