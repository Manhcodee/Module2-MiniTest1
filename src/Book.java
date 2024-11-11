public class Book {
    public String bookCode;
    public String name;
    public double price;
    public String author;

    public Book() {

    }

    public Book(String bookCode,String name, double price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookCode() {

        return getBookCode();
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {
        return price;
    }



}
