import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;

public class PdfHelpers {

    public static String extractPdfToString(String pdfFilePath) {
        try (PDDocument document = PDDocument.load(new File(pdfFilePath))){
            document.getClass();
            String returnString = "";
            if (!document.isEncrypted()) {

                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);

                String lines[] = pdfFileInText.split("\\r?\\n");

                for (String line : lines) {
                    returnString += line + " ";
                }
            }
            return returnString.trim().replace("\r","");
        } catch (Exception ex) {
            return "Exception happened in extractPdfToString: " + ex.toString();
        }
    }
}
