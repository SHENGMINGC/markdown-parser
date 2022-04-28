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

  @Test
  public void linkTest2() throws Exception{
    List expect = List.of("https://something.com", "some-page.html");
    String content = Files.readString(Path.of("test-file2.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest3() throws Exception{
    List expect = List.of("");
    String content = Files.readString(Path.of("test-file3.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest4() throws Exception{
    List expect = List.of("");
    String content = Files.readString(Path.of("test-file4.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest5() throws Exception{
    List expect = List.of("");
    String content = Files.readString(Path.of("test-file5.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest6() throws Exception{
    List expect = List.of("page.com");
    String content = Files.readString(Path.of("test-file3.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest7() throws Exception{
    List expect = List.of("");
    String content = Files.readString(Path.of("test-file3.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }

  @Test
  public void linkTest8() throws Exception{
    List expect = List.of("a link on the first line");
    String content = Files.readString(Path.of("C:\\Users\\CEMS\\Documents\\GitHub\\markdown-parser\\test-file8.md"));
    
    assertEquals(expect, MarkdownParse.getLinks(content));
  }


}
