package com.crescendo.yelpvision.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CrescendoControllerTest {

    @Autowired
    CrescendoController controller;
    @Test
    void controllerHappyPath() throws Exception{

        String bizId = "sZtL9wpVfP7K5sERd1gPbA";

        ResponseEntity<String> entity = controller.getReviewsByBBusinessId(bizId);

        assertNotNull(entity);
        assertEquals(HttpStatus.OK, entity.getStatusCode());

    }
}
