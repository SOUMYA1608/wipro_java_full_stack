import java.util.Scanner;
class Integer{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number");
        int a=scan.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a==0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }
    }
}
