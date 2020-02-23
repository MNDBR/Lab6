package nlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.simple.Sentence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SentimentRun {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SentenceRun.class);
        String txt ="Hedgehogs hibernate in cold climates. In deserts, they sleep through heat and drought in a similar process called aestivation.";
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        CoreDocument doc = new CoreDocument(txt);
        stanfordCoreNLP.annotate(doc);

        List<CoreSentence> sens = doc.sentences();
        for (CoreSentence sen : sens) {
            String sentiment = sen.sentiment();
            System.out.println(sen + " \t " + sentiment);

        }
    }
}
