import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocxHelpersTest {
    @Test
    void testExtractDocxToString() {
        String expected = "This is a test Docx File.";
        String actual = DocxHelpers.extractDocxToString("src/test/resources/TestDocxFile1.docx");
        assertEquals(expected, actual);
    }
}
