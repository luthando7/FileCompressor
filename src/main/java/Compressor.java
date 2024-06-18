import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Compressor {
    public static void main(String[] args) {
        String fileName = System.getProperty("filePath");
        Compressor compressor  = new Compressor();
        byte[] fileContent = compressor.readFile(fileName);
        System.out.println(Arrays.toString(fileContent));
    }

    private byte[] readFile(String fileName) {
        try {
            return Files.readAllBytes(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }
}
