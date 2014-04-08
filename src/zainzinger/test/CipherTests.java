/**
 * 
 */
package zainzinger.test;
import org.junit.*;

import zainzinger.cipher.MonoAlphabeticCipher;
import zainzinger.cipher.SubstitutionCipher;

/**
 * @author lukaszainzinger
 *
 */
public class CipherTests {
	MonoAlphabeticCipher xy = new MonoAlphabeticCipher();
	@Test
	public void testEncrypt(){
		String test = xy.encrypt("Affe");
		if(!test.equals("zvvt")){
			throw new RuntimeException("Failed!");
		}
	}
	
	@Test
	public void testDecrypt(){
		String test = xy.decrypt("zvvt");
		if(!test.equals("affe")){
			throw new RuntimeException("Failed!");
		}
	}
	
	@Test
	public void testGetSecretAlphabet(){
		String test = xy.getSecretAlphabet();
		if(!test.equals("zcjntvepgxhamŠkdrŸubl§iwšsoyq")){
			throw new RuntimeException("Failed!");
		}
	}
	SubstitutionCipher ab = new SubstitutionCipher("§ŸšŠzyxwvutsrqponmlkjihgfedcba");
	
	@Test
	public void testSubstitutionCipher(){
		String test = ab.getSecretAlphabet();
		if(!test.equals("§ŸšŠzyxwvutsrqponmlkjihgfedcba")){
			throw new RuntimeException("Failed!");
		}
	}
	
	@Test
	public void testSubstSet(){
		ab.setSecretAlphabet("aŸšŠzyxwvutsrqponmlkjihgfedcb§");
		String test = ab.getSecretAlphabet();
		if(!test.equals("aŸšŠzyxwvutsrqponmlkjihgfedcb§")){
			throw new RuntimeException("Failed!");
		}
	}
}
