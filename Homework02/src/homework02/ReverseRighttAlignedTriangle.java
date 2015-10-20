package homework02;
public class ReverseRighttAlignedTriangle {
    public static void main(String[] args) 
    {     
   int a=1;
   int b;
   int c=6;
do
{
   b = a - 1;
    if (b!=0){
       do{
        System.out.print(" ");
        b--;
       }while(b >= 1);
    }
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