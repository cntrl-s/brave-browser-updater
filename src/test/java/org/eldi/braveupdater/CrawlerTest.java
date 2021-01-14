package org.eldi.braveupdater;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CrawlerTest {

    private Crawler crawler;

    @Before
    public void init() {
        crawler = new Crawler();
    }

    @Test
    public void fetchUpdateLinkTest() throws IOException {
        crawler.fetchUpdateUrl("https://github.com/brave/brave-browser/blob/master/CHANGELOG_DESKTOP.md");
    }

}
