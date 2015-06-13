package Second;
import java.io.*;


public class File {

    private static final String FILE_NAME = "out.txt";
    private static final String NEW_LINE = "\r\n";
    public static final Out out = new Out();

    public static class Out {
        private Writer fileOut;

        private Out() {
            try {
                new java.io.File(FILE_NAME).createNewFile();
                fileOut = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(FILE_NAME), "UTF-8"));
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException("Destination file was not reached", ex);
            }
        }

        private void write(Object o) {
            try {
                fileOut.write(String.valueOf(o));
                fileOut.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void println(Object o) {
            this.write(o);
            this.write(NEW_LINE);
        }

        public void print(Object o) {
            this.write(o);
        }

    }

}

