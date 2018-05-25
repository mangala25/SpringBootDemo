import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ClassLoaderTest {
	@Test
    public final void test() {
        ClassLoader c = this.getClass().getClassLoader();
        File configFile = new File(c.getResource("ConfigTest.json").getFile());
        Assert.assertTrue(configFile.exists());
    }
}
