package homework02;
public class ReverseLeftAlignedTriangle {
    public static void main(String[] args) 
    {     
   int a=1;
   int b;
   int c=5;
do
{
b=1;
       do{
       System.out.print("*");
       b++;
       }while(b <= (c - a + 1));
 System.out.println();
 a++;
 }while(a <= c);
 }
}