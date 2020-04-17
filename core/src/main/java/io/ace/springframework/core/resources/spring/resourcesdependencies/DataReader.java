package io.ace.springframework.core.resources.spring.resourcesdependencies;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DataReader {

    private Resource template;

    public Resource getTemplate() {
        return template;
    }

    public Map<String, String> getUserInfo() {
        Map<String, String> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.template.getInputStream()));) {
            String data = reader.readLine();;
            while (null != data) {
                String[] info = data.split(":");
                map.put(info[0], info[1]);
                data = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    public void setTemplate(Resource template) {
        this.template = template;
    }
}
