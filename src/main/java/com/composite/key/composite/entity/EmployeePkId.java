package com.composite.key.composite.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode // it is compulsory when use @IdClass and @EmbeddedId
@Embeddable
public class EmployeePkId implements Serializable {

    private int employeeId;
    private int deptId;
}
