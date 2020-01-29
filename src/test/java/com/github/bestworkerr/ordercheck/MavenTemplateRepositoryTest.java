package com.github.bestworkerr.ordercheck;

import com.github.bestworderr.ordercheck.MavenTemplateRepository;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit-level testing for {@link MavenTemplateRepository} object.
 */
public class MavenTemplateRepositoryTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        MavenTemplateRepository main = new MavenTemplateRepository();
        Assert.assertNotNull(main);
    }

}
