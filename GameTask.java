package gametask;

import java.util.Scanner;

public class GameTask extends Thread{
    static int count=0;
    static int sum=0;
    static int num;
    static Thread th;
    public static void main (String[] args) {
        Scanner scr=new Scanner(System.in);
        GameTask gt = new GameTask();
        th=new Thread(gt);
        th.start();
        
//        Thread.sleep(10000);

        for(int i=1;i<=3;i++){
            String str=scr.next();
            sum=sum+num;
            count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("your points: "+sum);
        if(sum>300)
            System.out.println("you win!!!");
        else
            System.out.println("you lose!!!");
    }
    @Override
    public void run(){
        for(;;){
            num=(int)(Math.random()*100);
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if(count==3)
                break;
        }
    }
}