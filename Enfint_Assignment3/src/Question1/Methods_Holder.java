
package Question1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Methods_Holder 
{   
    public static boolean CheckRoot(File file) 
    {
        boolean flag=false;
        if(file.exists() || file.isDirectory())
        {
            flag=true;
        }
        else
        {
            return flag;
        }
        return flag;
    }

    public static boolean CheckOutputFile(File file) 
    {
        boolean flag=false;
        if(file.exists() || file.isFile())
        {
           flag=true; 
        }
        else
        {
            return flag;
        }
        return flag;
    }

    public static int CheckRootFiles(File file) 
    {   
     return file.list().length;
    }

    public static void Concatenate(String fileOne,String fileTwo,File file,String sortedFiles, String path) throws IOException 
    {
        //let's store file one from inside folder 2 which does not depend on any other file
        String One=FileOne(fileOne,file);
        
        //this variable hold store file data that is found inside root folder
        String hold=RootInputDataFiles(sortedFiles,path);
        String newParagraph="";
        if(hold.contains("*require 'Folder 1/Folder 2/File 2.1'*"))
        {
          newParagraph=hold.replace("*require 'Folder 1/Folder 2/File 2.1'*", One);
        }
        
        FileWriter f= new FileWriter("output.txt", true);
        try (BufferedWriter write = new BufferedWriter(f)) 
        {
            write.write(One);
            write.write(newParagraph);
            write.write(FileTwo(fileTwo,file));
        }

    }

    public static String RootInputDataFiles(String fileName,String path) throws FileNotFoundException, IOException 
    {
        BufferedReader read=null;
        String line="";
        String holder="";
        try
        {
         
          
          //for(String i: sortedFiles)
          //{
           read= new BufferedReader(new FileReader(path+"/"+fileName)); 
           while((line=read.readLine())!=null)
           {
            holder+=line;
           }
          //}
         
        }
        catch(IOException ex)
        {
          System.out.println(ex.toString());  
        }
        finally
        {
            if(read!=null)
            {
              read.close();
            }
        }
       return holder;
    }

    public static String FileOne(String fileName, File file) throws FileNotFoundException, IOException 
    {
        BufferedReader read=null;
        String line="";
        String holder="";
        
        try
        {
           read= new BufferedReader(new FileReader(file+"/"+fileName)); 
           while((line=read.readLine())!=null)
           {
            holder+=line;
           }
         
        }
        catch(IOException ex)
        {
          System.out.println(ex.toString());  
        }
        finally
        {
            if(read!=null)
            {
              read.close();
            }
        } 
     return holder;
    }

   public static String FileTwo(String fileName, File file) throws FileNotFoundException, IOException
   {
       BufferedReader read=null;
       String line="";
       String holder="";
       
       try
        {
           read= new BufferedReader(new FileReader(file+"/"+fileName)); 
           while((line=read.readLine())!=null)
           {
            holder+=line;
           }
         
        }
        catch(IOException ex)
        {
          System.out.println(ex.toString());  
        }
        finally
        {
            if(read!=null)
            {
              read.close();
            }
        } 
     return holder;
   }
    
    
}
