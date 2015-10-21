package com.websystique.springmvc;

import java.io.IOException;

/**
 * Created by syto on 21.10.2015.
 */
public class PDFBoxtest {
    public static void main(String [] args) throws IOException {
        PDFManager pdfManager = new PDFManager();
        pdfManager.setFilePath("C:\\Users\\syto\\Downloads\\of_49_25-44.pdf");
        String pdfText = pdfManager.ToText();
        System.out.println(pdfText);
    }
}
