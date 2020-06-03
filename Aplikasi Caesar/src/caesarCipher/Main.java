package caesarCipher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int pilihan;
			String text;
			int key = 0;
			
			System.out.println("==============================");
			System.out.println("Aplikasi Sandi Caesar");
			System.out.println("==============================");
			
			System.out.println("MENU");
			System.out.println("1. Enkripsi");
			System.out.println("2. Dekripsi");
			
			System.out.print("Masukkan pilihan menu: ");
			Scanner in = new Scanner(System.in);
			pilihan = in.nextInt();
			System.out.println(" ");
			
			System.out.print("Masukkan text : ");
			text = in.next();
			
			System.out.print("Masukkan kunci : ");
			key = in.nextInt();
			
			switch(pilihan)	{
				case 1 :
					Enkripsi encrypt = new Enkripsi();
					encrypt.plaintext = text;
					encrypt.key = key;
					encrypt.scanPlaintext();
					break;
					
				case 2 :
					Dekripsi decrypt = new Dekripsi();
					decrypt.ciphertext = text;
					decrypt.key = key;
					decrypt.scanCiphertext();
					break;			
		}
	}
}
