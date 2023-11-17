package com.example.wfh.controller;

import com.example.wfh.model.WfhRequest;
import com.example.wfh.service.WfhService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class WfhController {

    private final WfhService wfhService;

    public WfhController(WfhService wfhService) {
        this.wfhService = wfhService;
    }

    @GetMapping(path = "/all_requests")
    public Iterable<WfhRequest> getRequests() {
        return wfhService.getAll();
    }

    @GetMapping(path = "/request/{id}")
    public WfhRequest getRequest(@PathVariable Integer id) {
        return wfhService.get(id);
    }

    @PostMapping(path = "/add_request")
    @ResponseBody
    public WfhRequest addRequest(@RequestBody @Valid WfhRequest wfhRequest) {
        return wfhService.put(wfhRequest);
    }
}
