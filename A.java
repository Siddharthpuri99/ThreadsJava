import java.util.*;
class B extends Thread{
    // @Override
    // public void run(){
    //     for(int i =0;i<5;i++){
    //         System.out.println("sidharth");
    //     }
    // }
    // @Override
    // public void fun(){
    //     for(int i =0;i<5;i++){
    //         System.out.println("sidharth");
    //     }
    // }
}
public class A {
    public static void main(String[] args) throws InterruptedException {
        B t = new B();
        t.fun();
        for(int i =0;i<5;i++){
            System.out.println("sid");
            Thread.sleep(1000);
        }
    }
}
//thread by extending thrad class//////////////////////