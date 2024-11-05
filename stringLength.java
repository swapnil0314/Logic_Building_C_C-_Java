public class stringLength {

    public static int slength(String str , int i)
    {
        if (i > str.length()-1) 
        {
            return i;   
        }

        return slength(str, i+1);

    }

    public static void main(String[] args) {
        
        String str = "savarkarAbhyasika";

       int length =  slength(str , 0);

       System.out.println("The length of the string is : "+ length);
    }
    
}
