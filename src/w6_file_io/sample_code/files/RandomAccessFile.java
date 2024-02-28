package w6_file_io.sample_code.files;

import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) throws IOException {
        // We use .dat to indicate this is not a text file (naming convention only)
        try (java.io.RandomAccessFile rafile = new java.io.RandomAccessFile("./src/w6_file_io/sample_code/random.dat", "rw")) {
            final int[] SOME_INTS = new int[] { 1, 2, 3 };
            for (int num : SOME_INTS) {
                rafile.writeInt(num); // Each int occupies Integer.BYTES in the file
            }

            // Reading and updating values (using Integer.BYTES for positioning)
            // Move from end of file (current position) to start of previous integer
            rafile.seek(rafile.getFilePointer() - Integer.BYTES);
            // Read and update the value (+TEST_INCREMENT)
            final int ARBITRARY_INCREMENT = 20;
            int last = rafile.readInt() + ARBITRARY_INCREMENT;
            // Move back and overwrite last value
            rafile.seek(rafile.getFilePointer() - Integer.BYTES);
            rafile.writeInt(last);

            // Back to the start of the file to print all
            rafile.seek(0);
            for (int i = 0; i < SOME_INTS.length; i++) {
                System.out.println(rafile.readInt());
            }
        }
        // Throw exceptions to console .. maybe you didn't know you could do a try without a catch ;)
    }
}
