import models.Brand;
import models.CarModel;
import models.CarYear;
import controllers.BrandController;

public class App {
        public static void main(String[] args) throws Exception {
                System.out.println("Examen interciclo de Estructuras de Datos");
                System.out.println("====Configurar studente.env====");

                // 🔥 AGREGADO
                Brand[] brands = createBrands();
                BrandController controller = new BrandController();

                System.out.println("\n=== ORIGINAL ===");
                for (Brand b : brands) {
                        System.out.println(b.getName() + " - Años válidos: " + b.getTotalValidYears());
                }

                controller.sortBubbleDesc(brands);

                System.out.println("\n=== ORDENADO (Bubble Desc) ===");
                for (Brand b : brands) {
                        System.out.println(b.getName() + " - Años válidos: " + b.getTotalValidYears());
                }

                // 🔥 Fila D
                System.out.println("\nBuscar 7 años válidos:");
                Brand r1 = controller.binarySearchByValidYears(brands, 7, false);
                System.out.println(r1 != null ? "Encontrada: " + r1.getName() : "No encontrada");

                System.out.println("\nBuscar 4 años válidos:");
                Brand r2 = controller.binarySearchByValidYears(brands, 4, false);
                System.out.println(r2 != null ? "Encontrada: " + r2.getName() : "No encontrada");
        }
        public static Brand[] createBrands() {
                // ===== HONDA =====
                CarYear[] civicYears = {
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, true),
                                new CarYear(2023, false)
                };

                CarYear[] accordYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarModel[] hondaModels = {
                                new CarModel("Civic", civicYears),
                                new CarModel("Accord", accordYears)
                };

                Brand honda = new Brand("Honda", hondaModels);

                // ===== TOYOTA =====
                CarYear[] corollaYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, true),
                                new CarYear(2023, true)
                };

                CarYear[] camryYears = {
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, false),
                                new CarYear(2023, true)
                };

                CarModel[] toyotaModels = {
                                new CarModel("Corolla", corollaYears),
                                new CarModel("Camry", camryYears)
                };

                Brand toyota = new Brand("Toyota", toyotaModels);

                // ===== FORD =====
                CarYear[] mustangYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, false)
                };

                CarYear[] f150Years = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, false)
                };

                CarModel[] fordModels = {
                                new CarModel("Mustang", mustangYears),
                                new CarModel("F-150", f150Years)
                };

                Brand ford = new Brand("Ford", fordModels);

                // ===== CHEVROLET =====
                CarYear[] silveradoYears = {
                                new CarYear(2016, false),
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, false),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] camaroYears = {
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarModel[] chevroletModels = {
                                new CarModel("Silverado", silveradoYears),
                                new CarModel("Camaro", camaroYears)
                };

                Brand chevrolet = new Brand("Chevrolet", chevroletModels);

                // ===== NISSAN =====
                CarYear[] altimaYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, false),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] sentraYears = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, false)
                };

                CarModel[] nissanModels = {
                                new CarModel("Altima", altimaYears),
                                new CarModel("Sentra", sentraYears)
                };

                Brand nissan = new Brand("Nissan", nissanModels);

                // ===== MAZDA =====
                CarYear[] mazda3Years = {
                                new CarYear(2016, true),
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarYear[] cx5Years = {
                                new CarYear(2017, true),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, true),
                                new CarYear(2022, true)
                };

                CarModel[] mazdaModels = {
                                new CarModel("Mazda3", mazda3Years),
                                new CarModel("CX-5", cx5Years)
                };

                Brand mazda = new Brand("Mazda", mazdaModels);

                // ===== HYUNDAI =====
                CarYear[] elantraYears = {
                                new CarYear(2016, true),
                                new CarYear(2017, true),
                                new CarYear(2018, false),
                                new CarYear(2019, true),
                                new CarYear(2020, false),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarYear[] tucsonYears = {
                                new CarYear(2017, false),
                                new CarYear(2018, true),
                                new CarYear(2019, true),
                                new CarYear(2020, true),
                                new CarYear(2021, false),
                                new CarYear(2022, true)
                };

                CarModel[] hyundaiModels = {
                                new CarModel("Elantra", elantraYears),
                                new CarModel("Tucson", tucsonYears)
                };

                Brand hyundai = new Brand("Hyundai", hyundaiModels);

                return new Brand[] { honda, toyota, ford, chevrolet, nissan, mazda, hyundai };
        }

}
