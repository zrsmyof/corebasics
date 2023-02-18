package com.zrs.custom.patterns.structural.proxy;

import java.util.Set;

/**
 * @author zrs
 */
public class Downloader implements IDownloader {

    Set<String> films = Set.of("Lord of the rings", "Harry Potter", "Forrest Gump");

    @Override
    public void download(String film) {
        if (films.contains(film)) {
            System.out.println(film + " was downloaded.");
        } else {
            System.out.println("Film " + film + " is not found.");
        }
    }
}
