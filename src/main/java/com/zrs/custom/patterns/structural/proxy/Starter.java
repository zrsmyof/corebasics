package com.zrs.custom.patterns.structural.proxy;

/**
 * @author zrs
 */
public class Starter {
    public static void main(String[] args) {
        IDownloader downloader = new Downloader();

        downloader.download("Lord of the rings");
        downloader.download("Lord of the rings");

        IDownloader proxyDownloader = new DownloaderProxy();

        proxyDownloader.download("Lord of the rings");
        proxyDownloader.download("Lord of the rings");
    }
}
