package com.crescendo.yelpvision.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Business {
    @JsonProperty("rating")
    private double rating;
    @JsonProperty("price")
    private String price;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("id")
    private String id;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("is_closed")
    private boolean is_closed;
    @JsonProperty("categories")
    private ArrayList<Category> categories;
    @JsonProperty("review_count")
    private int review_count;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("coordinates")
    private Coordinates coordinates;
    @JsonProperty("image_url")
    private String image_url;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("distance")
    private double distance;
    @JsonProperty("transactions")
    private ArrayList<String> transactions;

}

