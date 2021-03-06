package com.basic.spring.basicspring.filtering;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean() {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");

        FilterProvider filters = this.getMappedValue("filed3", "filed2");
        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue retrieveListOfSomeBean() {
        List<SomeBean> list = Arrays.asList(new SomeBean("first", "second", "third"),
                new SomeBean("value1", "value2", "value3"));

        FilterProvider filters = this.getMappedValue("filed2");
        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return mapping;
    }

    private FilterProvider getMappedValue(String... args) {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(args);

        return new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

    }
}
