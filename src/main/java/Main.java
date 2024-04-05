import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        //--- Запрашиваем количество человек
        System.out.println("Введите количество человек, на которое необходимо разделить счет:");
        int peopleCount = getPeopleCount();
        //--- Заполняем корзину товарами
        PriceCalculator priceCalculator = new PriceCalculator();
        while (true){
            System.out.println("Введите название товара:");
            String title = getTitle();
            System.out.println("Введите цену товара:");
            float price = getPrice();
            priceCalculator.addProduct(title, price);
            System.out.println("Хотите ли вы добавить ещё один товар в корзину?\nЕсли не хотите, то наберите команду 'Завершить'");
            String command = scanner.next();
            if (command.equalsIgnoreCase("ЗАВЕРШИТЬ")) {
                break;
            }
        }
        //--- Выводим корзину и сумму, которую должен заплатить каждый человек
        System.out.println("Добавленные товары:");
        priceCalculator.printProducts();
        priceCalculator.printPriceForEach(peopleCount);
        scanner.close();
    }

    public static int getPeopleCount(){
        String peopleCount;
        while (true) {
            peopleCount = scanner.next();
            if (!Utils.isCorrectPeopleCount(peopleCount)) {
                System.out.println("Некорректное значение. Попробуйте снова!");
            }
            else {
                break;
            }
        }
        return Integer.parseInt(peopleCount);
    }

    public static String getTitle(){
        String title;
        while (true){
            title = scanner.next();
            if (!Utils.isCorrectTitle(title)){
                System.out.println("Некорректное название. Попробуйте ввести товар заново.");
                continue;
            }
            break;
        }
        return title;
    }

    public static float getPrice(){
        String price;
        while (true){
            price = scanner.next();
            if (!Utils.isCorrectPrice(price)){
                System.out.println("Некорректная цена. Попробуйте ввести товар заново.");
                continue;
            }
            break;
        }
        return Float.parseFloat(price);
    }

}