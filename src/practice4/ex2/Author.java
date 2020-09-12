package practice4.ex2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return "name: " + this.name + ", email: '" + this.email + "', gender: " + this.gender;
    }

    public static void main(String[] args) {
        Author a = new Author("john", "aaa@mail.ru", '1');
        System.out.println(a);
        System.out.println(a.email);
        a.setEmail("bbbb@gmail.com");
        System.out.println(a.email);
    }
}
