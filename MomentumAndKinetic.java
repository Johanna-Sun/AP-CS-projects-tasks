import java.util.Scanner;

public class MomentumAndKinetic {
  public static void main(String[] args) {
    double momentum;
    double mass;
    double velocity;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the object's mass: ");
    mass = scanner.nextDouble();
    System.out.println("Enter the object's velocity: ");
    velocity = scanner.nextDouble();
    momentum = mass * velocity;
    System.out.println("The momentum is: " + momentum);
    Kinetic(mass,velocity);
  }
  public static void Kinetic(double mass, double velocity){
    double kineticEnergy;
    kineticEnergy = 0.5 * mass * velocity * velocity;
    System.out.println("The kinetic energy is: " + kineticEnergy);
  }
}
