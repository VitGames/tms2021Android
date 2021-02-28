public class Main {
    public static void main(String[] args) {
         try {
        Application application = new Application();
        Product pr1 = new Product(0, "Polo", "Седан", 22000);
        Product pr2 = new Product(1, "Passat", "Седан", 33000);
        Product pr3 = new Product(2, "Sharan", "Минивен", 26000);
        Product pr4 = new Product(3, "Touran", "Минивен", 29000);
        Product pr5 = new Product(4, "Touareg", "Кроссовер", 42000);
        application.getShop().getShop().add(0,pr1);
        application.getShop().getShop().add(0,pr2);
        application.getShop().getShop().add(0,pr3);
        application.getShop().getShop().add(0,pr4);

        application.Start();
//            shop.addProduct(pr5);
//            shop.sortPrice(shop);
//            shop.removeProduct(0);
//            shop.editProduct(pr2);
//            shop.showAllProducts(shop);
         } catch (ProductAlreadyExist | InvalidProductId ex) {
             ex.printStackTrace();
         }
    }
}