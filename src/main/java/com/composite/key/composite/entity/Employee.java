package com.composite.key.composite.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@IdClass(EmployeePkId.class)
public class Employee {
//    @Id
//    private int employeeId;
//    @Id
//    private int deptId;
    @EmbeddedId
    private EmployeePkId employeePkId; // for @Embedded approach

    private String name;
    private String email;
    private String phone;
}
// now we will see @EmbeddedId and @Embeddedable after @Id