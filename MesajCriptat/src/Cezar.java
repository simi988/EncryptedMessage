
import java.io.*;

public class Cezar {

	static String alfabet = "AĂÂBCDEFGHIÎJKLMNOPQRSȘTȚUVWXYZaăâbcdefghiîjklmnopqrsștțuvwxyz";

	private  int getIndexOfChar(char s) {
		for (int i = 0; i < alfabet.length(); i++) {
			if (alfabet.charAt(i) == s) {
				return i;
			}
		}
		return 0;
	}

	public  String criptare(String mesaj, int cheie) {
		 StringBuffer result = new StringBuffer();
		for (int i = 0; i < mesaj.length(); i++) {
			int charPosition = getIndexOfChar(mesaj.charAt(i));
			char replaceVal = alfabet.charAt((charPosition + cheie) % alfabet.length());
			result.append(replaceVal);
		}
		return result.toString();
	}

	public String decriptare(String mesaj, int cheie) {
		 StringBuffer result2 = new StringBuffer();
		for (int i = 0; i < mesaj.length(); i++) {
			int charPosition = getIndexOfChar(mesaj.charAt(i));
			char replaceVal = alfabet.charAt((charPosition - cheie) % alfabet.length());
			result2.append(replaceVal);
		}
		return result2.toString();
	}

	

	
}
