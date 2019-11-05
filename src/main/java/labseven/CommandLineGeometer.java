package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

// NOTE: All of these comments are defaults

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

public class CommandLineGeometer {

  private enum GeometricShape { sphere, triangle, cylinder }

  /** This class has a method that computes the distance to the moon in yards.
   * display the number of yards to the moon.
   *
   * @author Gregory M. Kapfhammer
   */
  public static void main(String[] args) {

    // display the welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println("Welcome to the Command Line Geometer!");
    System.out.println();

    // declare the starting file and scanner
    File geometryInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      geometryInputsFile = new File("input/geometry_inputs.txt");
      scanner = new Scanner(geometryInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file!");
    }

    // specify the first file for which we will calculate
    GeometricShape shape = GeometricShape.sphere;

    // NOTE: Add comments to all of the remaining code!
    // NOTE: Please add at least one comment for each block of code

    double radius;
    radius = scanner.nextDouble();
    System.out.println("I am reading in the radius for the " + shape + ".");
    System.out.println();

    System.out.println("Calculating the volume of a "
        + shape + " with radius equal to " + radius + ".");
    double sphereVolume = GeometricCalculator.calculateSphereVolume(radius);
    System.out.println("The volume is equal to " + sphereVolume + ".");
    System.out.println();

    shape = GeometricShape.triangle;

    int firstSide;
    firstSide = scanner.nextInt();
    System.out.println("I am reading in the length of the first side.");

    int secondSide;
    secondSide = scanner.nextInt();
    System.out.println("I am reading in the length of the second side.");

    int thirdSide;
    thirdSide = scanner.nextInt();
    System.out.println("I am reading in the length of the third side.");
    System.out.println();

    System.out.println("Calculating the area of a " + shape + ".");
    double triangleArea =
        GeometricCalculator.calculateTriangleArea(firstSide, secondSide, thirdSide);
    System.out.println("The area is equal to " + triangleArea + ".");
    System.out.println();

    shape = GeometricShape.cylinder;

    System.out.println("I am reading in the radius for the " + shape + ".");
    radius = scanner.nextDouble();

    double height;
    System.out.println("I am reading in the height for the " + shape + ".");
    height = scanner.nextDouble();
    System.out.println();

    System.out.println("Calculating the volume of a "
          + shape + " with radius equal to " + radius + ".");
    System.out.println("Calculating the volume of a "
          + shape + " with height equal to " + height + ".");
    double cylinderVolume = GeometricCalculator.calculateCylinderVolume(radius, height);
    System.out.println("The volume is equal to " + sphereVolume);
  }

}
