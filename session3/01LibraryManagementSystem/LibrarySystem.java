class Item {
    String title;
    String author;
    int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends Item {
    String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends Item {
    int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String args) {
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy");
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2023, 10);

        System.out.println("Book Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Magazine Details:");
        magazine1.displayDetails();

    }
}