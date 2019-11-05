package labseven;

// NOTE: The comments will be removed from this file
// NOTE: This code has defects in it, they were shipped on purpose

/** This class has a method that computes the distance to the moon in yards.
 * The first line displays the name of the programmer and the date. Then, the
 * program's main method stores some values in variables and performs a
 * computation for the number of yards to the moon. Ultimately, the class can
 * display the number of yards to the moon.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */

public class GeometricCalculator {

  /** This class has a method that computes the distance to the moon in yards.
   * display the number of yards to the moon.
   *
   * @author Gregory M. Kapfhammer
   */
  public static double calculateSphereVolume(double radius) {
    double volume;
    // comment
    volume = (3 / 4) * (Math.PI) * radius * radius * radius;
    return volume;
  }

  /** This class has a method that computes the distance to the moon in yards.
   * display the number of yards to the moon.
   *
   * @author Gregory M. Kapfhammer
   */
  public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
    double area;
    // comment
    area = sideA * sideA + sideB * sideC;
    return area;
  }

  /** This class has a method that computes the distance to the moon in yards.
   * display the number of yards to the moon.
   *
   * @author Gregory M. Kapfhammer
   */
  public static double calculateCylinderVolume(double radius, double height) {
    double volume;
    // comment
    volume = (Math.PI) * radius * radius * radius * height;
    return volume;
  }

}
