public class pattern{
    public static void main(String[] args) {
        int a=127;
        int original=a;
        int res =0;
        while(a>0) {
            int digit=a%10;
            res =res*10 + digit ;
            a=a/10;

        }
        if(original==res){
            System.out.println("pelemdom");
        }
        else{
            System.out.println("not a pelemdom");
        }
}
} 

