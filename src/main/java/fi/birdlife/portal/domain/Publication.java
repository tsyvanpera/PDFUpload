package fi.birdlife.portal.domain;

import javax.persistence.*;
import java.net.URL;
import java.util.Locale;

@Entity
@Table(name="publication")
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   // public Publisher publisher;

    public String name;
    public int year;
    public int volume;
    public int pages;
    public DocumentType documentType;
    public DocumentVisibility documentVisibility;
    public URL PDFUrl;
    public String content;
    public Locale documentLanguage;

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

    public Locale getDocumentLanguage() {
        return documentLanguage;
    }

    public void setDocumentLanguage(Locale documentLanguage) {
        this.documentLanguage = documentLanguage;
    }
/*
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public DocumentVisibility getDocumentVisibility() {
        return documentVisibility;
    }

    public void setDocumentVisibility(DocumentVisibility documentVisibility) {
        this.documentVisibility = documentVisibility;
    }

    public URL getPDFUrl() {
        return PDFUrl;
    }

    public void setPDFUrl(URL PDFUrl) {
        this.PDFUrl = PDFUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


