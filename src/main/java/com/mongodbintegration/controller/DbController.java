package com.mongodbintegration.controller;

import com.mongodbintegration.model.ModelData;
import com.mongodbintegration.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DbController {

    @Autowired
    DbService dbService;

    @GetMapping("/get/{id}")
    public ModelData getData(@PathVariable String id) {
        return dbService.getModelInfo(id);
    }

    @GetMapping("/get")
    public List<ModelData> getInfos() {
        return dbService.getModelInfos();
    }

    @GetMapping("/add-all")
    public void getData(@RequestParam List<ModelData> modelData) {
        dbService.saveModelInfos(modelData);
    }

    @GetMapping("/add")
    public void getData(@RequestParam ModelData modelData) {
        dbService.saveModel(modelData);
    }

}
