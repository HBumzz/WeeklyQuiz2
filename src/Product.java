public class Product implements Promotion {
    String name;
    int price;
    int weight;

    public Product(String name, int price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int promotionDiscount() {
        if (name.equalsIgnoreCase("grocery")) {
            return 2000;
        } else if (name.equalsIgnoreCase("beauty")) {
            return 10000;
        }
        else {
            return 0;
        }
    }
}
