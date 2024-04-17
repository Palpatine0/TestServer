package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.service.TestService;
import org.example.vo.BaseResult;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    BaseResult baseResult = new BaseResult();
    @Override
    public BaseResult evaluationIntroduceTest() {

        String filePath = "src/main/java/org/example/jsonfiles/evaluationIntroduceTest.json";

        String jsonString = jsonToString(filePath);
        Map<String, Object> dataMap = jsonStringToMap(jsonString);
        baseResult.setData(dataMap);

        return baseResult;
    }

    @Override
    public BaseResult evaluationContentTest() {
        String filePath = "src/main/java/org/example/jsonfiles/evaluationContentTest.json";

        String jsonString = jsonToString(filePath);
        Map<String, Object> dataMap = jsonStringToMap(jsonString);
        baseResult.setData(dataMap);

        return baseResult;
    }

    @Override
    public BaseResult evaluationResultTest() {
        String filePath = "src/main/java/org/example/jsonfiles/evaluationResultTest.json";

        String jsonString = jsonToString(filePath);
        Map<String, Object> dataMap = jsonStringToMap(jsonString);
        baseResult.setData(dataMap);

        return baseResult;
    }


    // json processing
    public String jsonToString(String filePath){
        String jsonString="";
        try {
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            jsonString = new String(jsonData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public Map<String, Object> jsonStringToMap(String jsonString){
        Map<String, Object> dataMap = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            dataMap = objectMapper.readValue(jsonString, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}
