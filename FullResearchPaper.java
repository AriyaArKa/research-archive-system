public class FullResearchPaper implements ResearchPaper {
    private String title;
    private String authorName;
    private int publicationYear;
    private String pdfContent; 

    public FullResearchPaper(String title, String authorName, int publicationYear) {
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        loadPDF();  
    }

    private void loadPDF() {
        this.pdfContent = "Loading PDF content for " + title + "...";
        System.out.println(pdfContent);
    }

    @Override
    public void view() {
        System.out.println("Viewing PDF: " + title);
    }

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }
}
