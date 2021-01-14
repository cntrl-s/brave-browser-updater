package org.eldi.braveupdater;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Crawler crawler = new Crawler();

        String changelogUrl = "https://github.com/brave/brave-browser/blob/master/CHANGELOG_DESKTOP.md";
        String updateUrl = crawler.fetchUpdateUrl(changelogUrl);
        String downloadUrl = crawler.visitUpdateUrl(updateUrl);
        System.out.println(downloadUrl);
        System.out.println("Changelog : " + changelogUrl);
        // TODO released x days ago, changelog
    }
}
