import java.awt.Robot;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;

public class MouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            // Time interval (60000 for 60 seconds)
            int interval = 60000;

            while (true) {
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int currentX = mouseLocation.x;
                int currentY = mouseLocation.y;

                robot.mouseMove(currentX + 5, currentY + 5);
                Thread.sleep(interval);
                robot.mouseMove(currentX, currentY);
                Thread.sleep(interval);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
