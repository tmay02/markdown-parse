import static org.junit.Assert.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import org.junit.*;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMarkownParse() throws IOException {
        Path fileName = Path.of("/Users/tylermay/Documents/GitHub/markdown-parse/test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"),
            MarkdownParse.getLinks(contents));
    }
}