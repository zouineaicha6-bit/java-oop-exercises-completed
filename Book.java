public class Book {
    // TODO: declare fields: title, author, price
    private String title;
    private String author;
    private double price;

    // TODO: write constructor to initialize all fields
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double discount(double percent) {
        // TODO: return discounted price
        double discountAmount = price * (percent / 100);
        double discountedPrice = price - discountAmount;
        return discountedPrice;
    }

    public void printInfo() {
        // TODO: print book details including price
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}