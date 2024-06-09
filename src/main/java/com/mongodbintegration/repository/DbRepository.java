package com.mongodbintegration.repository;

import com.mongodbintegration.model.ModelData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DbRepository extends MongoRepository<ModelData, String> {
}
