package hafta2_odev2.ClassesWithAttribute;

public class Main {

public   public static void main(String[] args) {
    System.out.println("--------------------------------------");



    Product product = new Product();

    product.id = 0;
    product.name = "MacBook Pro";
    product.description = "Laptop";
    product.price = 27.100;
    product.stock= 5;

    /*
    System.out.println("Product ID ---> " + product.id);
    System.out.println("Product Name ---> " + product.name);
    System.out.println("Product Description ---> " + product.description);
    System.out.println("Product Price ---> " + product.price);
    System.out.println("Product Stock ---> " + product.stock);
    */

    ProductManager productManager = new ProductManager();
    productManager.Add(product);



    System.out.println("--------------------------------------");
}
 {
    
}
