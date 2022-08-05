package com.crescendo.yelpvision.demo.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "rating", "user", "text", "time_created", "url" })
public class Review {

    @JsonProperty("id")
    private String id;
    @JsonProperty("rating")
    private int rating ;
    @JsonProperty("user")
    private User user;
    @JsonProperty("text")
    private String text;
    @JsonProperty("time_created")
    private String timeCreated;
    @JsonProperty("url")
    private String url;

}
