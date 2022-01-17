package e.network;

import java.io.*;
import java.net.*;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }
    public void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            while(true) {
                System.out.println("Server:Waiting for request.");
                client = server.accept();
                System.out.println("Server:Accepted.");
                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data: "+receivedData);
                in.close();
                stream.close();
                System.out.println("--------");
                startReplyServer("OK", server);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(server != null) {
                try {
                    server.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void startReplyServer(String data, ServerSocket server) {
        Socket client = null;
        try {
            client = server.accept();
            OutputStream os = client.getOutputStream();
            
            BufferedOutputStream out = new BufferedOutputStream(os);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            out.close();
            os.close();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
