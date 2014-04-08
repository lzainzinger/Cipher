/**
 * 
 */
package zainzinger.cipher;

/**
 * SubstitutionCipher Klasse
 * @author lukaszainzinger
 * @version 2014-04-08
 *
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	/**
	 * SubstitutionsCipher Konstruktor
	 * @param secretAlphabet, muss 30 Zeichen beinhalten, wenn nicht wird eine Exception geworfen!
	 */
	public SubstitutionCipher(String secretAlphabet){
		super();
		if(secretAlphabet.length() != 30){
			throw new RuntimeException("Alphabet not right! Length must be 30!");
		}
		super.setSecretAlphabet(secretAlphabet);
	}
	
	/**
	 * setSecretAlphabet der Klasse SubstitutionsCipher
	 * €ndert das secretAlphabet.
	 * @param alphabet, muss 30 Zeichen haben, sonnst wird eine Exception geworfen!
	 */
	public void setSecretAlphabet(String alphabet){
		if(alphabet.length() != 30){
			throw new RuntimeException("Alphabet not right! Length must be 30!");
		}
		super.setSecretAlphabet(alphabet);
	}
}
