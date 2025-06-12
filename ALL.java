
//import java.util.* ;
// public class ALL{
//     public static void main(String[] args) {
                                                                      //print 2D array
        // int [] [] arr = {
        //     {1,2,3},
        //     {4,4,5},
        //     {5,8,6}
        // } ;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        // }
        // System.out.println();

                                                                       //sum of 2D array

//         int [] [] arr = {
//             {1,2,3},
//             {4,4,5},
//             {5,8,6}
//         } ;
//         int sum =0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[i].length; j++){
//             sum+= arr[i][j];

// System.out.println("total sum"+ sum);
//     }
// }
                                                                             //row wise sum
// 

// int [] [] arr = {
//              {1,2,3},
//                  {4,4,5},
//                  {5,8,6}
//              } ;

// for (int i = 0; i < arr.length; i++) {
//     int rowSum = 0;
//     for (int j = 0; j < arr[i].length; j++) {
//     rowSum += arr[i][j];
//     }
//     System.out.println("Sum of Row " + i + ": " + rowSum);
//    }
                                                                // colum wise sum
         
                                                    //             int [] [] arr = {
                                                    //                 {1,2,3},
                                                    //                     {4,4,5},
                                                    //                     {5,8,6}
                                                    //                 } ;
                                                       
                                                    //    for (int i = 0; i < arr.length; i++) {
                                                    //        int colSum = 0;
                                                    //        for (int j = 0; j < arr[i].length; j++) {
                                                    //        colSum += arr[j][i];
                                                    //        }
                                                    //        System.out.println("Sum of Row " + i + ": " + colSum);
                                                    //   }                                                                        
                                        //matrix me sabse bada element
         
                                        
                            //             int [] [] arr = {
                            //                 {1,2,3},
                            //                     {4,4,5},
                            //                     {5,8,6}
                            //                 } ;
                            //    int min= arr[0][0];
                            //    for (int i = 0; i < arr.length; i++){

                               
                            //        for (int j = 0; j < arr[i].length; j++) {
                            //        if(arr[i][j] > min) {
                            //        min= arr[i][j];
                            //        }
                            //        }
                            //     }
                            //     System.out.println("minimum element "+ min);

                                                             //lenear search
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter the size of array ");
        // int n = in.nextInt();
        // int [] arr = new int[n] ;
        // System.out.println("enter element");
        // for(int i=0; i<n; i++){
        //     arr[i]= in.nextInt();

        // }
        // System.out.println("enter number to search");
        // int x = in.nextInt();
        //    boolean found = false;
        //    for(int val : arr){
        //     if( val==x){
        //         found = true;
        //         break;
        //     }


        //    }
        //    if(found){
        //     System.out.println(x + " present ");
        //    }
        //    else
        //    {
        //     System.out.println(x + " not present");
        //    }

//method(function) non static

        //   public class ALL{
        //      void sum (int a){
        //         System.out.println(a);
        //     }
        //     public static void main(String[] args) {
        //         ALL obj=new ALL();
        //         obj.sum (5);
        //     }
        //   }                                                   
    //global variable
        // public class ALL{
        //     int a=5;
           
        //    public static void main(String[] args) {
        //     ALL obj=  new ALL();
        //     System.out.println(obj.a);
        //     // ALL obj=  new ALL();
        //       // obj.sum (5);
           

        // bullle sort
        // public class ALL{
        //     static void bubblesort(int[] arr){
        //         for(int i=0; i<arr.length-1; i++){
        //             for(int j=0; j<arr.length-i-1; j++){
        //                 if(arr[j]= arr[j+1]){
        //                     int temp=arr[j];
        //                     arr[j+1]=temp;
        //                 }


        //             }
        //         }
        //         System.err.println(arr[i]);
        //     }
        // }    
        //  public static void main(String[] args){
        //     int[] arr = {1,4,6,3,7};
            
        //     ALL obj=new ALL();
        //     obj.bubblesort(arr[j]);
            
        // }*
    
                                                     // constructor( two or more conductor)

   
        //inheritance
        // class employe{
        //     void work() {
        //         System.out.println("employee is working");

        //     }
        // }
        // class manager extand employee{
        //     void attendmetting(){
        //         System.out.println("manager is attend metting ");
        //     }
        // }
        // public class ALL{
        //     public static void main(String[],args){
        //         manager m = new manager();
        //         m.work();
        //         m.attendmetting();
        //     }
        // }
        // // public class ALL{
        // //     public static void main(String[] args){
        // //         manager m= new manager();
        // //         m.work();
        // //         m.attend metting();
        // //     }
        // // }

        //                                                                    27/05/2025
// import java.util.ArrayList;

//     class ALL{
//         public static void main(String[] args) {
// ArrayList<String> arr=new ArrayList<>();
// arr.add("hello");
// arr.add("hiii");
// arr.set(1,"byyy");
// arr.add(0,"byiii");
// arr.add("hii");
// arr.remove(0);
// System.out.println(arr);            
//         }
//     }
// import java.util.LinkedList;
// class ALL{
//     public static void main(String[] args) {
//         LinkedList<Integer> arr= new LinkedList<>();
//         arr.add(4);
//         arr.add( 5);
//        // arr.remove(4);
//         System.out.println(arr.contains(4));
//     }
// }
                                                          //print number between 100 to 200
// import java.util.LinkedList;
// class ALL{
//     public static void main(String[] args) {
//         LinkedList<Integer> arr= new LinkedList<>();
//         for(int i=0;i<1000;i++){
//             if(i>100 & i<200){
//           arr.add(i);
//         }
//     }
        
//         System.out.println(arr);
//     }
// }

// import java.util.HashSet;
//     public static void main(String[] args) {
//         int[] arr = { 1,2,2,3,3,4,5,6};
//          HashSet< Integer> set= new HashSet<>();
//           for(int i=0;i< arr.length;i++){
//     set.add(arr[i]);
//     //       arr.add(i);
//     //     }
//     // }
//           }
//     // set.add("ba");
     
//         System.out.println(set);
//     }


// import java.util.HashSet;
//     public static void main(String[] args) {
//         int[] arr = { 1,2,2,3,3,4,5,6};
//          HashSet< Integer> set= new HashSet<>();
//           for(int i=0;i< arr.length;i++){
//             if(set.contains(i)){
//     set.add(arr[i]);
//     //       arr.add(i);
//     //     }
//     // }
//             }
//           }
//     // set.add("ba");
     
//         System.out.println(set);
//     }

//                                                        hashmap
// import java.util.HashSet;
//     public static void main(String[] args) {
//         // int[] arr = { 1,2,2,3,3,4,5,6};
//          HashMap<String, Integer> map= new HashMap<>();
//            map.put("id0",1);
//  map.put("id1",2);
     
//         System.out.println(map.get("id0"));
//     }

// import java.util.HashSet;
//     public static void main(String[] args) {
//         int[] arr = { 1,2,2,3,3,4,5,6};
//          HashSet<  Integer>set= new HashSet<>();
//           TreeSet<  Integer> set= new TreeSet<>();
//           for(int i:arr){
//             set.add(i);
//           }
     
//         System.out.println( set);
//     }

//                                      word programming word count
 
// import java.util.ArrayList;
// import java.util.Iterator;
// class ALL{
//         public static void main(String[] args) {
//                 ArrayList<String> name=new ArrayList<>();
//                 name.add("ravi");
//                 name.add("Anjali");
//                 name.add("ram");
//                 name.add("amiit");
//                 name.add("priya");
//                 Iterator<String>it= name.iterator();
//                 while(it.hasNext()){
//                         String elem=it.next();
//                         System.out.println(elem);
//                         if(elem.startsWith( "A" )){
//                                 it.remove();
//                         }
                
//                 System.out.println(name);
//                 }
//         }
// }


// import java.util.ArrayList;
// import java.util.Iterator;
// class ALL{
//         public static void main(String[] args) {
//                 ArrayList<String> name=new ArrayList<>();
//                 name.add("ravi");
//                 name.add("Anjali");
//                 name.add("ram");
//                 name.add("amiit");
//                 name.add("priya");
//                ListIterator<String> it= name.ListIterator();
//                 while(it.hasNext()){
//                         String elem=it.next();
//                         System.out.println(elem);
//                 }
//                 System.out.println("pree");
//                 while(it.hasPrevious()){
//                         String lastValue= it.previous();
//                         System.out.println(lastValue);
//                 }
                        
//                 System.out.println(name);
                
                
//         }
// }

// import java.util.ArrayList;
// import java.util.ListIterator;
// class ALL{
//         public static void main(String[] args) {
//                 ArrayList<String> name=new ArrayList<>();
//                 name.add("ravi");
//                 name.add("Anjali");
//                 name.add("ram");
//                 name.add("amiit");
//                 name.add("priya");
//                ListIterator <String> it= name.ListIterator();
//                 while(it.hasNext()){
//                         String elem=it.next();
                        
//                         // System.out.println(elem);
//                 }
//                 System.out.println("pree");
//                 while(it.hasPrevious()){
//                         String lastValue= it.previous();
//                         System.out.println(lastValue);
//                 }
                        
//                 System.out.println(name);
//                 int count=0;
//                 while(it.hasPrevious()){
//                         String elem =it.previous();
//                         count++;
//                         if(count !=names.size()){
//                                 it.set("hello");

//                         }
//                 }
                
//         }
// }

//                             11 mohit
//                             16 rohit
//                             17 rahul
//                              51 om print karo

// import java.util.ArrayList;
// import java.util.Collections;
// class Student implements Comparable<Student>{
//         int age;
//         String name;
//         public Student (int age,String name){
//                 this.age=age;
//                 this.name=name;

//         }
//         public String toString(){
//                 return age+ " " +name;

//         }
//         public int compareTo(Student s){
//                 return this.age-s.age;
//         }
//         }
//         class ALL{
//         public static void main(String[] args){
//                 ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(17, "rahul"));
//         list.add(new Student(16, "rohit"));
//         list.add(new Student(11, "mohit"));
//         list.add(new Student(51, "om"));

//            Collections.sort(list);
//            for(Student s :list){
//             System.out.println(s.toString());
//            }
//         }
// }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// class Student{

//         int age;
//         String name;
//         int rollNo;
//         public Student (int age,String name,int rollNo){
//                 this.age=age;
//                 this.name=name;
//                 this.rollNo=rollNo;
//         }
//         public String toString(){
//                 return age+ " " +name + " "+ rollNo;

//         }
// }
// class sortByName implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);

//     }
// }
// class sortByAge implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.age-s2.age;

//     }
// }
        
//         class ALL{
//         public static void main(String[] args){
//                 ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(17, "rahul" ,45));
//         list.add(new Student(16, "rohit" , 34));
//         list.add(new Student(11, "mohit", 55));
//         list.add(new Student(51, "om",65));
//         for(Student s:list){
//                 System.out.println(s);
//         }

//            Collections.sort(list,new sortByAge());
//            for(Student s2 :list){
//             System.out.println( s2);
//            }
//         }
// }

//               : Sort by Age Ascending, then by Name Alphabetically
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// class Student{

//         int age;
//         String name;
//         int rollNo;
//         public Student (int age,String name,int rollNo){
//                 this.age=age;
//                 this.name=name;
//                 this.rollNo=rollNo;
//         }
//         public String toString(){
//                 return age+ " " +name + " "+ rollNo;

//         }
// }
// class sortByName implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);

//     }
// }
// class sortByAge implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.age-s2.age;

//     }
// }
        
//         class ALL{
//         public static void main(String[] args){
//                 ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(16, "rahul" ,45));
//         list.add(new Student(16, "rohit" , 45));
         
//         // for(Student s:list){
//         //         System.out.println(s);
//         // }

//            Collections.sort(list,new sortByAge());
//            for(Student s2 :list){
//             System.out.println( s2);
//            }
//         }
// }

//        Sort by Name Length using Comparator
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// class Student{

//         int age;
//         String name;
//         int rollNo;
//         public Student (int age,String name,int rollNo){
//                 this.age=age;
//                 this.name=name;
//                 this.rollNo=rollNo;
//         }
//         public String toString(){
//                 return age+ " " +name + " "+ rollNo;

//         }
// }
// class sortByName implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);

//     }
// }
// class sortByAge implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.age-s2.age;

//     }
// }
        
//         class ALL{
//         public static void main(String[] args){
//                 ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(16, "rahul" ,45));
//         list.add(new Student(16, "rohitfgd" , 45));
         
//         // for(Student s:list){
//         //         System.out.println(s);
//         // }

//            Collections.sort(list,new sortByAge());
//            for(Student s2 :list){
//             System.out.println( s2);
//            }
//         }
// }
//                Sort by Roll Number in Descending Order
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// class Student{

//         int age;
//         String name;
//         int rollNo;
//         public Student (int age,String name,int rollNo){
//                 this.age=age;
//                 this.name=name;
//                 this.rollNo=rollNo;
//         }
//         public String toString(){
//                 return age+ " " +name + " "+ rollNo;

//         }
// }
// class sortByName implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);

//     }
// }
// class sortByAge implements  Comparator<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.age-s2.age;

//     }
// }
        
//         class ALL{
//         public static void main(String[] args){
//                 ArrayList<Student> list =new ArrayList<>();
//         list.add(new Student(16, "rahul" ,45));
//         list.add(new Student(16, "rohitfgd" , 45));
         
//         // for(Student s:list){
//         //         System.out.println(s);
//         // }

//            Collections.sort(list,new sortByAge());
//            for(Student s2 :list){
//             System.out.println( s2);
//            }
//         }
// }

// class MyThread extends Thread{
//         public void run(){
//                 System.out.println("hello");
// try {
//         Thread.sleep(4000);
// } catch (Exception e) {
//         // TODO: handle exception
// }
        
//         System.out.println("hii");
// }
// }
// class ALL{
//         public static void main(String[] args) {
//                 MyThread t1=new MyThread();
//                 t1.start();
//                 System.out.println("hii");
//         }
// }

// class FileDownload{
//         public static void download (String file) {
//                 for(int i=1; i<=5; i++){
//                         System.out.println(file + " " + "downloading"+ (i*20)+ "%");
//                         try {
//                                 Thread.sleep(2000);
//                         } catch (Exception e) {
//                                 // TODO: handle exception
//                         }
//                 }
        
//         System.out.println(file + "done");
// }
// }
// class ALL{
//         public static void main(String[] args) {
//               FileDownload obj=new FileDownload(); 
//               obj.download("file A"); 
//                 obj.download("file B"); 
//         }
// }
//  class DownloadFile extends Thread{
//         String fileName ;
//         public DownloadFile(String fileName){
//                 this.fileName=fileName;

//         }
//         public void run(){
//                 for(int i=0;i<=5;i++){
//                          System.out.println(fileName + " " + "downloading"+ (i*20)+ "%");
//                         try {
//                                  Thread.sleep(2000);
//                          } catch (Exception e) {
//                                  // TODO: handle exception
//                          }
//                  }
//                         System.out.println(fileName + "done");
//                 }
//         }
//         class ALL{
//                 public static void main(String[] args) {
//                    DownloadFile t1 =new DownloadFile("fileName A");
//                      DownloadFile t2 =new DownloadFile("fileName B");

//                      t1.start();
//                      t2.start();
//                 }
//         }
 
// class MyRunnable implements Runnable{
//         public void run(){
//                 System.out.println(Thread.currentThread().getName()+"HIII");
//         }
// }
// class ALL{
//         public static void main(String[] args) {
//                 MyRunnable obj= new MyRunnable();
//                 Thread t1=new Thread(obj);
//                 t1.start();
//                System.out.println("hello");
//         }
// }

//                                                       bank game
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
class ALL{
        public static void main(String[] args) {
                int [] [] arr ={ {1,2,3},
                                  {4,5,6},
                                {7,8,9}};
                                for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++) {
 System.out.print(arr[i][j] + " ");
 }
 System.out.println();
        }
}
}

 


  


 


  






 


  



 


  






 


  



 


  






 


  



 


  






 


  