package com.example.wfh.controller;

import com.example.wfh.model.WfhRequest;
import com.example.wfh.service.WfhService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class WfhController {

    private final WfhService wfhService;

    public WfhController(WfhService wfhService) {
        this.wfhService = wfhService;
    }

    @GetMapping(path = "/all_requests")
    public Iterable<WfhRequest> getAllRequests() {
        return wfhService.getAll();
    }

    @GetMapping(path = "/search/{id}")
    public WfhRequest getRequest(@PathVariable Integer id) {
        return wfhService.get(id);
    }

    @GetMapping(path = "/delete/{id}")
    public void deleteRequest(@PathVariable Integer id) {
        wfhService.remove(id);
    }

    @PostMapping(path = "/add_request")
    @ResponseBody
    public WfhRequest addRequest(@RequestBody @Valid WfhRequest wfhRequest) {
        return wfhService.put(wfhRequest);
    }

}
