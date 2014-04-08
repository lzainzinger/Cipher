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
		if(!test.equals("zcjntvepgxham�kdr�ubl�iw�soyq")){
			throw new RuntimeException("Failed!");
		}
	}
	SubstitutionCipher ab = new SubstitutionCipher("����zyxwvutsrqponmlkjihgfedcba");
	
	@Test
	public void testSubstitutionCipher(){
		String test = ab.getSecretAlphabet();
		if(!test.equals("����zyxwvutsrqponmlkjihgfedcba")){
			throw new RuntimeException("Failed!");
		}
	}
	
	@Test
	public void testSubstSet(){
		ab.setSecretAlphabet("a���zyxwvutsrqponmlkjihgfedcb�");
		String test = ab.getSecretAlphabet();
		if(!test.equals("a���zyxwvutsrqponmlkjihgfedcb�")){
			throw new RuntimeException("Failed!");
		}
	}
}
