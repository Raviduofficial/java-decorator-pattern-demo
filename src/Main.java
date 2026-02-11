public class Main {
    public static void main(String[] args) {
        // Start with a basic coffee
        Coffee coffee = new SimpleCoffee();
        printOrder(coffee);

        // Add milk
        Coffee milkcoffe = new MilkDecorator(coffee);
        printOrder(milkcoffe);

        // Add chocolate
        Coffee chocolate = new ChocolateDecorator(coffee);
        printOrder(chocolate);

        // Add chocolate to the milk coffee
        coffee = new ChocolateDecorator(milkcoffe);
        printOrder(coffee);
    }

    private static void printOrder(Coffee coffee) {
        System.out.printf("Order: %-30s | Cost: $%.2f%n",
                coffee.getDescription(),
                coffee.getCost());
    }
}