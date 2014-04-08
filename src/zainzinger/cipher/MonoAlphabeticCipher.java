/**
 * 
 */
package zainzinger.cipher;

/**
 * MonoAlphabeticCipher
 * @author lukaszainzinger
 * @verion 2014-04-08
 */
public class MonoAlphabeticCipher implements Cipher{
	private String secretAlphabet;
	
	/**
	 * MonoAlphabetic Konstruktor
	 * Setzt das secretAlphabet auf ein default Alphabet
	 */
	public MonoAlphabeticCipher(){
		setSecretAlphabet("zcjntvepgxhamäkdrüublßiwösoyq");
	}
	
	/**
	 * SecretAlphabet getter Methode
	 * @return String
	 */
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	/**
	 * Setter Methode für das secretAlphabet
	 * @param alphabet, muss 30 Zeichen beinhalten! Wenn nicht wird eine Exception geworfen!
	 */
	void setSecretAlphabet(String alphabet){
		if(alphabet.length() != 30){
			throw new RuntimeException("Alphabet not right! Length must be 30!");
		}
		this.secretAlphabet = alphabet;
		
	}
	
	/**
	 * Encrypt Methode
	 * @param text, String
	 * @return String, das encryptete Wort
	 */
	public String encrypt(String text){
		String s = text.toLowerCase();
		String verschluesselt = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		for(int i=0;i<text.length();i++){
			for(int j = 0;text.charAt(i) == alphabet.charAt(j);j++){
				verschluesselt += secretAlphabet.charAt(j);
				
			}
		}
		return verschluesselt;
	}
	
	/**
	 * Decrypt Methode
	 * @param text, String
	 * @return String, das decryptete Wort
	 */
	public String decrypt(String text){
		String s = text.toLowerCase();
		String endschluesselt = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		for(int i=0;i<text.length();i++){
			for(int j = 0;text.charAt(i) == secretAlphabet.charAt(j);j++){
				endschluesselt += alphabet.charAt(j);
				
			}
		}
		return endschluesselt;
	}
	
}
