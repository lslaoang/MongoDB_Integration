package com.mongodbintegration.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ModelData {

    @Id
    private String id;
    private String name;
    private String description;
}
