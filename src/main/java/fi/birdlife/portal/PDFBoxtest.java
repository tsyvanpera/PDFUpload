package fi.birdlife.portal;

import java.io.IOException;

/**
 * Created by syto on 21.10.2015.
 */
public class PDFBoxtest {
    public static void main(String [] args) throws IOException {
        PDFService pdfService = new PDFService("C:\\Users\\syto\\Downloads\\of_49_25-44.pdf");
        String pdfText = pdfService.getText();
        System.out.println(pdfText);
    }
}
