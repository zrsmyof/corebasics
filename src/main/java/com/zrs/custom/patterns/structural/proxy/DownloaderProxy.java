package com.zrs.custom.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zrs
 */
public class DownloaderProxy implements IDownloader {

    IDownloader downloader = new Downloader();
    Map<String, String> downloadedFilms = new HashMap<>();

    @Override
    public void download(String film) {
        if (downloadedFilms.containsKey(film)) {
            System.out.println("Film " + film + " find in cache");
        } else {
            downloader.download(film);
            downloadedFilms.put(film, film);
        }
    }
}
