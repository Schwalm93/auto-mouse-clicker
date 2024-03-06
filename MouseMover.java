import java.awt.Robot;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;

public class MouseMover {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            // Definiere das Zeitintervall in Millisekunden (z.B. 5000 für 5 Sekunden)
            int interval = 60000; // X Sekunden * 1000

            while (true) {
                // Aktuelle Position der Maus erhalten
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int currentX = mouseLocation.x;
                int currentY = mouseLocation.y;

                // Bewege die Maus um 1 Pixel diagonal
                robot.mouseMove(currentX + 10, currentY + 10);

                // Warte für das definierte Intervall
                Thread.sleep(interval);

                // Bewege die Maus zurück zur ursprünglichen Position
                robot.mouseMove(currentX, currentY);

                // Warte wieder, damit es eine kontinuierliche Bewegung gibt
                Thread.sleep(interval);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
