
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

class produce extends produce{
        public void run(){
                System.out.println("hii");
        }
}
class thread{
        public static void main(String[] args) {
                produce p1= new produce();
                p1.start();
        }
}