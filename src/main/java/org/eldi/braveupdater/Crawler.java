package org.eldi.braveupdater;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Crawler {

    public String fetchUpdateUrl(String url) throws IOException {
        Document changelog = Jsoup.connect(url).get();

        return changelog.select("#readme a[href]")
                .get(2)
                .attr("href");
    }

    public String visitUpdateUrl(String updateUrl) throws IOException {
        Document downloadsPage = Jsoup.connect(updateUrl).get();

        Element element = downloadsPage.getElementsByAttributeValueContaining("href", "linux-amd64")
                .first();
        return element.absUrl("href");
    }
}
