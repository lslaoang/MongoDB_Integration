package com.mongodbintegration.init;

import com.mongodbintegration.model.ModelData;
import com.mongodbintegration.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private DbRepository dbRepository;

    @Override
    public void run(String... args) throws Exception {

        ModelData modelData1 = new ModelData();
        modelData1.setId("1");
        modelData1.setName("Juan");
        modelData1.setDescription("Unang Tao");

        ModelData modelData2 = new ModelData();
        modelData2.setId("2");
        modelData2.setName("Dos");
        modelData2.setDescription("Pangalawang Tao");

        ModelData modelData3 = new ModelData();
        modelData3.setId("3");
        modelData3.setName("Tris");
        modelData3.setDescription("Pangatlong Tao");

        dbRepository.saveAll(List.of(modelData1, modelData2, modelData3));
    }
}
