package com.example.wfh.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Table("WFH_REQUEST")
public class WfhRequest {

    @Id
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate fromDate;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate toDate;

    @JsonFormat(pattern = "hh:ss", shape = JsonFormat.Shape.STRING)
    private LocalTime fromTime;

    @JsonFormat(pattern = "hh:ss", shape = JsonFormat.Shape.STRING)
    private LocalTime toTime;

}
