package java8;
import java.util.Base64;
//Before Java 8:
//Java had no built-in Base64 support
//Developers used external libraries like:
//Apache Commons Codec
//Sun internal classes (not recommended)
//java.util.Base64
//This allows encoding/decoding without external libraries.
//🔹 Why Base64 Is Needed
//To safely transmit binary data over text-based systems like:
//HTTP
//JSON
//XML
//Email
//REST APIs
//It converts binary → text.
public class base64Changes {
    public static void main(String[] args) {
        //Encode
        String data = "Rishav";
        String encoded = Base64.getEncoder()
                        .encodeToString(data.getBytes());
        System.out.println(encoded);
        //Decode
        byte[] decoded = Base64.getDecoder()
                        .decode(encoded);

        System.out.println(new String(decoded));

    }
}
