package models;

public class Brand {

    private String brandName;
    private CarModel[] models;

    public Brand(String brandName, CarModel[] models) {
        this.brandName = brandName;
        this.models = models;
    }

    public String getBrandName() {
        return brandName;
    }

    public CarModel[] getModels() {
        return models;
    }

    // 🔥 ESTE MÉTODO DEFINE TODO EL EXAMEN
    public int getTotalValidYears() {
        int total = 0;

        if (models == null) return 0;

        for (CarModel model : models) {
            if (model.getYears() != null) {
                for (CarYear year : model.getYears()) {
                    if (year.isValid()) {
                        total++;
                    }
                }
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return "Marca: " + brandName + ", Total de años válidos: " + getTotalValidYears();
    }
}