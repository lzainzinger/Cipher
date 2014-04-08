/**
 * 
 */
package zainzinger.cipher;

/**
 * @author lukaszainzinger
 *
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
	public SubstitutionCipher(String secretAlphabet){
		super();
		super.setSecretAlphabet(secretAlphabet);
		
	}
	
	public void setSecretAlphabet(String alphabet){
		super.setSecretAlphabet(alphabet);
	}
}
