package com.example.wfh.service;

import com.example.wfh.model.WfhRequest;
import com.example.wfh.repository.WfhRepository;
import org.springframework.stereotype.Service;

@Service
public class WfhService {

    private final WfhRepository wfhRepository;

    public WfhService(WfhRepository wfhRepository) {
        this.wfhRepository = wfhRepository;
    }

//    private final HashMap<Integer, WfhRequest> map = new HashMap<>() {
//        {
//            put(1, new WfhRequest(1, "15-Nov-2023", "15-Nov-2023", "09:00", "18:15"));
//            put(2, new WfhRequest(2, "16-Nov-2023", "16-Nov-2023", "08:00", "15:15"));
//        }
//    };

    public WfhRequest get(Integer id) {
        return wfhRepository.findById(id).orElse(null);
    }

    public WfhRequest put(WfhRequest wfhRequest) {
        return wfhRepository.save(wfhRequest);
    }

    public Iterable<WfhRequest> getAll() {
        return wfhRepository.findAll();
    }
}
