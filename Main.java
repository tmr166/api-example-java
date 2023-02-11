import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String [] args) {

        /** getStoreDetails and getItemDetails URL for demo*/
        String getStoreDetailsURL = "https://apimdev.wakefern.com/mockexample/V1/getStoreDetails";
        String getItemDetailsURL = "https://apimdev.wakefern.com/mockexample/V1/getItemDetails";

/**
 * Get Request Template
 */
        // 1 - Create Client
        HttpClient clientStores = HttpClient.newHttpClient();

        // 2 - Build Request with headers
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(/** Set URL Here */))
                .header("Ocp-Apim-Subscription-Key", "4ae9400a1eda4f14b3e7227f24b74b44")      //Set Other Headers
                .method(/**Set Method Here */, HttpRequest.BodyPublishers.noBody())
                .build();


        // 3 - Client sends request and saves the response in a variable
        try {
            HttpResponse response = clientStores.send(/** Add request here */, HttpResponse.BodyHandlers.ofString());

            // 4 - Print response in console
            /** Print Response Here */

            // 5 - Error Handling
            /**
             * Error Handling Conventions:
             * Errors are generally saved in a separate log file to be accessed in the future
             * In production, code generally should not print anything on the console
             * Console logging is okay for development/debugging purposes
             */
        } catch (IOException e) {
           /** Set Error Handling Here */
        } catch (InterruptedException e) {
            /** Set Error Handling Here */
        }

    }

}