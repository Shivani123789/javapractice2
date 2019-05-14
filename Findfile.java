//import java.io.File;
//public class Findfile {
//
//    public static void main(String args[]) {
//        File file = new File("/home/shivani/IdeaProjects/assignment2/src/my-files");
//        File[] filearray = file.listFiles();
//        for (File f : filearray) {
//            System.out.println(f);
//        }
//    }
//;

import java.io.File;
import java.io.FilenameFilter;

public class Findfile {

    public static void main(String a[]){
        File file = new File("/home/shivani/IdeaProjects/assignment2/src/my-files");
        File[] filearray = file.listFiles();
      for (File f : filearray) {
          //f.getName() instead of f in sopln will print only name of files
           System.out.println(f);        }
        String[] files = file.list(new FilenameFilter() {


            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}