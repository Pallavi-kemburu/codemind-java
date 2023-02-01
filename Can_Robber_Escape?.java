import java.util.*;
class can{
    public static void main(String args[])
    {
        int i,n,c=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
           if(a[i]>=n)
           {
               c=c+1;
               System.out.println("NO");
               break;
           }
        }
        if( c==0)
        {
             System.out.println("YES");
        }
        
        
    }
}