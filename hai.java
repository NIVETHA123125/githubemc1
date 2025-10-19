import java.util.*;
class hai{
    public static void main(String args [])
    {
        Scanner x=new Scanner(System.in);
      int oddcount=1;
      for(int i=1;i<=100;i++){
        if(i%3==0 && i%5==0){
        System.out.print( " ## "+ oddcount+ ". "+i);
        oddcount=oddcount+1;
        }
      }

    }
}