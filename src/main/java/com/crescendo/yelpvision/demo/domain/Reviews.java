package com.crescendo.yelpvision.demo.domain;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "reviews", "total", "possible_languages" })

public class Reviews {

    @JsonProperty("reviews")
    private List<Review> reviews = null;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("possible_languages")
    private List<String> possibleLanguages = null;
}
