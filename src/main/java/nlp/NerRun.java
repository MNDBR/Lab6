package nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NerRun {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(NerRun.class);
         String txt = "Kobe Bean Bryant was an American professional basketball player. ";
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        CoreDocument doc = new CoreDocument(txt);
        stanfordCoreNLP.annotate(doc);
        List<CoreLabel> lst = doc.tokens();
        for (CoreLabel lbl : lst) {
            String ner = lbl.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(lbl.originalText() + " - " + ner);
        }
        }
    }

