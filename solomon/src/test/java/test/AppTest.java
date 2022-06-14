package test;

import com.google.gson.Gson;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void test1(){
        String str = """
                {
                    "userId": "1237",
                    "attractionId": '%s',
                    "score": 298
                }
                """;
        Gson gson = new Gson();
        String str2 = String.format(str, "1234");
        System.out.println(str2);
        HashMap hashMap = gson.fromJson(str2, HashMap.class);
        Gson gson2 = new Gson();
        String str3 = gson2.toJson(str);
        System.out.println(hashMap.get("attractionId"));
        System.out.println(str3);
    }
}
