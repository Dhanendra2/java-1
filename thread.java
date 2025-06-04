class WithdrawThread extends Thread{
        static int totalBalance=1000;
        int amount;
        public WithdrawThread(int amount){
                this.amount=amount;
        }
        public void run(){
                if(totalBalance>=amount){
                        System.out.println("your account xxxx. created=" + amount);
                        totalBalance-=amount;
                        System.out.println(totalBalance);
                }
                else{
                        System.out.println("not enough balance");

                }
        }
}
class ALL{
        public static void main(String[] args) {
                WithdrawThread obj=new WithdrawThread(800);
                WithdrawThread obj1=new WithdrawThread(500);
                Thread t1= new Thread(obj);
                 Thread t2= new Thread(obj1);
                t1.start();
                try {
                        t1.join();
                } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                }
                t2.start();
        }
}
