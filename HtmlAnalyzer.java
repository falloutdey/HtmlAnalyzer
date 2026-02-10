
import java.io.IOException;
class HtmlAnalyzer {
    public static void main(String[] args) throws IOException {

        // if(args.length == 0 || args[0].isBlank()) {
        //     System.out.println("URL connection error");
        //     return;
        // }

        // try {
            // URL url = new URL(args[0]);
            String url = "<html><body><p>Hello World</p></body></html>";
            DeepTextFinder textFinder = new DeepTextFinder();
            textFinder.findText(url);
            
        // } catch (MalformedURLException e) {
        //     System.out.println("URL connection error");
        //     return;

        // } catch (IOException e) {
        //     System.out.println("URL connection error");
        //     return;
        // }
    }
}
