
import java.util.Scanner;

public class Book{
    private int id;
    private String title;
    private String author;
    private long price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(int id, String title, String author, long price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void input(){
        //code to input book details
        Scanner x = new Scanner(System.in);
        System.out.println("Nhập thông tin sách:");
        System.out.print("ID: ");
        this.id = Integer.parseInt(x.nextLine());
        System.out.print("Title: ");
        this.title = x.nextLine();
        System.out.print("Author: ");
        this.author = x.nextLine();
        System.out.print("Price: ");
        this.price = Long.parseLong(x.nextLine());
    }
    public void output(){
        String msg = """
                Thông tin sách: 
                Book ID: %d
                Title: %s
                Author: %s
                Price: %d
                """.formatted(this.id, this.title, this.author, this.price);
        System.out.println(msg);
    }


}