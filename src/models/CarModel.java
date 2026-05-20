package models;

public class CarModel {

  private String modelName;
  private CarYear[] years;

  public CarModel(String modelName, CarYear[] years) {
    this.modelName = modelName;
    this.years = years;
  }

  public String getModelName() {
    return modelName;
  }

  public CarYear[] getYears() {
    return years;
  }
}