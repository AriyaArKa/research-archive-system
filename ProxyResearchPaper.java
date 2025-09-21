public class ProxyResearchPaper implements ResearchPaper {
    private String title;
    private String authorName;
    private int publicationYear;
    private FullResearchPaper realPaper;

    public ProxyResearchPaper(String title, String authorName, int publicationYear) {
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    @Override
    public void view() {
        if (realPaper == null) {
            realPaper = new FullResearchPaper(title, authorName, publicationYear);
        }
        realPaper.view();
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
