import java.util.*;
class Perfect_square
{

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int i,j,count=0;
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int square;
    for(i=0;i<n;i++)
    {
      for(j=2;j<n;j++)
        square=arr[i]/j;
       if(square==j && arr[i]%j==0)
          count=count+1;    
    }
    System.out.print(count);
     
  }
}