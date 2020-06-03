package Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilihan;
		int bil1, bil2;
		
		System.out.println("==============================");
		System.out.println("Aplikasi Kalkulator Sederhana");
		System.out.println("==============================");
		
		System.out.println("MENU FUNGSI OPERASI");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pem	bagian\n");
		
		System.out.print("Masukkan pilihan menu: ");
		Scanner in = new Scanner(System.in);
		pilihan = in.nextInt();
		System.out.println(" ");
		
		System.out.print("Masukkan bilangan pertama: ");
		bil1 = in.nextInt();
		
		System.out.print("Masukkan bilangan kedua: ");
		bil2 = in.nextInt();
		
		System.out.print("\nHASIL DARI FUNGSI OPERASI");
		switch(pilihan)	{
			case 1 :
				Penjumlahan add = new Penjumlahan();
				add.bil1 = bil1;
				add.bil2= bil2;
				add.print();
				break;
			
			case 2 :
				Pengurangan sub = new Pengurangan();
				sub.bil1 = bil1;
				sub.bil2= bil2;
				sub.print();
				break;
			
			case 3 :
				Perkalian mul = new Perkalian();
				mul.bil1 = bil1;
				mul.bil2= bil2;
				mul.print();
				break;
				
			case 4 :
				Pembagian div = new Pembagian();
				div.bil1 = bil1;
				div.bil2= bil2;
				div.print();
				break;
				
			default :
				System.out.println("Anda salah memilih menu");
		}
	}

}
