import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class ObserverImpl2 implements Observer, Serializable {
    @Override
    public void update(String message) {
        File file = new File("observer_log.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
