/**
 * 
 */
package zainzinger.cipher;

/**
 * @author lukaszainzinger
 *
 */
public class MonoAlphabeticCipher implements Cipher{
	private String secretAlphabet;
	
	public MonoAlphabeticCipher(){
		setSecretAlphabet("zcjntvepgxhamäkdrüublßiwösoyq");
	}
	
	public String getSecretAlphabet(){
		return this.secretAlphabet;
	}
	
	void setSecretAlphabet(String alphabet){
		this.secretAlphabet = alphabet;
		
	}
	
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
