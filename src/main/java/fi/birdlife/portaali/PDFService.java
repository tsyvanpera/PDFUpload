package fi.birdlife.portaali;

/**
 * Created by syto on 21.10.2015.
 */

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PDFService {

    private PDFParser parser;
    private PDFTextStripper pdfStripper;
    private PDDocument pdDoc ;
    private COSDocument cosDoc ;

    public PDFService(final String filePath) throws IOException {
        parser = new PDFParser(new FileInputStream(new File(filePath)));
        parser.parse();
        cosDoc = parser.getDocument();
        pdDoc = new PDDocument(cosDoc);
        pdDoc.getNumberOfPages();
    }

    public String getText() throws IOException
    {
        pdfStripper = new PDFTextStripper();
        pdfStripper.setStartPage(1);
        pdfStripper.setEndPage(pdDoc.getNumberOfPages());

        return pdfStripper.getText(pdDoc);
    }
}
