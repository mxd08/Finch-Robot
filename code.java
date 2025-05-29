import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchPlusByDistance {
    final static int SPEED = 100;         // Constant motor speed
    final static int TIME_PER_CM = 70;    // Approx time (ms) to move 1 cm at SPEED

    public static void main(String[] args) {
        Finch finch = new Finch();

        int distance = 10;  // Distance in cm for each arm of the "+"

        // Forward and back
        moveForward(finch, distance);
        moveBackward(finch, distance);

        // Right and back
        turnRight90(finch);
        moveForward(finch, distance);
        moveBackward(finch, distance);
        turnLeft90(finch);  // Reorient

        // Down and back
        turnAround(finch);
        moveForward(finch, distance);
        moveBackward(finch, distance);
        turnAround(finch);  // Reorient

        // Left and back
        turnLeft90(finch);
        moveForward(finch, distance);
        moveBackward(finch, distance);
        turnRight90(finch);  // Reorient

        finch.stop();
        finch.quit();
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

    public static void turnLeft90(Finch f) {
        f.setWheelVelocities(-SPEED, SPEED, 850);
    }

    public static void turnAround(Finch f) {
        f.setWheelVelocities(-SPEED, SPEED, 1700);
    }
}
