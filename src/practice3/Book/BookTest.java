package practice3.Book;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("Pushkin", "Evgeniy Onegin", 9999);
        Book book2 = new Book("Krylov", "Dom v podvale", 1923);
        System.out.println(book1);
        book1.setAuthor("Nobody");
        book1.setDate(1000);
        book1.setTitle("???");
        System.out.println(book1);
        System.out.println(book2);
    }
}
