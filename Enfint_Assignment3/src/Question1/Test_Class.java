
package Question1;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class Test_Class 
{
    public static File file;
    public static String foundFiles[];
    public static ArrayList<String> sortedFiles;
    public static ArrayList<String> folder2Files;
    public static ArrayList<String> sortedFolders;
    public static String folder2;
    
    public static void main(String[] args)
    {
        
        Scanner scan= new Scanner(System.in);
        String path="", outputName;
       while(true)
       {
           try
           {
               System.out.print("Enter path to the root directory: ");
               path=scan.nextLine();
               
               file=new File(path);
               if(Methods_Holder.CheckRoot(file)!=true)
               {
                 System.out.println("Path does not exit");
                 System.out.print("Enter path to the root directory: ");
                 path=scan.nextLine();
               }
               
               System.out.println("Directory Exit");
               System.out.print("Enter name of the output file: ");
               outputName=scan.nextLine();
               
               file= new File(outputName+".txt"); 
               if(Methods_Holder.CheckOutputFile(file)==true)
               {
                   file.delete();
                   file= new File(outputName+".txt");
                   file.createNewFile();
               }
              else
              {
                  file= new File(outputName+".txt");
                  file.createNewFile(); 
              }
               
               file=new File(path);
               sortedFiles=new ArrayList<>();
               sortedFolders=new ArrayList<>();
               if(Methods_Holder.CheckRootFiles(file)>0)
               {
                  foundFiles=file.list();
                  //sorting txt files to the list
                  for(String i: foundFiles)
                  {
                     if(i.contains(".txt"))
                     {
                      sortedFiles.add(i);
                     }
                  }
                  
                  //System.out.println(Methods_Holder.RootInputDataFiles(sortedFiles,path));
                  
                  //sorting folders to their list
                  for(String i: foundFiles)
                  {
                     if(!i.contains(".txt")&& file.isDirectory())
                     {
                      sortedFolders.add(i);
                     }
                  }
                                  
                  //get the inside folder name
                  for(String i: sortedFolders)
                  {
                   folder2=i;    
                  }
                  
                 //concatinating folder 2 name to existing path
                 file=new File(path+"/"+folder2);
                 //check wheather inner folder is empty
                 if(Methods_Holder.CheckRootFiles(file)>0)
                 {
                  //add everything that is found fo array
                  foundFiles=file.list();
                  //sorting txt files to the list
                  folder2Files=new ArrayList<>();
                  for(String i: foundFiles)
                  {
                     if(i.contains(".txt"))
                     {
                      folder2Files.add(i);
                     }
                  }
                 }
                  Methods_Holder.Concatenate(folder2Files.get(0),folder2Files.get(1),file,sortedFiles.get(0),path);
                  
               }

               break;
           }
           catch(Exception ex)
           {
               System.out.println("Error:"+ex.toString());
               continue;
           }
       }
    }
    
}
