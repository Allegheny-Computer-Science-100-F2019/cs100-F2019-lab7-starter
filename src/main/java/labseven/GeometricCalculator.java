package labseven;

// TODO: Add all of the required multiline comments to this file
// TODO: Add all of the required singleline comments to this file
// TODO: Check all of this code to ensure that it is correct
// TODO: Modify and/or add code to this file as needed

public class GeometricCalculator {

  public static double calculateSphereVolume(double radius) {
    double volume;
    volume = (3 / 4) * (Math.PI) * radius * radius * radius;
    return volume;
  }

  public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
    double area;
    area = sideA * sideA + sideB * sideC;
    return area;
  }

  public static double calculateCylinderVolume(double radius, double height) {
    double volume;
    volume = (Math.PI) * radius * radius * radius * height;
    return volume;
  }

}
