public class Edureka 
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++)
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) 
            {       
                System.out.print(i*i +" "); 
            }           
            System.out.println(); 
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        rightTriangle(n); 
    } 
}
