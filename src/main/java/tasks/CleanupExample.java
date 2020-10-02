package tasks;

import lombok.Cleanup;

import java.io.*;

public class CleanupExample {
    public static void run() throws IOException {
        @Cleanup InputStream in = new FileInputStream("fileFrom.txt");
        @Cleanup OutputStream out = new FileOutputStream("fileTo.txt");

        byte[] buffer = new byte[1024];

        while (true) {
            if (in.read(buffer) == -1) break;
            out.write(buffer);
        }
    }
}
