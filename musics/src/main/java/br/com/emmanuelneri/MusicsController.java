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
@RequestMapping("/musics")
public class MusicsController {

    private static final Map<Long, String> MUSICS = ImmutableMap.of(
            1L, "Music 1",
            2L, "Music 2",
            3L, "Music 3",
            4L, "Music 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(MUSICS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return MUSICS.get(id);
    }

}
