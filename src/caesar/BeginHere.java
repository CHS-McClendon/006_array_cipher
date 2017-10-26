package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		/* Doug's example of drop-down JOP */
		
		Object[] selections = {"Encoder", "Decoder", "Cracker", "None"}; 
		String selection = "Encoder";
		selection = (String) JOptionPane.showInputDialog(
				null, 
				"select a utility: ", 
				"Util select", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				selections, 
				selection);
		
		
		Scanner kbd = new Scanner(System.in);
		CaesarCipher myCipher = new CaesarCipher();
		
		System.out.println("Please enter the plain text to encode:");
		String plainText = kbd.nextLine().toLowerCase();
		
		System.out.println("Please enter the key:");
		int key = kbd.nextInt();
		//System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		System.out.println("Your secret message is: " + codedText);

	}

}
