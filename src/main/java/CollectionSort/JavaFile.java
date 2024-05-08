//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//
//public class JavaFil {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("/Users/klimka1010/Desktop/боты/Intellij IDEA/SortingAlgorithms/UserData");
//        Scanner scanner = new Scanner(file);
//
//        List<Integer> list = new LinkedList<>();
//        if (scanner.hasNextLine()) {
//            list.add(scanner.nextInt());
//        } else {
//            System.out.println("Empty file!");
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//            if (i < list.size() - 1) {
//                System.out.print(", ");
//            }
//        }
//
//
//    }
//}
//
