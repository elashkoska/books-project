package com.example.demo.objects;

import com.example.demo.service.RestService;
import org.junit.jupiter.api.Test;

class GetObjectsTest {

    RestService restService = new RestService();


    @Test
    void checkObjects() {
        restService.getResponse();
    }

    @Test
    void getObjectsSpecs() {
        restService.getObjects();
    }


}
