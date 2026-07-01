package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        String url = "https://jsonplaceholder.typicode.com/todos/1";
        Request req = new Request.Builder()
                .url(url)
                .build();

        try (Response res = client.newCall(req).execute()) {
              if (!res.isSuccessful())
                  System.out.println("Something went wrong");

            System.out.println(res.body().string());
        }
        catch (IOException ex) {
           ex.printStackTrace();
        }

    }
}
