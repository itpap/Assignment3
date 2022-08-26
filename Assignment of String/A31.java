package A3;

public class A31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String str= "iNeuron", newstr="";
      char c;
      
      for (int i=0; i<str.length(); i++)
      {
        c= str.charAt(i); //extracts each character
        newstr= c+newstr; //adds each character in front of the existing string
      }
      System.out.println(newstr);

	}

}
