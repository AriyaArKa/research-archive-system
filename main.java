import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ResearchPaper> papers = new ArrayList<>();
        papers.add(new ProxyResearchPaper("AI in Healthcare", "Dr. Smith", 2022));
        papers.add(new ProxyResearchPaper("Quantum Computing", "Dr. Johnson", 2023));
        System.out.println("Available Papers:");
        for (ResearchPaper paper : papers) {
            System.out.println(paper.getPublicationYear() + " - " + paper.getAuthorName());
        }
        System.out.println("\nOpening the first paper...");
        papers.get(0).view(); 
    }
}
