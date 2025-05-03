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
   class Dhanendra{
    void car() {
         System.out.println(" car is running ");
    }
   }                                   
   class Khusboo{
    void tractor() {
         System.out.println(" tractor is running ");
    }
   }
    
    class PAPAkiPri  {
         void train() {
             System.out.println(" train is running ");
         }
    }
     public class inher{
         public static void main(String[] args) {
            PAPA  obj = new PAPA ();
             obj.car();
             obj.tractor();
             obj.train ();

         }
     }