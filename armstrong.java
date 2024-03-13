import java.util.*;

public class armstrong 
{
    public static void main(String[] args) 
    {
        int sumcube = 0 ;
        int iTemp=0;
        int idigit=0;
        int ino = 189;

        iTemp=ino;

        while (ino>0)
        {
            idigit=ino%10;

            ino=ino/10;

            sumcube=sumcube+(idigit*idigit*idigit);
            
        }
        
        ino=iTemp;
        if (ino==sumcube)
        {
            System.out.println(ino+"is an armstrong number ");
        }
        else
        {
            System.out.println(ino+"is not an armstrong number");
        }
        
    }
    
}
