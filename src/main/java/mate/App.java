package mate;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            java.awt.Desktop.getDesktop()
                    .browse(java.net.URI.create("http://localhost:8080/index"));
        } catch (IOException e) {
            throw new RuntimeException("Can`t open web link. Check connection to server " + e);
        }
    }
}
