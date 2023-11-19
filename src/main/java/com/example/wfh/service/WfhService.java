package com.example.wfh.service;

import com.example.wfh.model.WfhRequest;
import com.example.wfh.repository.WfhRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class WfhService {

    private final WfhRepository wfhRepository;

    public WfhService(WfhRepository wfhRepository) {
        this.wfhRepository = wfhRepository;
    }

    public WfhRequest get(Integer id) {
        WfhRequest wfhRequest = wfhRepository.findById(id).orElse(null);
        if (wfhRequest == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return wfhRequest;
    }

    public WfhRequest put(WfhRequest wfhRequest) {
        // TODO: Implement below logic
        // deserialize value of type `java.time.LocalDate` from String "yyyy-MM-dd"
        // initialize start-date, end-date, start-time, end-time
        // if (start-date == end-date) and (start-time < end-time) and (end-time < LocalDateTime.now()):
        //     check if the wfhdb has the start-date
        //     if (start-date in wfhdb already):
        //         throw new ResponseStatusException(HttpStatus.CONFLICT);
        //     else:
        //         return wfhService.put(wfhRequest);
        // else:
        //     throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        // end-if
        return wfhRepository.save(wfhRequest);
    }

    public Iterable<WfhRequest> getAll() {
        return wfhRepository.findAll();
    }

    public void remove(Integer id) {
        wfhRepository.deleteById(id);
    }
}
