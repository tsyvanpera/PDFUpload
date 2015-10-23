package fi.birdlife.portal.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.net.URL;
import java.util.Locale;

@Entity
@Table(name="publication")
public class Publication {
    public Publisher publisher;

    public final String name;
    public final int year;
    public final int volume;
    public final int pages;
    public final DocumentType documentType;
    public final DocumentVisibility documentVisibility;
    public final URL PDFUrl;
    public final String content;
    public final Locale documentLanguage;

    public Publication(String name, int year, int volume, int pages, DocumentType documentType, DocumentVisibility documentVisibility, URL pdfUrl, String content, Locale documentLanguage) {
        this.name = name;
        this.year = year;
        this.volume = volume;
        this.pages = pages;
        this.documentType = documentType;
        this.documentVisibility = documentVisibility;
        PDFUrl = pdfUrl;
        this.content = content;
        this.documentLanguage = documentLanguage;
    }
}
