package com.example.orange.Entities;

import com.example.orange.DTO.AdminDTO;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @SequenceGenerator(
            name = "admin_generator",
            sequenceName = "admin_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "admin_generator"
    )
    @Id
    private int userName;
    private String phoneNumber;
    private String email;

    public Admin(AdminDTO adminDTO) {
        this.phoneNumber = adminDTO.getPhoneNumber();
        this.userName = adminDTO.getUserName();
        this.email= adminDTO.getEmail();
    }

}
