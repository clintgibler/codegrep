package in.syam.codesearch;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.nio.file.FileSystems;
import java.io.IOException;
import java.util.Optional;

import com.google.common.collect.ImmutableSet;
import org.antlr.v4.runtime.Token;

/**
 * Unit test for simple App.
 */
public class GolangDocumentTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GolangDocumentTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GolangDocumentTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTypeDecl() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("type").stream()
                                             .filter(token -> token.getText().contentEquals("testType"))
                                             .count();
        assertEquals(1, count);
    }
    public void testField() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("field").stream().count();
        assertEquals(2, count);
    }
    public void testVarDecl() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("variable").stream()
                                             .filter(token -> token.getText().contentEquals("testLongVarDecl"))
                                             .count();
        assertEquals(1, count);
    }
    public void testFunctionDecl() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("function").stream()
                                             .filter(token -> token.getText().contentEquals("main"))
                                             .count();
        assertEquals(1, count);
    }
    public void testShortVarDecl() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("method").stream()
                                             .filter(token -> token.getText().contentEquals("testMethod"))
                                             .count();
        assertEquals(1, count);
    }
    public void testImport() throws IOException
    {
        GolangDocument d = new GolangDocument(FileSystems.getDefault().getPath("src/test/resources", "test.go"), "test.git", "go");
        long count = d.getTokens().get("import").stream().count();
        assertEquals(3, count);
    }
}