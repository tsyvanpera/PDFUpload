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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="publisher")
    public Publisher publisher;

    public String name;
    public int year;
    public int volume;
    public int pages;
    public DocumentType type;
    public DocumentVisibility visibility;
    public URL PDFUrl;
    public String content;
    public DocumentLanguage language;

    public Publication() {}

    public Publication(String name, int year, int volume, int pages, DocumentType type, DocumentVisibility visibility, URL pdfUrl, String content, DocumentLanguage language) {
        this.name = name;
        this.year = year;
        this.volume = volume;
        this.pages = pages;
        this.type = type;
        this.visibility = visibility;
        PDFUrl = pdfUrl;
        this.content = content;
        this.language = language;
    }

    public DocumentLanguage getDocumentLanguage() {
        return language;
    }

    public void setDocumentLanguage(DocumentLanguage language) {
        this.language = language;
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
        return type;
    }

    public void setDocumentType(DocumentType type) {
        this.type = type;
    }

    public DocumentVisibility getDocumentVisibility() {
        return visibility;
    }

    public void setDocumentVisibility(DocumentVisibility visibility) {
        this.visibility = visibility;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


