package controllers;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {

    int n = brands.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
      swapped = false;

      for (int j = 0; j < n - i - 1; j++) {

        int actual = brands[j].getTotalValidYears();
        int siguiente = brands[j + 1].getTotalValidYears();

        if (actual < siguiente) {
          Brand temp = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = temp;
          swapped = true;
        }
      }

      if (!swapped)
        break;
    }

    return brands;
  }

  public Brand binarySearchByValidYears(
      Brand[] brands,
      int validYears,
      boolean isAscending) {

    int left = 0;
    int right = brands.length - 1;

    while (left <= right) {

      int mid = (left + right) / 2;
      int midValue = brands[mid].getTotalValidYears();

      if (midValue == validYears) {
        return brands[mid];
      }

      if (isAscending) {
        if (midValue < validYears) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else { // DESCENDENTE
        if (midValue > validYears) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return null;
  }
}