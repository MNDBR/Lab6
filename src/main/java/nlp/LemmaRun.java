package nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LemmaRun {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LemmaRun.class);
        String txt ="Some people consider hedgehogs useful pets because they prey on many common garden pests. ";
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        CoreDocument doc = new CoreDocument(txt);
        stanfordCoreNLP.annotate(doc);

        List<CoreLabel> lst = doc.tokens();
        for (CoreLabel lbl : lst) {
            String lemma = lbl.lemma();
            System.out.println(lbl.originalText() + " - " + lemma);

        }

    }
}
