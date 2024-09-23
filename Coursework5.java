import java.util.*;

class Coursework5{
	 public static void main(String[] args){
	
	char yn ='Y';
	while(yn=='Y' || yn=='y'){ 
	Scanner input =new Scanner(System.in);
	System.out.println("\n\n                                        __   ______             __            ");
	System.out.println("                                       |  \\ /      \\           |  \\          ");
	System.out.println("                                        \\$$|  $$$$$$\\  ______  | $$  _______ ");
	System.out.println("                                       |  \\| $$   \\$$ |      \\ | $$ /       \\");
	System.out.println("                                       | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
	System.out.println("                                       | $$| $$   __  /      $$| $$| $$      ");
	System.out.println("                                       | $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
	System.out.println("                                       | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
	System.out.println("                                        \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n");

	System.out.println(" _   _                       _                       _____                                         _                  ");
	System.out.println("| \\ | |                     | |                     / ____|                                       | |                ");
	System.out.println("|  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __ ");
	System.out.println("| . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|  | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
	System.out.println("| |\\  | | |_| | | | | | | | | |_) | |  __/ | |     | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |   ");
	System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|      \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|\n");
			
	System.out.println("=====================================================================================================================\n\n");

	
	System.out.println("\t[01] Decimal Converter\n");
	System.out.println("\t[02] Binary Converter\n");
	System.out.println("\t[03] Octal Converter\n");
	System.out.println("\t[04] Hexadecimal Converter\n");
	System.out.println("\t[05] Roman Number Converter\n\n");
	
	System.out.print("Enter Option ->");
	int option = input.nextInt();
	
	switch (option){
		
			case 1:
			char yesno ='Y';
			
			while(yesno=='Y' || yesno=='y'){
				System.out.println("+-----------------------------------------------+");
				System.out.println("|               Decimal Converter               |");
				System.out.println("+-----------------------------------------------+");
			
				System.out.println();
				System.out.println();
			
				System.out.print("Enter an Decimal number: ");
				int dec = input.nextInt();
			
				if(dec>0){
			
					int deciby =dec;
					String binary = "";
					
					while(deciby!=0){
						 int remainder = deciby%2;
						 binary = remainder + binary;
						 
						 deciby /=2;
					}
					
					System.out.println("Binary number:"+binary);
					
					int decioct =dec;
					String octal ="";
					while(decioct!=0){
						 int remainder = decioct%8;
						 octal = remainder + octal;
						 
						 decioct /=8;
					}
					System.out.println("Octal number:"+ octal);
					
					int decihex =dec;
					String hexadecimal ="";
					while(decihex!=0){
						 int remainder = decihex%16;
						 if(remainder<10){
							 hexadecimal = remainder + hexadecimal;
						 }
						 else {
							 char ch = (char)('A' + (remainder-10));
							 hexadecimal = ch + hexadecimal;
						 }
						 
						 
						 decihex /=16;
					}
					System.out.println("hexadecimal number:"+hexadecimal);
					
					System.out.print("Do you want to go to  home page (Y/N): ");
					yn = input.next().charAt(0);
					
				
					if(yn=='Y' || yn=='y'){
						yesno='N';
					}else {
						return;
					}	
				}else {
					System.out.println("Invalid input....");
				
					System.out.print("Do you want to input number again (Y/N) ->");
					yesno = input.next().charAt(0);
					
					if(yesno=='Y' || yesno=='y'){
					
					}else{
						return;
						}
				
					}	
							
				}
				break;
				
				case 2:
				
				char yesno2 ='Y';
				while(yesno2=='Y' || yesno2=='y'){
				System.out.println("+-----------------------------------------------+");
				System.out.println("|               Binary Converter                |");
				System.out.println("+-----------------------------------------------+");
			
				System.out.println();
				System.out.println();
			
				System.out.print("Enter Binary number: ");
				int bin = input.nextInt();

				
				int tempbin = bin;
				boolean valid = true;
			
				while(tempbin!=0){
					
					int remaindor = tempbin%10;
					
					if(remaindor!=1 && remaindor!=0){
						valid = false;
					}
					tempbin/=10;
									
				}
			
				if(valid == true){	
					
					int bindecy =bin;
					int decimal = 0;
					int pow = 1;
					 
					while(bindecy!=0){
						 int remainder = bindecy%10;
						 decimal = decimal + remainder*pow;
						 pow*=2;
						 bindecy /=10;
					}
					
					System.out.println("Decimal number: "+decimal);
					
					int binoct = decimal;
					String octal = "";
					while(binoct!=0){
						 int remainder = binoct%8;
						 octal = remainder + octal;
						 binoct /=8;
					}
					System.out.println("Octal number:"+ octal);
					
					int decihex =decimal;
					String hexadecimal ="";
					while(decihex!=0){
						 int remainder = decihex%16;
						 if(remainder<10){
							 hexadecimal = remainder + hexadecimal;
						 }
						 else {
							 char ch = (char)('A' + (remainder-10));
							 hexadecimal = ch + hexadecimal;
						 }
						 
						 
						 decihex /=16;
					}
					System.out.println("hexadecimal number:"+hexadecimal);
					
					System.out.print("Do you want to go to  home page (Y/N): ");
					yn = input.next().charAt(0);
					
					
				
					if(yn=='Y' || yn=='y'){
						yesno2='N';
					}
					
					else {
						return;
					}
					
						
					}else {
					System.out.println("Invalid input....");
				
					System.out.print("Do you want to input number again (Y/N) ->");
					yesno = input.next().charAt(0);
					
					if(yesno2=='Y' || yesno2=='y'){
						
					}else{
						return;
						}
				
					}
							
				}
				break;
				
				case 3:
				
				char yesno3 ='Y';
				while(yesno3 =='Y' || yesno3 =='y'){
				System.out.println("+-----------------------------------------------+");
				System.out.println("|               Octal Converter                 |");
				System.out.println("+-----------------------------------------------+");
			
				System.out.println();
				System.out.println();
			
				System.out.print("Enter Octal number: ");
				int oct = input.nextInt();

				
				int tempoct = oct;
				boolean valid = true;
			
				while(tempoct!=0){
					
					int remaindor = tempoct%10;
					tempoct/=10;
					if(remaindor>=8 && remaindor<0){
						valid = false;
					}
									
				}
			
				if(valid == true){	
					
					int octdecy =oct;
					int decimal = 0;
					int pow = 1;
					 
					while(octdecy!=0){
						 int remainder = octdecy%10;
						 decimal = decimal + remainder*pow;
						 pow*=8;
						 octdecy /=10;
					}
					
					System.out.println("Decimal number: "+decimal);
					
					int octbin = decimal;
					String octal = "";
					while(octbin!=0){
						 int remainder = octbin%2;
						 octal = remainder + octal;
						 
						 octbin /=2;
					}
					
					System.out.println("Binary number:"+octal);
					
					int octhex =decimal;
					String hexadecimal ="";
					while(octhex!=0){
						 int remainder = octhex%16;
						 if(remainder<10){
							 hexadecimal = remainder + hexadecimal;
						 }
						 else {
							 char ch = (char)('A' + (remainder-10));
							 hexadecimal = ch + hexadecimal;
						 }
						 
						 
						 octhex /=16;
					}
					System.out.println("hexadecimal number:"+hexadecimal);
					
					System.out.print("Do you want to go to  home page (Y/N): ");
					yn = input.next().charAt(0);
					
					
				
					if(yn=='Y' || yn=='y'){
						yesno3='N';
					}
					
					else {
						return;
					}
					
						
					}else {
					System.out.println("Invalid input....");
				
					System.out.print("Do you want to input number again (Y/N) ->");
					yesno = input.next().charAt(0);
					
					if(yesno3=='Y' || yesno3=='y'){
						
					}else{
						return;
						}
				
					}
							
				}
				break;
				
				case 4:
				
				char yesno4 ='Y';
				while(yesno4=='Y' || yesno4=='y'){
				System.out.println("+-----------------------------------------------+");
				System.out.println("|               hexadecimal Converter           |");
				System.out.println("+-----------------------------------------------+");
			
				System.out.println();
				System.out.println();
				
				input.nextLine();
				System.out.print("Enter hexadecimal number: ");
				String hex = input.nextLine();

				int pow=1;
				int decimal=0;
				boolean valid = true;
			
				for (int i = hex.length() - 1; i >= 0; i--) {
						char base = hex.charAt(i);
						int digit = 0;
						if (base >= '0' && base <= '9') {
							digit = base - '0';
						} else if (base >= 'A' && base <= 'F') {
							digit = 10 + base - 'A';
						} else if (base >= 'a' && base <= 'f') {
							digit = 10 + base - 'a';
						} else {
							valid = false;
						}
						decimal += digit * pow;
						pow *= 16;
					}
					
				
				if(valid == true){	
					

					System.out.println("Decimal number: "+decimal);
					
					int hexbi =decimal;
					String binary ="";
					while(hexbi!=0){
						 int remainder = hexbi%2;
						 binary = remainder + binary;
						 
						 hexbi /=2;
					}
					
					System.out.println("Binary number:"+binary);
					
					int binoct = decimal;
					String octal = "";
					while(binoct!=0){
						 int remainder = binoct%8;
						 octal = remainder + octal;
						 binoct /=8;
					}
					System.out.println("Octal number:"+ octal);
					
				
					
					
					System.out.print("Do you want to go to  home page (Y/N): ");
					yn = input.next().charAt(0);
					
					
				
					if(yn=='Y' || yn=='y'){
						yesno4='N';
					}
					
					else {
						return;
					}

					}else {
					System.out.println("Invalid input....");
				
					System.out.print("Do you want to input number again (Y/N) ->");
					yesno = input.next().charAt(0);
					
					if(yesno4=='Y' || yesno4=='y'){
						
					}else{
						return;
						}
				
					}
							
				}
				break;
				
				case 5:
				
				char case5 = 'Y';

				while(case5 == 'Y'){
					System.out.print("\033[H\033[2J");  
					System.out.flush();

					System.out.println("+------------------------------------------------------+");
					System.out.println("|                Roman Number Converter                |");
					System.out.println("+------------------------------------------------------+\n\n");

					System.out.println("\t[01] Decimal Number to Roman Number Converter\n");
					System.out.println("\t[02] Roman Number to Decimal Number Converter\n");

					System.out.print("\nEnter an Option -> ");
					int romanOption = input.nextInt();

					switch (romanOption) {

						case 1:

						System.out.print("\033[H\033[2J");  
						System.out.flush();

						System.out.println("+------------------------------------------------------+");
						System.out.println("|      Decimal Number to Roman Number Converter        |");
						System.out.println("+------------------------------------------------------+\n\n");

						input.nextLine();
						System.out.print("Enter a Decimal Number : ");
						String num = input.nextLine();

						boolean validity = true;

						if (num.isEmpty()) {
							validity = false;
						} else {
							for (int i = 0; i < num.length(); i++) {
								char base = num.charAt(i);
								if (base < '0' || base > '9') {
									validity = false;
									break;
								}
							}
						}

						if (validity) {
							int number = Integer.parseInt(num);
							String romanNumber = "";

							while (number >= 1000) {
								romanNumber += "M";
								number -= 1000;
							}
							while (number >= 900) {
								romanNumber += "CM";
								number -= 900;
							}
							while (number >= 500) {
								romanNumber += "D";
								number -= 500;
							}
							while (number >= 400) {
								romanNumber += "CD";
								number -= 400;
							}
							while (number >= 100) {
								romanNumber += "C";
								number -= 100;
							}
							while (number >= 90) {
								romanNumber += "XC";
								number -= 90;
							}
							while (number >= 50) {
								romanNumber += "L";
								number -= 50;
							}
							while (number >= 40) {
								romanNumber += "XL";
								number -= 40;
							}
							while (number >= 10) {
								romanNumber += "X";
								number -= 10;
							}
							while (number >= 9) {
								romanNumber += "IX";
								number -= 9;
							}
							while (number >= 5) {
								romanNumber += "V";
								number -= 5;
							}
							while (number >= 4) {
								romanNumber += "IV";
								number -= 4;
							}
							while (number >= 1) {
								romanNumber += "I";
								number -= 1;
							}
							System.out.println("\n\tRoman number : " + romanNumber);

							System.out.print("\n\nDo you want to go to home page (Y/N) -> ");
							yn = input.next().charAt(0);

							if (yn  =='Y' || yn  =='y') {
								case5 = 'N';
							} else {
								case5 = 'N';
								yn = 'N';
							}

						} else {
							System.out.print("\tInvalid Input");
							System.out.print("\n\nDo you want to go previous menu (Y/N) -> ");
							case5 = input.next().charAt(0);
							
							if (case5=='Y' || case5=='y') {
								case5 = 'Y';
							} else {
								case5 = 'N';
								yn = 'N';
							}
						}
						break;


						case 2:

							System.out.print("\033[H\033[2J");  
							System.out.flush();

							System.out.println("+------------------------------------------------------+");
							System.out.println("|      Roman Number to Decimal Number Converter        |");
							System.out.println("+------------------------------------------------------+\n\n");

							input.nextLine();
							System.out.print("Enter a Roman Number : ");
							String inNum = input.nextLine();

							validity = true;

							for (int i = 0; i < inNum.length(); i++) {
								char base = inNum.charAt(i);
								if (base != 'I' && base != 'V' && base != 'X' &&
									base != 'L' && base != 'C' && base != 'D' &&
									base != 'M') {
									validity = false;
									break;
								}
							}
		
							if (validity == true){
					
								int res = 0;
								int n = inNum.length();
		
								for (int i = 0; i < n; i++) {
									int s1 = 0;
									switch (inNum.charAt(i)) {
										case 'I': s1 = 1; break;
										case 'V': s1 = 5; break;
										case 'X': s1 = 10; break;
										case 'L': s1 = 50; break;
										case 'C': s1 = 100; break;
										case 'D': s1 = 500; break;
										case 'M': s1 = 1000; break;
									}
								
									int s2 = 0;
									if (i + 1 < n) {
										switch (inNum.charAt(i + 1)) {
											case 'I': s2 = 1; break;
											case 'V': s2 = 5; break;
											case 'X': s2 = 10; break;
											case 'L': s2 = 50; break;
											case 'C': s2 = 100; break;
											case 'D': s2 = 500; break;
											case 'M': s2 = 1000; break;
										}
									}
						
									if (s1 >= s2) {
										res = res + s1;
									} else {
										res = res + s2 - s1;
										i++;
									}
								}
								System.out.println("\n\tDecimal number : " + res);
								System.out.print("\n\nDo you want to go to home page (Y/N) -> ");
								yn = input.next().charAt(0);
		
								if (yn =='Y' || yn =='y'){
									case5 = 'N';
								}else{
									case5 = 'N';
									yn = 'N';
								}
							} else {
								System.out.print("\tInvalid Input");
								System.out.print("\n\nDo you want to go previous menu (Y/N) -> ");
								case5 = input.next().charAt(0);
										
								if (case5=='Y' || case5=='y'){
									case5='Y';
								}else{
									case5='N';
									yn='N';
								}
							}
							break;
			
						default:
							System.out.println("Input valid option");
							break;
					}				
				}
				break;

				default:
					System.out.println("Input valid option selected");
					System.out.print("\n\nDo you want to go to home page (Y/N) -> ");
								yn = input.next().charAt(0);
		
								if (yn =='Y' || yn =='y'){
									case5 = 'N';
								}else{
									case5 = 'N';
									yn = 'N';
								}
				break;

			}
				
		}			
	}
				
}
		
	 
 

	 


