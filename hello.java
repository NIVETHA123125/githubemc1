import java.util.Scanner;
class hello{
    public static void main(String args []){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int result=a>b?a:b;
        System.out.println("greater is "+result);
        

}
}