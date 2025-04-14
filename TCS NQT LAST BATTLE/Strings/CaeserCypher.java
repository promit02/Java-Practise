import java.util.*;
public class CaeserCypher{
public static String Cyphergeneration(String s,int k){
	StringBuilder encrypt =new StringBuilder();
	for(char ch:s.toCharArray())//iterating each character of given string char array 
	{
		if(Character.isLetter(ch)){
			char shift;
			if(Character.isUpperCase(ch)){
				shift='A';
			}
			else{
				shift='a';
			}
		encrypt.append((char) (((ch - shift + k)%26)+shift));//CAESER FORMULA FOR ALPHABETS
		}else if(Character.isDigit(ch)){
			encrypt.append((char) (((ch - '0' + k) % 10) + '0'));//CAESER FORMUL FOR DIGITS
		}
		else{
			encrypt.append(ch);
		}
	}
	return encrypt.toString();
}
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("The original message : ");
	String st= sc.nextLine();
	System.out.println("The key given :");
	int key=sc.nextInt();
	String encrypt_st= Cyphergeneration( st, key);
	System.out.println("the encrypted message  "+ encrypt_st);
}
}