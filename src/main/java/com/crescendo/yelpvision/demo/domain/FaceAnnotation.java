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
public class FaceAnnotation{
    @JsonProperty("boundingPoly")
    private BoundingPoly boundingPoly;
    @JsonProperty("fdBoundingPoly")
    private FdBoundingPoly fdBoundingPoly;
    @JsonProperty("landmarks")
    private ArrayList<Landmark> landmarks;
    @JsonProperty("rollAngle")
    private double rollAngle;
    @JsonProperty("panAngle")
    private double panAngle;
    @JsonProperty("tiltAngle")
    private double tiltAngle;
    @JsonProperty("detectionConfidence")
    private double detectionConfidence;
    @JsonProperty("landmarkingConfidence")
    private double landmarkingConfidence;
    @JsonProperty("joyLikelihood")
    private String joyLikelihood;
    @JsonProperty("sorrowLikelihood")
    private String sorrowLikelihood;
    @JsonProperty("angerLikelihood")
    private String angerLikelihood;
    @JsonProperty("surpriseLikelihood")
    private String surpriseLikelihood;
    @JsonProperty("underExposedLikelihood")
    private String underExposedLikelihood;
    @JsonProperty("blurredLikelihood")
    private String blurredLikelihood;
    @JsonProperty("headwearLikelihood")
    private String headwearLikelihood;
}