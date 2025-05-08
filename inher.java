// class Employee{
//     void work(){
//         System.out.println("employee is working ");
//     }
// }
// class Manager extends Employee {
//     void attendMetting (){
//         System.out.println("metting is working");
//     }
// }

// public class inher{ 
//      public static void main(String[] args) {
        
     
//     Manager  obj = new Manager ();
//         obj.work();
//         obj.attendMetting();
//     }

// }

                                      //inheritance concept 
//    class Dhanendra{
//     void diaplayCow(){

//          System.out.println(" car is running ");
//     }
//    }                                   
//    class Khusboo extend Dhanendra  {
//     void displayClass() {
//          System.out.println(" tractor is running ");
//     }
//    }
    
//     class Papa extend Khusboo{
//          void checkDiscipline() {
//              System.out.println(" train is running ");
//          }
//     }
//      public class inher{
//          public static void main(String[] args) {
//             Papa obj = new Papa ();
//              obj.displayCow();
//              obj.displayClass();
//              obj.checkDiscipline();

//          }
//      }

//method overloading

// class Parent{
//      void sum(int a){
//           System.out.println("me hu boss"+ +a);
//      }
//      void sum(int a,int b){
//           System.out.println(a+b);
//      }
//      void sum(int a,int b,int c){
//           System.out.println(a+b+c);
//      }
// }

// public class inher{
//      public static void main(String[] args) {
//           Parent obj=new Parent();
//           obj.sum(420);
//           obj.sum(420,20);
//           obj.sum(420, 20 , 30);

//      }
// }

// class Parent{
//      void sum(int a){
//           System.out.println("me hu boss"+ +a);
//      }
//      void sum(int a,int b){
//           System.out.println(a+b);
//      }
//      void sum(double a,double b){
//           System.out.println(a+b);
//      }
//      void sum(int a,int b,int c){
//           System.out.println(a+b+c);
//      }
// }

// public class inher{
//      public static void main(String[] args) {
//           Parent obj=new Parent();
//           obj.sum(420);
//           obj.sum(420,20);
//           obj.sum(42.3,20.0);
//           obj.sum(420, 20 , 30);

//      }
// }

// class Parent{
//      void area(int a,int b){
//           System.out.println("area of rectangle"+ " "+ a*b);
//      }
//      void area(int a){
//           System.out.println("area of square"+ " "+4*a);
//      }
//      void sum(double a,double b){
//           System.out.println(a+b);
//      }
//      void sum(int a,int b,int c){
//           System.out.println(a+b+c);
//      }
// }

// public class inher{
//      public static void main(String[] args) {
//           Parent obj=new Parent();
//           obj.area(420 ,23);
//           obj.area(420);
//           obj.sum(42.3,20.0);
//           obj.sum(420, 20 , 30);

//      }
// }

// class inher{
//      int age =15;
//      void data(){
//           System.out.println(this);
//      }
//      public static void main(String[] args) {
//           inher obj =new inher();
//           obj.data();
//           System.out.println(obj.age);
//      }
// }

// class student{
//      int age;
//      student(int age){
//           this.age=age;

//      } 
//      void print(){
//           System.out.println(age);
//      }
// }
// class inher{
//      public static void main(String[] args) {
//           student obj=new student(12);
//           obj.print();
//      }
// }
                                                  //method overrriding
     //     class Vehicle{
     //      void run(){
     //           System.out.println("vehicle chalta he bhai");
          
     //      }
     //     }
     //     class Bike extends Vehicle{
     //      void run(){
     //           System.out.println("bhai ye bhi chalti he ");
     //           super.run();
     //      }
     //      }
     //        class inher{
     //      public static void main(String[] args) {
     //           Vehicle obj=new Bike();
               
     //           obj.run();
     //      }
     //     }                    
     //                                              abstruct 


     abstract class payment{
          abstract void pay(int a);
               void success(){
                    System.out.println("payment done");

               }
          }
          class netupi extends payment{
               void pay(int a){
                    System.out.println("pay via upi" +a);
               }
          }
          class netbanking extends payment{
               void pay( int b ){
                    System.out.println("pay via netbanking" +b);
               }
          }
     
     class inher{
          public static void main(String[] args) {
               payment obj = new netupi();
               obj.pay(2500);
               obj.success();

               payment obj1= new netbanking();
               obj1.pay(2400);
               obj1.success();
          }
     }                     