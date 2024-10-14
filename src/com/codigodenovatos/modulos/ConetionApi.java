package com.codigodenovatos.modulos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConetionApi {
    private final String keyApi = "795686d96ba2385f1e3bee75";

    public ConsultModel convertMoney (double valorConvertir, String money1, String money2) {
        URI adress = URI.create("https://v6.exchangerate-api.com/v6/" + keyApi + "/pair/" + money1 + "/" + money2 + "/" + valorConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConsultModel.class);
        } catch (Exception e) {
            throw new RuntimeException("No concide con las monedas");
        }
    }

}
