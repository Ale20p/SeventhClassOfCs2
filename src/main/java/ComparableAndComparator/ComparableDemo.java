package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

class Author implements Comparable<Author>{
    String firstName;
    String lastName;
    String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Author> authorList = new ArrayList<Author>();
        authorList.add(new Author("William" , "Shakespear", "Clue"));
        authorList.add(new Author("Mike" , "Davante", "Book"));
        authorList.add(new Author("Luce" , "Williams", "Goo"));
        authorList.add(new Author("Rouge" , "Benalia", "Goop"));
        authorList.add(new Author("Tyrese" , "Monkey", "Roop"));
        Collections.sort(authorList);
        for (Author author : authorList) {
            System.out.println(author.firstName + " " + author.lastName + " " + author.bookName);
        }
    }
}
