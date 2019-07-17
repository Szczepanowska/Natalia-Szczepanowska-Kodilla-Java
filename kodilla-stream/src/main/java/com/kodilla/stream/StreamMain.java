package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text to decorate", (text -> "ABC" + text + "ABC"));
        poemBeautifier.beautify("Text to decorate", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Text to decorate", (text -> text.toLowerCase()));
        poemBeautifier.beautify("Text to decorate", (text -> text.substring(4).toUpperCase()));
    }
}