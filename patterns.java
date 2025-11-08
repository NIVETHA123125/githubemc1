import java.util.*;
class patterns{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>1;j--){
                for(j=1;j<n;j++){
                   System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}