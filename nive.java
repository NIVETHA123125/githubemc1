import java.util.Scanner;
class nive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the element: ");
        int size=sc.nextInt();
        
        int [] marks=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
             marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        System.out.println("the elements are: "+marks[i]);
        }
        if(size%2==0){
            int mid1=size/2-1;
            int mid2=size/2;
            System.out.println("the middle element is: "+marks[mid1]+ " and " +marks[mid2]);
             }
        else{
            int mid3=size/2;

            System.out.println("the middle element is: "+marks[mid3]);
             }
        }
        
        
        
            }
        
    
