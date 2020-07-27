package com.example.demo997.pratice;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: demo997
 * @description: 常用操作
 * @author: Ma
 * @create: 2020-07-26 20:25
 **/
public class CollectionsPratice {
     ArrayList<String> list = new ArrayList(Arrays.asList("Tom", "Jerry", "Mike"));

    public static void main(String[] args) {
        Map map = Stream.of(1,2,3,4).collect(Collectors.toMap(o -> o, integer -> integer,(o, o2) -> o2, HashMap::new));
        System.out.println(JSONObject.toJSONString(map));
        map.forEach((k,v)->System.out.println("key : " + k + "; value : " + v));

        List list = Stream.of(1,2,3,4).collect(Collectors.toList());
        list.forEach(item-> System.out.println(item));
        System.out.println(JSONObject.toJSONString(list));

    }
}
