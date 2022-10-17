package cisc191.sdccd.edu;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // set listening port (2222)
    public static final int PORT = 2222;

    public static void main(String[] args) throws Exception {
        // create serverSocket to listen on listening port
        ServerSocket serverSocket = new ServerSocket(PORT);
        // create the connection
        Socket socket = serverSocket.accept();
        // create inStream to receive data
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
        // reads
        VehicleRequest request = (VehicleRequest)inStream.readObject();
        System.out.println(request.vehicle);
        // create outStream to send data
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        // create response with new data from request
        VehicleResponse response = new VehicleResponse(request, 5000,
                45000, 2, 2, new String[] {"CVT ):"});
        // output response
        outStream.writeObject(response);
        // flush to free up memory
        outStream.flush();
        // close socket to prevent memory leak
        serverSocket.close();

    }
}