package models;

public class Brand {
  private String name;
  private CarModel[] models;

  public Brand(String name, CarModel[] models) {
    this.name = name;
    this.models = models;
  }

  // 🔥 ESTE MÉTODO ES EL QUE TE FALTA O ESTÁ MAL
  public String getName() {
    return name;
  }

  public CarModel[] getModels() {
    return models;
  }

  public int getTotalValidYears() {
    int total = 0;

    for (CarModel model : models) {
      for (CarYear year : model.getYears()) {
        if (year.isValid()) {
          total++;
        }
      }
    }

    return total;
  }
}