import org.glassfish.tyrus.server.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WebSocketServer {

    public static void main(String[] args) {
        runServer();
    }

    public static void runServer() {
        Server server = new Server("localhost", 8080, "", WSServer.class);
        try {
            server.start();
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("Please enter \"stop\" to stop the server.");
                if(scanner.next().equalsIgnoreCase("stop"))
                    break;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            server.stop();
        }
    }

}
