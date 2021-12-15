import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PdfHelpersTest {
    @Test
    void testExtractPDFToString() {
        String expected = "This is a test PDF File.";
        String actual = PdfHelpers.extractPdfToString("src/test/resources/TestPdfFile1.pdf");
        assertEquals(expected, actual);
    }
}
