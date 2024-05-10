package IOStreams.Classes.ClassFile;

import java.io.File;
import java.io.IOException;

public class ClassFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/IOStreams/Classes/ClassFile/User_data.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());



    }
}
