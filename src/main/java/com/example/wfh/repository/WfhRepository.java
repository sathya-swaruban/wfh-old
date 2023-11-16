package com.example.wfh.repository;

import com.example.wfh.model.WfhRequest;
import org.springframework.data.repository.CrudRepository;

public interface WfhRepository extends CrudRepository<WfhRequest, String> {
}
