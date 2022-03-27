package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HolaController {

    @GetMapping("/get")
    @ResponseBody
    public Map<String, Object> endPointExample() {

        Map<String, Object> rtn = new LinkedHashMap<>();
        Map<String, Object> in = new LinkedHashMap<>();
        ArrayList<String> on = new ArrayList<>();
        on.add("hola");
        on.add("chau");

        in.put("test1", "test");
        in.put("test2", "test");
        rtn.put("items", on);
        rtn.put("status", "success");

        return rtn;

    }

}
