package caesarCipher;

public class Dekripsi {
	
	public String plaintext;
	public String ciphertext;
	public int key;
	
	public void scanCiphertext() {
		// TODO Auto-generated method stub
		System.out.println("Ciphertext : " + ciphertext);
		System.out.println("Kunci : " + key);
		System.out.print("Plaintext : ");
		decrypt();
	}
	
	public void printPlaintext(char ch)
	{
		System.out.print(ch);
	}
	
	public void decrypt()	{
		 for(int i=0; i < ciphertext.length();i++)  

	        {
	            // Shift one character at a time
	            char alphabet = ciphertext.charAt(i);
	            // if alphabet lies between a and z 
	            if(alphabet >= 'a' && alphabet <= 'z')
	            {
	                // shift alphabet
	                alphabet = (char) (alphabet - key);
	            
	                // shift alphabet lesser than 'a'
	                if(alphabet < 'a') {
	                    //reshift to starting position 
	                    alphabet = (char) (alphabet-'a'+'z'+1);
	                }
	                printPlaintext(alphabet);
	            }    
	                // if alphabet lies between A and Z
	            else if(alphabet >= 'A' && alphabet <= 'Z')
	            {
	             // shift alphabet
	                alphabet = (char) (alphabet - key);
	                
	                //shift alphabet lesser than 'A'
	                if (alphabet < 'A') {
	                    // reshift to starting position 
	                    alphabet = (char) (alphabet-'A'+'Z'+1);
	                }
	                printPlaintext(alphabet);
	            }
	            else 
	            {
	            	printPlaintext(alphabet);            
	            } 
	        }
	}
}
