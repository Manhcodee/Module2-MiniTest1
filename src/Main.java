//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Nhập số sách
        ProgrammingBook[] programmingBooks = {
                new ProgrammingBook("pb01", "JavaScript", 100, "Autor 1", "JavaScript", "Spring"),
                new ProgrammingBook("pb02", "Java", 120, "Autor 2", "Java", "Reach"),
                new ProgrammingBook("pb03", "Python", 90, "Autor 3", "PHP", "Django")
        };

        FictionBook[] fictionBooks = {
                new FictionBook("F001", "OnePice", 180, "Author 4", "Viễn tưởng 1"),
                new FictionBook("F002", "Naruto", 85, "Author 5", "Viễn tưởng 2"),
                new FictionBook("F003", "Dragonball", 80, "Author 6", "Viễn tưởng 3")
        };

        //Tính tổng
        int totalPrice = 0;
        for (ProgrammingBook pBook : programmingBooks) {
            totalPrice += pBook.getPrice();
        }
        for (FictionBook fBook : fictionBooks) {
            totalPrice += fBook.getPrice();
        }

        System.out.println("Tong tien cua 6 cuon sach sau giam gia la: " + totalPrice);

        //Đếm số sách có language Java
        int findJava = 0;
        for (ProgrammingBook pBook : programmingBooks) {
            if (pBook.getLanguage().equals("Java")) {
                findJava++;
            }
        }

        System.out.println("so sach language Java la: " + findJava);

        //Đếm số sách có category là "Viễn tưởng 1"
        int findCategory1 = 0;
        for (FictionBook fBook : fictionBooks) {
            if (fBook.getCategory().equals("Viễn tưởng 1")) {
                findCategory1++;
            }
        }

        System.out.println("So sach Vien tuong 1 la: " + findCategory1);

        //Đếm số sách fiction có giá nhỏ hơn 100
        int priceFiction = 0;
        for (FictionBook fBook : fictionBooks) {
            if (fBook.getPrice() < 100) {
                priceFiction++;
            }
        }

        System.out.println("so sach fiction gia < 100 la: " +priceFiction);
    }
}