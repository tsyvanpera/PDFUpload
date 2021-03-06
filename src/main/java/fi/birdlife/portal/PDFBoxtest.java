package fi.birdlife.portal;

import fi.birdlife.portal.controller.PDFController;
import fi.birdlife.portal.domain.*;
import javassist.NotFoundException;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;

/**
 * Created by syto on 21.10.2015.
 */
public class PDFBoxtest {
    public static void main(String [] args) throws IOException, NotFoundException {
        PDFController controller = new PDFController();
        String pdfFile = "/Users/tommisyvanpera/Documents/of_46_85-86.pdf";
        PDFService pdfService = new PDFService(pdfFile);
        String pdfText = pdfService.getText();

        controller.addPublication(1,new Publication("Tringa",2015,3,130, DocumentType.TEXT, DocumentVisibility.FREE,new URL("file://"+pdfFile),pdfText, DocumentLanguage.ENGLISH));
    }
}
