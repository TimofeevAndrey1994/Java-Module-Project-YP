public class Product {
    float price;
    String title;

    Product(String title, float price){
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Товар - " + '\'' + this.title + '\'' + " стоимостью " + this.price;
    }
}
