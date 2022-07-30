import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils {
    public static void path(String file) {
        if (!Files.exists(Paths.get(file))) {
            System.out.println("Вы ввели неверный путь к файлу");
        } else {
            try (Stream<Path> pathStream = Files.walk(Paths.get(file))) {
//                pathStream.forEach();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
