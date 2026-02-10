
import java.io.IOException;
import java.net.URL;

class HtmlAnalyzer {
    public static void main(String[] args) {

        if(args.length == 0 || args[0].isBlank()) {
            System.out.println("URL connection error");
            return;
        }

        try {
            URL url = new URL(args[0]);
            DeepTextFinder textFinder = new DeepTextFinder();
            textFinder.findText(url);
            
        } catch (IOException e) {
            System.out.println("URL connection error");
            return;
        }
    }
}
