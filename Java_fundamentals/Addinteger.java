import java.util.Scanner; 
public class Addinteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter 2 strings");
        int s1 = sc.nextInt(); 
        int s2 = sc.nextInt();
        int s3 =s1+s2;
        System.out.println("the sum of"+s1 + "and"+s2+"is"+s3);
    }
}
