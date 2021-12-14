import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileInputStream;

public class DocxHelpers {

    public static String extractDocxToString(String docxFilePath) {
        try {
            FileInputStream fileInput = new FileInputStream(docxFilePath);
            XWPFDocument xDoc = new XWPFDocument(OPCPackage.open(fileInput));
            XWPFWordExtractor extractor = new XWPFWordExtractor(xDoc);
            return extractor.getText().trim().replace("\r","");
        }
        catch (Exception ex) {
            return "Exception happened in extractDocxToString: " + ex.toString();
        }

    }
}
