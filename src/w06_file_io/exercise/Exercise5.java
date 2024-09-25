package w06_file_io.exercise;

import java.io.File;
import java.nio.file.FileSystems;

public class Exercise5 {
    static void RecursivePrint(File[] arr, int index, int level) {
        // Terminate condition
        if (index == arr.length) {
            return;
        }

        // Tabs for internal levels
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        // For files
        if (arr[index].isFile()) {
            System.out.println(arr[index].getName());
        } else if (arr[index].isDirectory()) {
            // For sub-directories
            System.out.println("[" + arr[index].getName() + "]");

            // Recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }

        // Recursion for main directory
        RecursivePrint(arr, ++index, level);
    }

    // Driver Method
    public static void main(String[] args) {
        // Provide full path for directory(change accordingly)
        String mainDirPath
                = FileSystems.getDefault()
                .getPath("")
                .toAbsolutePath()
                .toString();

        // File object
        File mainDir = new File(mainDirPath);

        if (mainDir.exists() && mainDir.isDirectory()) {
            // Array for files and sub-directories of directory pointed by maindir
            File[] arr = mainDir.listFiles();

            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + mainDir);
            System.out.println("**********************************************");

            // Calling recursive method
            RecursivePrint(arr, 0, 0);
        }
    }
}
