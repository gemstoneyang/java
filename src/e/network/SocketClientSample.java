package e.network;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }
    public void sendSocketSample() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            if (!("EXIT".equals(data))) {
                sendSocketData(data + "    at "+new Date());
                sendAndReceiveSocketData();
            } else {
                sendSocketData(data);
                System.out.println("Stop SocketClient");
                break;
            }
        }
        
    }
    public void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client:Connecting");
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("Client:Connect status="+socket.isConnected());
            Thread.sleep(1000);
            
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void sendAndReceiveSocketData() {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
            Thread.sleep(1000);
            
            byte[] readByte = new byte[256];
            InputStream is = socket.getInputStream();
            BufferedInputStream in = new BufferedInputStream(is);
            
            in.read(readByte);
            System.out.println("Client:received data="+new String(readByte).trim());
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
