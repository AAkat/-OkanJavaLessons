package homework02;
public class Diamond {
    public static void main(String[] args) 
    {
        int odd=1;
        int noOfSpaces=3;
        for(int i=1;i<=5;i++)
        {
            for(int j=noOfSpaces;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=odd;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            if(i<3)
            {
            odd=odd+2;
            noOfSpaces=noOfSpaces-1;
            }
            else
            {
                odd=odd-2;
                noOfSpaces=noOfSpaces+1;
            }
        }    
    }
    
}