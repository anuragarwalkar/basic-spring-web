package com.basic.spring.basicspring.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean() {
        return new SomeBean("value1", "value2", "value3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveListOfSomeBean() {
        return Arrays.asList(new SomeBean("first", "second", "third"), new SomeBean("value1", "value2", "value3"));
    }
}
