package A3;

public class A32 
{

	public static void main(String[] args) 
	
	{
		
		String s ="Think Twice";    
        
        String s2="";               
        
        String reverseStr ="";   
        
        System.out.println(s);
        
        String a[]=s.split(" ");
        
        for(int i = a.length-1; i >= 0; i--)
        {    
            s2=s2+a[i]+" ";    
        }
        
        s2=s2.toLowerCase();
         
        for(int i = s2.length()-1; i >= 0; i--)
        {    
            reverseStr = reverseStr + s2.charAt(i);    
        } 
        
        System.out.println(reverseStr.trim() );
         
	}

}
