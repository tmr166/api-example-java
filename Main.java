import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String [] args) {

/**
 * /getStoreDetails
 * Get Request: Returns all Stores with their address and phone number
 */
        // 1 - Create Client
        HttpClient clientStores = HttpClient.newHttpClient();

        // 2 - Build Request with headers
        HttpRequest requestStores = HttpRequest.newBuilder()
                .uri(URI.create("https://apimdev.wakefern.com/mockexample/V1/getStoreDetails"))
                .header("Ocp-Apim-Subscription-Key", "4ae9400a1eda4f14b3e7227f24b74b44")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            // 3 - Client sends request and saves the response in a variable
            HttpResponse responseStores = clientStores.send(requestStores, HttpResponse.BodyHandlers.ofString());

            // 4 - Print response in console
            System.out.println(responseStores.body());

            // 5 - Error Handling
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

/**
 * /getItemDetails
 * Get Request: Returns all items sold in a store with their base price and discount prices
 */

        // 1 - Create Client
        HttpClient clientItems = HttpClient.newHttpClient();

        // 2 - Build Request with headers
        HttpRequest requestItems = HttpRequest.newBuilder()
                .uri(URI.create("https://apimdev.wakefern.com/mockexample/V1/getItemDetails"))
                .header("Ocp-Apim-Subscription-Key", "4ae9400a1eda4f14b3e7227f24b74b44")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            // 3 - Client sends request and saves the response in a variable
            HttpResponse responseItems = clientItems.send(requestItems, HttpResponse.BodyHandlers.ofString());

            // 4 - Print response in console
            System.out.println(responseItems.body());

            // 5 - Error Handling
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}