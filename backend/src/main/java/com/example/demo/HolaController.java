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




        Map<String, Object> oi1 = new LinkedHashMap<>();
        Map<String, Object> oi2 = new LinkedHashMap<>();
        ArrayList<Map<String, Object>> on = new ArrayList<>();
        Map<String, Object> in = new LinkedHashMap<>();
        Map<String, Object> rtn = new LinkedHashMap<>();


        oi1.put("id", "12");
        oi1.put("prov", "buenos Aires");
        oi2.put("id", "3");
        oi2.put("prov", "buenos Aires");
        on.add(oi1);
        on.add(oi2);
        in.put("toInspect", on);
        //in.put("test2", "test");
        rtn.put("data", in);
        rtn.put("status", "success");

        return rtn;

    }

}
