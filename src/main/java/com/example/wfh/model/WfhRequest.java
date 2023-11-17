package com.example.wfh.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("WFH_REQUEST")
public class WfhRequest {
    @Id
    private Integer id;
    @NotEmpty
    private String startDate;
    @NotEmpty
    private String endDate;
    @NotEmpty
    private String startTime;
    @NotEmpty
    private String endTime;
}
