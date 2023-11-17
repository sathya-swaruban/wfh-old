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
        WfhRequest wfhRequest = wfhService.get(id);
        if (wfhRequest == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return wfhRequest;
    }

    @PostMapping(path = "/add_request")
    @ResponseBody
    public WfhRequest addRequest(@RequestBody @Valid WfhRequest wfhRequest) {
        // TODO: Implement below logic
        // initialize start-date, end-date, start-time, end-time
        // if (start-date == end-date) and (start-time < end-time):
        //     check if the wfhdb has the start-date
        //     if (start-date in wfhdb already):
        //         throw new ResponseStatusException(HttpStatus.CONFLICT);
        //     else:
        //         return wfhService.put(wfhRequest);
        // else:
        //     throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        // end-if
        return wfhService.put(wfhRequest);
    }
}
