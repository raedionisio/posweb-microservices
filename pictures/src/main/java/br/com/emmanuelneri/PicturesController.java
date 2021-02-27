package br.com.emmanuelneri;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pictures")
public class PicturesController {

    private static final Map<Long, String> PICTURES = ImmutableMap.of(
            1L, "Picture 1",
            2L, "Picture 2",
            3L, "Picture 3",
            4L, "Picture 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(PICTURES.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return PICTURES.get(id);
    }

}

