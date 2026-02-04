import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class DeepTextFinder {
    
    // public void findText(URL url) throws IOException{
    public void findText(String html) throws IOException{

        // BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
        BufferedReader reader = new BufferedReader(new StringReader(html));
        String line;
        int depth = 0;
        int maxDepth = 0;
        String deepestLine = "";

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if(line.isEmpty()) {
                continue;
            } else if(line.startsWith("</") && line.endsWith(">")) {
                depth--;

                //teste
                System.out.println(depth);
            } else if (line.startsWith("<") && line.endsWith(">")) {
                depth ++;

                //teste
                System.out.println(depth);
            } else {
                if(depth > maxDepth) {
                    maxDepth = depth;
                    deepestLine = line;
                }
            }
        }

        reader.close();
        System.out.println(deepestLine);
    }
}
