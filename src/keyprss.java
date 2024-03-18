import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

public class keyprss {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            while (true) {
                // Drückt die X-Taste
                int keyToPress = KeyEvent.VK_X;

                robot.keyPress(keyToPress);
                robot.keyRelease(keyToPress);
                System.out.println("KeyPressed: " + keyToPress);

                // Sleep for a random duration between 1.5 to 2 seconds
                int sleepDuration = 3000 + random.nextInt(500); // 1500ms = 1.5 seconds, 500ms = 0.5 seconds
                Thread.sleep(sleepDuration);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
