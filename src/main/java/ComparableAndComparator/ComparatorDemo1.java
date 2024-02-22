package ComparableAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Author1 {
    String firstName;
    String bookName;
    int authorAge;

    public Author1(String firstName, String bookName, int authorAge) {
        this.firstName = firstName;
        this.bookName = bookName;
        this.authorAge = authorAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "Author1{" +
                "firstName='" + firstName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}

class AuthorAgeComparator implements Comparator<Author1> {

    @Override
    public int compare(Author1 o1, Author1 o2) {
        if (o1.authorAge == o2.authorAge)
            return 0;
        else if (o1.authorAge > o2.authorAge)
            return 1;
        else
            return -1;
    }
}

class BookNameComparator implements Comparator<Author1> {

    @Override
    public int compare(Author1 o1, Author1 o2) {
        return o1.bookName.compareTo(o2.bookName);
    }
}
public class ComparatorDemo1 {
    public static void main(String[] args) {
        ArrayList<Author1> authorList = new ArrayList<>();
        authorList.add(new Author1("William" , "Shakespear", 90));
        authorList.add(new Author1("Mike" , "Davante", 19));
        authorList.add(new Author1("Luce" , "Williams", 20));
        authorList.add(new Author1("Rouge" , "Benalia", 21));
        authorList.add(new Author1("Tyrese" , "Monkey", 22));
        Collections.sort(authorList, new AuthorAgeComparator());
        System.out.println("Author is sorted based upon the age");
        for (Author1 au : authorList) {
            System.out.println(au.getAuthorAge() + " " + au.getBookName() + " " + au.getFirstName());
        }

        Collections.sort(authorList, new BookNameComparator());
        System.out.println("Author is sorted based upon the book name right now");
        for (Author1 au : authorList) {
            System.out.println(au.getAuthorAge() + " " + au.getBookName() + " " + au.getFirstName());
        }
    }
}
