import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.*;

import java.util.*;
import java.nio.file.*;


public class MarkdownParseTest {
  @Test //this is a test file
  public void addition() {
    assertEquals(2, 1 + 1); //check if 2=1+1
  }

  @Test
  public void linkTest() throws Exception{
    List expect = List.of("https://something.com", "some-page.html");
    String content = Files.readString(Path.of("C:\\Users\\CEMS\\Documents\\GitHub\\markdown-parser\\test-file.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
    
  }


}
