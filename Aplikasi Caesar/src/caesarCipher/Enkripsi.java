package caesarCipher;

public class Enkripsi {
	
	public String plaintext;
	public String ciphertext;
	public int key;
	
	public void scanPlaintext() {
		// TODO Auto-generated method stub
		System.out.println("Plaintext : " + plaintext);
		System.out.println("Kunci : " + key);
		System.out.print("Ciphertext : ");
		encrypt();
	}
	
	public void printCiphertext(char ch)
	{
		System.out.print(ch);
	}
	
	public void encrypt()	{
		char alphabet; 
		for(int i=0; i < plaintext.length();i++) 
		{
			alphabet = plaintext.charAt(i);

			if(alphabet >= 'a' && alphabet <= 'z') 
			{
				alphabet = (char) (alphabet + key);
				if(alphabet > 'z') {
				alphabet = (char) (alphabet+'a'-'z'-1);
				}        
	            printCiphertext(alphabet);
			}
	            
			else if(alphabet >= 'A' && alphabet <= 'Z') 
			{
				alphabet = (char) (alphabet + key);    
	            if(alphabet > 'Z') {
	            alphabet = (char) (alphabet+'A'-'Z'-1);
	            }
	            printCiphertext(alphabet);
			}
	        
			else {
	            printCiphertext(alphabet);  
			}	
		}
	}
}
