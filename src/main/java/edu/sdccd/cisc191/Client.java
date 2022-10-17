package cisc191.sdccd.edu;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws  Exception{
        // create socket and set IP address and port
        Socket socket = new Socket ("127.0.0.1", Server.PORT);
        // create outputStream to send data
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        // create new vehicle request object
        VehicleRequest request = new VehicleRequest();
        // send new requested object through outStream
        outStream.writeObject(request);
        // flush to clear memory
        outStream.flush();

        // create inputStream to receive data
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
        // create variable "response" to store data received form inStream
        VehicleResponse response = (VehicleResponse)inStream.readObject();
        // prints message with vehicle response info
        System.out.println(response.vehicle);

        // close outStream to prevent memory leak
        outStream.close();
        // close socket
        socket.close();
    }
}
