import java.util.*;
public class loop {
    public static void main(String args[]){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i+1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =num;i>=1;i--){
            for(int j=num+1;j>=i+1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(i-1)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
