package Serialisation;

import java.io.*;
import java.nio.file.Path;

public class SerialisationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("User_Data.txt");
        writeObject(path);
        readObject(path);


    }

    public static void writeObject(Path path) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person(1, "Klim", "Kutasov");
            objectOutputStream.writeObject(person);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}