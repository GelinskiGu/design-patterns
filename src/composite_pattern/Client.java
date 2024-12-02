package composite_pattern;

public class Client {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 1.5);
        Product banana = new Product("Banana", 2.0);
        Product orange = new Product("Orange", 2.5);

        Box smallBox = new Box();
        smallBox.addComponent(apple);
        smallBox.addComponent(banana);

        Box mediumBox = new Box();
        mediumBox.addComponent(orange);

        Box largeBox = new Box();
        largeBox.addComponent(smallBox);
        largeBox.addComponent(mediumBox);
        largeBox.addComponent(new Product("Pineapple", 5.0));

        System.out.println("Preço total do pedido: " + largeBox.getPrice());
    }
}
