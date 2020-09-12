package practice3.Book;

public class Book {
    private String author;
    private String title;
    private int date;

    public Book(String a, String t, int d) {
        author = a;
        title = t;
        date = d;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(String title){
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(String author){
        return author;
    }

    public String toString(){
        return "Author: " + this.author + ", Title: '" + this.title + "', date: " + this.date;
    }
}
