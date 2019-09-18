package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.Test;

import us.aaraujo1.Main;

/**
 * Created by aaraujo1 on 9/3/18.
 *
 * @author andregaraujo
 * @version 2018 0903 .1
 *
 * Test class to test Encrypt and Decrypt methods
 */

public class MainTest extends TestCase {

    @Test
    public void testEncrypt() {
        assertEquals("k",Main.Encrypt("a"));
    }

    @Test
    public void testDecrypt() {
        assertEquals("a",Main.Decrypt("k"));
    }
}