import controllers.BrandController;
import models.Brand;
import test.TestData;

public class App {

    public static void main(String[] args) {

        Brand[] brands = TestData.createBrands();
        BrandController controller = new BrandController();

        System.out.println("=== ORIGINAL ===");
        print(brands);

        controller.sortBubbleDesc(brands);

        System.out.println("\n=== ORDENADO (Bubble Desc) ===");
        print(brands);

        System.out.println("\n=== BUSQUEDA ===");

        Brand b1 = controller.binarySearchByValidYears(brands, 7, false);
        System.out.println(b1 != null ? "Encontrada: " + b1 : "No encontrada (7)");

        Brand b2 = controller.binarySearchByValidYears(brands, 4, false);
        System.out.println(b2 != null ? "Encontrada: " + b2 : "No encontrada (4)");
    }

    public static void print(Brand[] brands) {
        for (Brand b : brands) {
            System.out.println(b);
        }
    }
}