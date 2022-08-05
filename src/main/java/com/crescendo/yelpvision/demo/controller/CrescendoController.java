package com.crescendo.yelpvision.demo.controller;


import com.crescendo.yelpvision.demo.domain.Review;
import com.crescendo.yelpvision.demo.service.GVisionFaceService;
import com.crescendo.yelpvision.demo.service.YelpReviewService;
import com.crescendo.yelpvision.demo.util.Constant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constant.BASEPATH)
public class CrescendoController {

    @Autowired
    YelpReviewService yelpReviewService;
    GVisionFaceService visionFaceService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();


    @GetMapping("/{biz_id}/reviews")
    public ResponseEntity<String> getReviewsByBBusinessId(@PathVariable("biz_id") String bizId ) throws Exception{

        //Favorite Restaurant Id : MGd6HFEq1ALD58XWNviSXw
        var reviews = yelpReviewService.getReviewByBussinessId(bizId);
        var objectResponse = gson.toJson(reviews);
        return new ResponseEntity<>(objectResponse, HttpStatus.OK);
    }


    @GetMapping("/first_business")
    public ResponseEntity<String> getBusinessId() throws Exception{

        //Get the Id
        String bizId = yelpReviewService.findFirstBusinessIdByQuery();

        return new ResponseEntity<>(bizId, HttpStatus.OK);
    }
}
