package com.crescendo.yelpvision.demo.service;


import com.crescendo.yelpvision.demo.domain.Businessess;
import com.crescendo.yelpvision.demo.domain.Review;
import com.crescendo.yelpvision.demo.domain.Reviews;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

@Service
public class YelpReviewService {

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public String findFirstBusinessIdByQuery() throws Exception {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.yelp.com/v3/businesses/search?term=food&location=FL"))
                .header("Authorization",
                        "Bearer gKSVUrotnxfwKFhM19gecO6T-jWSfChodRJttv3nPQeRqfnb3Jd3Q6q1etLDcVqg8I4vdGzLzxBnEWvPtiMpvBVM7zykGCwsLk7jPraqjWne94B9_sVfW5M7AuvqYnYx")
                .GET()
                .build();
        var response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        var jsonResponse = response.body();
         if(response.statusCode() != 200) {

             throw new Exception(jsonResponse);
         } else {
             var businessID = gson
                     .fromJson(jsonResponse, Businessess.class);
             return businessID.getBusinesses().stream().findFirst().get().getId();
         }

    }

    public Reviews getReviewByBussinessId(String businessID) throws Exception {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.yelp.com/v3/businesses/" + businessID + "/reviews"))
                .header("Authorization",
                        "Bearer gKSVUrotnxfwKFhM19gecO6T-jWSfChodRJttv3nPQeRqfnb3Jd3Q6q1etLDcVqg8I4vdGzLzxBnEWvPtiMpvBVM7zykGCwsLk7jPraqjWne94B9_sVfW5M7AuvqYnYx")
                .GET()
                .build();
        var response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        var jsonResponse = response.body();
        if(response.statusCode() != 200) {
            throw new Exception(jsonResponse);
        } else {
            var reviews = gson
                            .fromJson(jsonResponse, Reviews.class);
            return reviews;
        }

    }
}
