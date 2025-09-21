import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ResearchPaper> papers = new ArrayList<>();
        papers.add(new ProxyResearchPaper("Testin 1", "hitlar", 2022));
        papers.add(new ProxyResearchPaper("Testing 2", "putin", 2023));
        System.out.println("Available Papers:");
        for (ResearchPaper paper : papers) {
            System.out.println(paper.getPublicationYear() + " - " + paper.getAuthorName());
        }
        System.out.println("\nOpening the first paper...");
        papers.get(0).view(); 
    }
}
