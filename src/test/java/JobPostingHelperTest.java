import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobPostingHelperTest {

    @Test
    void testExtractJobPostingToString() {
        String expected = "This is a test Text File.";
        String actual = JobPostingHelper.extractJobPostingToString("src/test/resources/TestTxtFile1.txt");
        assertEquals(expected, actual);
    }
}
