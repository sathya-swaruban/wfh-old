package com.example.wfh.controller;

import com.example.wfh.model.WfhRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

@RestController
public class WfhController {

    private final HashMap<String, WfhRequest> map = new HashMap<>() {
        {
            put("1", new WfhRequest("1", "15-Nov-2023", "15-Nov-2023", "09:00", "18:15"));
            put("2", new WfhRequest("2", "16-Nov-2023", "16-Nov-2023", "08:00", "15:15"));
        }
    };

    @GetMapping(path = "/all_requests")
    private Collection<WfhRequest> getRequests() {
        return map.values();
    }

    //@RequestMapping(path = "/add_request", method = {RequestMethod.POST, RequestMethod.GET})
    @PostMapping(path = "/add_request")
    @ResponseBody
    public WfhRequest addRequest(@RequestBody @Valid WfhRequest request) {
        request.setRequestId(UUID.randomUUID().toString());
        map.put(request.getRequestId(), request);
        return request;
    }
}
