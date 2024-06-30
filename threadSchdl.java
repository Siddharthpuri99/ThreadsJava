import java.util.*;
class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i =0;i<3;i++){
            System.out.println(n);
        }
    }
}
public class threadSchdl {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("thread1");
        t2.setName("thraed2");
        t3.setName("thraed3");
        t1.start();
        t2.start();
        t3.start();
        String n = Thread.currentThread().getName();
        for(int i =0;i<3;i++){
            System.out.println(n);
        }

    }
}
