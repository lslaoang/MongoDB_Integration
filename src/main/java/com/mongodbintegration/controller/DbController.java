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

    @PostMapping("/add-all")
    public void getData(@RequestBody List<ModelData> modelData) {
        dbService.saveModelInfos(modelData);
    }

    @PostMapping("/add")
    public void getData(@RequestBody ModelData modelData) {
        dbService.saveModel(modelData);
    }

}
