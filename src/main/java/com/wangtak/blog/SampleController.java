package com.wangtak.blog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        return "ROLE: USER, MSG: HELLO";
    }

    @GetMapping("/anyone")
    public String anyone() {
        return "HELLO anyone";
    }

    @PostMapping("/anyone")
    public GroupRequest anyone(@RequestBody GroupRequest groupRequest) {
        return groupRequest;
    }

    @Setter
    @Getter
    @NoArgsConstructor
    private static class GroupRequest {
        private String groupName;
        private List<String> members;
    }
}
