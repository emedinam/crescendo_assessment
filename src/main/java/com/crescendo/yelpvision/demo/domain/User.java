package com.crescendo.yelpvision.demo.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "profile_url", "image_url", "name" })
public class User {

    @JsonProperty("id")
    private String id;

    @JsonProperty("profile_url")
    private String profile_url;

    @JsonProperty("image_url")
    private String image_url;

    @JsonProperty("name")
    private String name;

    @JsonProperty("feeling")
    private String feeling;
}