package com.crescendo.yelpvision.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Businessess {

    @JsonProperty("total")
    public int total;
    @JsonProperty("businesses")
    public ArrayList<Business> businesses;
    @JsonProperty("region")
    public Region region;



}