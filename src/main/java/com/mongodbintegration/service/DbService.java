package com.mongodbintegration.service;

import com.mongodbintegration.model.ModelData;
import com.mongodbintegration.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    DbRepository dbRepository;

    public void saveModelInfos(List<ModelData> modelInfos) {
        dbRepository.saveAll(modelInfos);
    }

    public void saveModel(ModelData modelInfo) {
        dbRepository.save(modelInfo);
    }

    public List<ModelData> getModelInfos() {
        return dbRepository.findAll();
    }
    public List<ModelData> getModelInfos(List<String> ids) {
        return dbRepository.findAllById(ids);
    }

    public ModelData getModelInfo(String id) {
        return dbRepository.findById(id).orElse(null);
    }
}
