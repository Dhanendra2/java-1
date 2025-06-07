
//                                                                  bank game
// class WithdrawThread extends Thread{
//         static int totalBalance=1000;
//         int amount;
//         public WithdrawThread(int amount){
//                 this.amount=amount;
//         }
//         public void run(){
//                 if(totalBalance>=amount){
//                         System.out.println("your account xxxx. created=" + amount);
//                         totalBalance-=amount;
//                         System.out.println(totalBalance);
//                 }
//                 else{
//                         System.out.println("not enough balance");

//                 }
//         }
// }
// class ALL{
//         public static void main(String[] args) {
//                 WithdrawThread obj=new WithdrawThread(800);
//                 WithdrawThread obj1=new WithdrawThread(500);
//                 Thread t1= new Thread(obj);
//                  Thread t2= new Thread(obj1);
//                 t1.start();
//                 try {
//                         t1.join();
//                 } catch (Exception e) {
//                         // TODO: handle exception
//                         e.printStackTrace();
//                 }
//                 t2.start();
//         }
// }

//                                                         synchronized method

// class WithdrawThread extends Thread{
//         static int totalBalance=1000;
//         int amount;
//         public WithdrawThread(int amount){
//                 this.amount=amount;
//         }
//         public void run(){
//                 if(totalBalance>=amount){
//                         System.out.println("your account xxxx. created=" + amount);
//                         totalBalance-=amount;
//                         System.out.println(totalBalance);
//                 }
//                 else{
//                         System.out.println("not enough balance");

//                 }
//         }
// }
// class ALL{
//         public static void main(String[] args) {
//                 WithdrawThread obj=new WithdrawThread(800);
//                 WithdrawThread obj1=new WithdrawThread(500);
//                 Thread t1= new Thread(obj);
//                  Thread t2= new Thread(obj1);
//                 t1.start();
//                 try {
//                         t1.join();
//                 } catch (Exception e) {
//                         // TODO: handle exception
//                         e.printStackTrace();
//                 }
//                 t2.start();
//         }
// }

// class thread{
//         public static void main(String[] args) {
//                 System.out.println("iddher dhekho re");
//                 Thread t1=new Thread(()-> {
//                         System.out.println("hello");
//                 });
//                 Thread t2 = new Thread(()-> {
//                         System.out.println("hiii");
//                 });
//                 t1.start();
//                 t2.start();
//                 // System.out.println("mee bad me pahuchuga");
//         }
// }

// class MyThread extends Thread{
// public void run (){
//         for( int i=1; i<=10; i++){
//                 System.out.println(getName()+ "IS RUNNING with priority");
//         }
// }
// }
// class thread{
//         public static void main(String[] args) {
//                 MyThread t1= new MyThread();
//                 MyThread t2 = new MyThread();
                
//                 t1.setName(" low priority thread");
//                  t2.setName(" high priority thread");

//                  t1.setPriority( Thread.MIN_PRIORITY);
//                  t2.setPriority( Thread.MAX_PRIORITY);

//                  t1.start();
//                  t2.start();
//         }
// }

//  public class  thread{
//         private boolean isSignalled=false;
//         public synchronized void sendSignal(){
//                 isSignalled=true;
//                 System.out.println("producer: sending signal..");
//                notify();

//         }
//         public synchronized void waitForSignal(){
//                 while(!isSignalled){
//                         try {
//                                 System.out.println("consumer: waiting for signal...");
//                                wait();
//                         } catch (InterruptedException e) {
//                                 // TODO: handle exception
//                         }
//                 }
//                 System.out.println("consumer: go the signal! proceeding ");
//         }
// public static void main(String[] args) {
//         thread obj = new  thread();

//         Thread consumer = new Thread(() -> {
//             obj.waitForSignal();
//         });

//         Thread producer = new Thread(() -> {
//             try {
//                 Thread.sleep(5000);
//             } catch (InterruptedException e) {
//             }
//             obj.sendSignal();
//         });

//         consumer.start();
//         producer.start(); 
// }
//         }
 
// public class  thread{
//         public static void main(String[] args) {
//                 Runnable r =new Runnable(){
//                         public void run(){
//                                 System.out.println("runnable using anonymous class");
//                         }
//                 };
//                 r.run();
                
//         }

// public class RunnableLambda{
//         public static void main(String[] args) {
//                 Runnable r = ()-> System.out.println("runnable using lambda ");
//                 r.run();
//         }
// }
// }

// import java.util.ArrayList;
// import java.util.Collection;

// class thread{
//         public static void main(String[] args) {
//                 ArrayList <String> list = new ArrayList<>();
//                 list.add("rahul");
//                 list.add("rohan");
//                 list.add("ramesh");
//                 Collection.sort(list,(a,b)->a.compareTo(b));
//                 System.out.println(list);
//         }
// }
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Collection;

class thread{
        public static void main(String[] args) {
                ArrayList <Integer> list = new ArrayList<>();
                list.add(4);
                list.add(3);
                list.add(9);
                 int sum=   list.stream().reduce(0,(a,b)->a+b);
                  
                 System.out.println(sum);
        }
}