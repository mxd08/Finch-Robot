import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Scanner;

public class FinchPlusInputDistance {
    final static int SPEED = 100;         // Wheel speed
    final static int TIME_PER_CM = 70;    // ms per centimeter at SPEED

    public static void main(String[] args) {
        Finch finch = new Finch();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance to move (in cm): ");
        int distance = scanner.nextInt();

        for(int i = 0; i<4; i++){
            moveForward(finch, distance);
            moveBackward(finch, distance);
            turnRight90(finch)
        }
        finch.stop();
        finch.quit();
        scanner.close();
    }

    public static void moveForward(Finch f, int cm) {
        int duration = cm * TIME_PER_CM;
        f.setWheelVelocities(SPEED, SPEED, duration);
    }

    public static void moveBackward(Finch f, int cm) {
        int duration = cm * TIME_PER_CM;
        f.setWheelVelocities(-SPEED, -SPEED, duration);
    }

    public static void turnRight90(Finch f) {
        f.setWheelVelocities(SPEED, -SPEED, 850);
    }

}
