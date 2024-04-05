import java.util.ArrayList;

public class PriceCalculator {
    private final ArrayList<Product> productsList = new ArrayList<>();
    private float currentSum;

    public void addProduct(String title, float price){
        productsList.add(new Product(title, price));
        currentSum = currentSum + price;
        System.out.printf("Товар %s успешно добавлен в калькулятор.", title);
    }

    public void printProducts(){
        for (Product product : productsList){
            System.out.println(product.toString());
        }
    }

    public void printPriceForEach(int peopleCount){
        float priceForEach = currentSum/peopleCount;
        System.out.printf("Каждый человек должен заплатить %.2f "
                + Utils.getRubleInRightCase((int) Math.floor(priceForEach)), priceForEach);
    }
}
