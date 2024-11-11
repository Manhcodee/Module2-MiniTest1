//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Nhập số sách
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("pb01", "JavaScript", 100, "Autor 1", "JavaScript", "Spring");
        books[1] = new ProgrammingBook("pb02", "Java", 120, "Autor 2", "Java", "Reach");
        books[2] = new ProgrammingBook("pb03", "Python", 90, "Autor 3", "PHP", "Django");
        books[3] = new FictionBook("F001", "OnePice", 180, "Author 4", "Viễn tưởng 1");
        books[4] = new FictionBook("F002", "Naruto", 85, "Author 5", "Viễn tưởng 2");
        books[5] = new FictionBook("F003", "Dragonball", 80, "Author 6", "Viễn tưởng 3");

        int totalPrice = 0;
        int findJava = 0;
        int findCategory1 = 0;
        int priceFiction = 0;

        for (Book book : books) {
            totalPrice += book.getPrice();
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    findJava++;
                }
            }
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1")) {
                    findCategory1++;
                }
            }
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getPrice() < 100) {
                    priceFiction++;
                }
            }
        }

        System.out.println("Tong tien cua 6 cuon sach sau giam gia la: " + totalPrice);
        System.out.println("so sach language Java la: " + findJava);
        System.out.println("So sach Vien tuong 1 la: " + findCategory1);
        System.out.println("so sach fiction gia < 100 la: " + priceFiction);
    }
}