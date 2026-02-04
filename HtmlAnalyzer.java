
import java.io.IOException;
class HtmlAnalyzer {
    public static void main(String[] args) throws IOException {

        // if(args.length == 0) {
        //     System.out.println("URL connection error");
        //     return;
        // }

        // try {
        //     URL url = new URL(args[0]);
        //     DeepTextFinder textFinder = new DeepTextFinder();
        //     textFinder.findText(url);
            
        // } catch (MalformedURLException e) {
        //     System.out.println("URL connection error");
        //     return;

        // } catch (IOException e) {
        //     System.out.println("URL connection error");
        //     return;
        // }
String htmlTeste = """
<html>
<body>
<div>
<p>
Texto
</div>
</p>
</body>
</html>






""";




            DeepTextFinder textFinder = new DeepTextFinder();
            textFinder.findText(htmlTeste);

    }
}
