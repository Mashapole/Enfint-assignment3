
package Question1;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shake_Smith
 */
public class Methods_HolderTest {
    
    public Methods_HolderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() 
    {
    }

    @Test
    public void testCheckOutputFile() 
    {
        System.out.println("This Test Case is Firstly checking if output file exit");
        File file = new File("ouput.txt");
        boolean expResult = false;
        boolean result = Methods_Holder.CheckOutputFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of Concatenate method, of class Methods_Holder.
     */
    @Test
    public void testConcatenate() throws Exception 
    {
        System.out.println("Concatenated Files");
        String fileOne = "file 2-1.txt";
        String fileTwo = "file 2-2.txt";
        File file = new File("C:/Users/Shake_Smith/Documents/NetBeansProjects/Enfint_Assignment3/Folder 1/Folder 2");
        String sortedFiles = "file 1-1.txt";
        String path = "C:/Users/Shake_Smith/Documents/NetBeansProjects/Enfint_Assignment3/Folder 1";
        Methods_Holder.Concatenate(fileOne, fileTwo, file, sortedFiles, path);
    }

    /**
     * Test of RootInputDataFiles method, of class Methods_Holder.
     */
    @Test
    public void testRootInputDataFiles() throws Exception 
    {
        System.out.println("Return Data inside 1-1.txt");
        String fileName = "file 1-1.txt";
        String path = "C:/Users/Shake_Smith/Documents/NetBeansProjects/Enfint_Assignment3/Folder 1";
        String expResult = "Lorem ipsum dolar sit amet, consectetur adipiscing elit. Suspendisse id enum euismond erat elementum cursus. *require 'Folder 1/Folder 2/File 2.1'* In hac habitasse platea dictumst. Etiam vitae tortor ipsum. Morbi massa augue, lacinia se nisi id, conque eleifend lorem.";
        String result = Methods_Holder.RootInputDataFiles(fileName, path);
        assertEquals(expResult, result);

    }

    /**
     * Test of FileOne method, of class Methods_Holder.
     */
    @Test
    public void testFileOne() throws Exception 
    {
        System.out.println("Returns the data in 2-1.txt");
        String fileName = "file 2-1.txt";
        File file = new File("C:/Users/Shake_Smith/Documents/NetBeansProjects/Enfint_Assignment3/Folder 1/Folder 2");
        String expResult = "Praesent feugiat egestas sem, id luctus dignissim ac. Donec elementum rhoncus quam, vitae viverra massa euismond a. Morbi dictum sapien sed porta tristique. Donec varius convallis quam in frigilla.";
        String result = Methods_Holder.FileOne(fileName, file);
        assertEquals(expResult, result);
    }

    /**
     * Test of FileTwo method, of class Methods_Holder.
     */
    @Test
    public void testFileTwo() throws Exception 
    {
        System.out.println("Return Data in file 2-2.txt");
        String fileName = "file 2-2.txt";
        File file = new File("C:/Users/Shake_Smith/Documents/NetBeansProjects/Enfint_Assignment3/Folder 1/Folder 2");
        String expResult = "In pretium dictum lacimia. In retrum, neque a dignissim maximus, dolor mi pretium ante, nec volut justo dolor non nulla.";
        String result = Methods_Holder.FileTwo(fileName, file);
        assertEquals(expResult, result);
    }
    
}
