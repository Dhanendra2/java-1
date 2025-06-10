
import java.util.*;
class Transactions{
    String type;
    double amount;
    public Transactions(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
    public String toString(){
        return type +":Rs." + amount;
    }

}
class Account {
    String name;
    int accountNumber;
    double balance;
    ArrayList<Transactions> Transactions=new ArrayList<>();
    public Account(String name ,int accountNumber,double balance){
        this.accountNumber=accountNumber;;
        this.name=name;
        this.balance=balance;
    }
    public void Deposite(double amount){
        if(amount>0){
            balance+= amount;
            transactions.add(new Transactions("Deposite", +amount));
            System.out.println();
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-= amount;
            transactions.add(new Transactions("WITHDRAW " , amount));
            System.out.println("withdraw successfuly");
        }
        else{
            System.out.println("insufficient balance ");
        }
    }
    public void viewTransactions(){
        if(transactions.isEmpty()){
            System.out.println("no transaction yet");

        }else{
            for(Transactions t : transaction ){
                System.out.println(t);
            }
        }
    }
    public void checkBalance(){
        System.out.println("current balance:Rs" + balance);
    }
}
 
 
 
class bankacc{
     static Scanner sc=new Scanner(System.in);
     static Account account;
    public static void main(String[] args) {
        System.out.println("enter account holder name :");
        String name = sc.nextLine();
        account = new Account(name , 33440, 00);
        System.out.println("account created successfully.account number");
         int choice;
            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.Deposite(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.withdraw(with);
                        break;
                    case 3:
                        account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }
}

    
