public class FictionBook extends Book{
    private String category;

    public FictionBook() {

    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, category);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return super.getPrice() * 0.93;
    }
}
