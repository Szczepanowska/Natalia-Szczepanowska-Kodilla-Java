package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuit {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        Book book1 = new Book("The Jungle Book", "Kipling", LocalDate.of(1888, 11, 12));
        Book book2 = new Book("Winnie the Pooh", "Milne", LocalDate.of(1889, 10, 12));
        Book book3 = new Book("Peter Pan", "Barrie", LocalDate.of(1988, 11, 12));

        Library library = new Library("library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Library II");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Library III");

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());


    }
}
