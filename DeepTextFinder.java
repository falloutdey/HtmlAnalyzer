
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DeepTextFinder {
    
    // public void findText(URL url) throws IOException{
    public void findText(URL url) throws IOException{

        // BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        int depth = 0;
        int maxDepth = 0;
        String deepestLine = "";

        while ((line = reader.readLine()) != null) {
            if(line.startsWith("<") && !line.startsWith("</") && line.endsWith(">")) {
                depth++;
            } else if (line.startsWith("</") && line.endsWith(">")) {
                depth --;
            } else {
                if(depth > maxDepth) {
                    maxDepth = depth;
                    deepestLine = line;
                }
            }
        }

        System.out.println(deepestLine);
    }
}
