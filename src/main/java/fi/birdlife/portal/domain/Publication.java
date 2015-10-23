package fi.birdlife.portal.domain;

import java.net.URL;
import java.util.Locale;

/**
 * Created by tommisyvanpera on 23/10/15.
 */
public class Publication {
    public Publisher publisher;

    public String name;
    public int year;
    public int volume;
    public int pages;
    public DocumentType documentType;
    public DocumentVisibility documentVisibility;
    public URL PDFUrl;
    public String content;
    public Locale documentLanguage;

}
