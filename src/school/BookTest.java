package school;

//编写一个Book类，包含以下属性:书名、作者、价格。
//-属性设置为private，通过public的setter/getter方法进行访问和修改。 多
//-在主类中创建3本图书对象，分别赋值后，输出每本图书的信息。
public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("三国演义", "罗贯中", 50);
        books[1] = new Book("西游记", "吴承恩", 60);
        books[2] = new Book("水浒传", "施耐庵", 70);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}

class Book {
    private String bookName;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名:" + getBookName() + " 作者:" + getAuthor() + " 价格:" + getPrice();
    }
}