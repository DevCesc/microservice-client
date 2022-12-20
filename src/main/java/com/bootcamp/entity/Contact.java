package com.bootcamp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Contact {
    private String email;
    private String telephone;
    private String address;
    private String department;
    private String province;
    private String district;
}
