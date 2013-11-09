package entropy.com.gr;
import entropy.com.gr.CodingFrequencies;
public class Exec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//english alphabet capitals only
		char[] albet=new char[] {'A','B','C','D','E','F','J','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		 CodingFrequencies entr=new CodingFrequencies(new int[26], 8);
		 double entrDbl=entr.entropy(26);
		
		CodingFrequencies entr2= entr.compact();
		 entrDbl=entr2.binaryEntropy();
		 
		 System.out.println(entrDbl);
	}

}
