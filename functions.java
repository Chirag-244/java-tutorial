import java.util.*;
public class functions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the value you  wanna search for");
        //Searching Algorithm for the Array for the number x and th value of the index
        int x= sc.nextInt();
        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("The index of the value in the linear search of the array is at index is "+i+" and teh value is: "+array[i]);
            }
        }
        sc.close();
    }
}
