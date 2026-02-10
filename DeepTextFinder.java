import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeepTextFinder {

    public void findText(String url) {

        // try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8))){
        try(BufferedReader reader = new BufferedReader(new StringReader(url))) {
        String line;
        int depth = 0;
        int maxDepth = 0;
        String deepestLine = "";
        Deque<String> tagStack = new ArrayDeque<>();

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if(line.isEmpty()) continue;
            
            else if(line.startsWith("</") && line.endsWith(">")) {

                String tagName = extractTagName(line);

                if(tagStack.isEmpty() || !tagStack.pop().equals(tagName)) {
                    System.out.println("malformed HTML");
                    return;
                }

                depth--;

                //teste
                System.out.println(depth);

                if(depth < 0) {
                    System.out.println("malformed HTML");
                    return;
                }

            } else if (line.startsWith("<") && line.endsWith(">")) {

                String tagName = extractTagName(line);
                tagStack.push(tagName);

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

        if(depth != 0 || !tagStack.isEmpty()) {
            System.out.println("malformed HTML");
            return;
        }

        System.out.println(deepestLine);

        } catch (IOException e) {
            System.out.println("URL connection error");
            return;
        }
    }

    private String extractTagName(String line) {
        return line.startsWith("</") 
            ? line.substring(2, line.length() - 1)
            : line.substring(1, line.length() - 1);
    }
}
