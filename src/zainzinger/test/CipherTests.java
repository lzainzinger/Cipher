/**
 * 
 */
package zainzinger.test;
import org.junit.*;

import zainzinger.cipher.MonoAlphabeticCipher;

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
		if(!test.equals("zcjntvepgxhamäkdrüublßiwösoyq")){
			throw new RuntimeException("Failed!");
		}
	}
}
