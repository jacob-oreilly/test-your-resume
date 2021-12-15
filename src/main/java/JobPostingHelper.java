import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JobPostingHelper {

    public static String extractJobPostingToString(String jobPostingFilePath) {
        Path path = Paths.get(jobPostingFilePath);
        StringBuilder sb = new StringBuilder();

        try (Stream<String> stream = Files.lines(path)){
            stream.forEach(s -> sb.append(s).append("\n"));
            return sb.toString().trim();
        }
        catch(Exception ex) {
            return "Exception happened in extractJobPostingToString: " + ex.toString();
        }
    }
}
