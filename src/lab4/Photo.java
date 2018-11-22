package lab4;

import java.io.PrintStream;

public class Photo {
    private String url;

    Photo (String url) {
        this.url = url;
    }

    void writeHTML (PrintStream out) {
        out.printf("<img src=\"%s\" alt=\"Photo\" height=\"503\" width=\"397\"/>\n",url);
    }
}
