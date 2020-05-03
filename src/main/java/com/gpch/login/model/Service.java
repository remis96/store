package com.gpch.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private Long id;
    @Column(name = "service_name")
    @Length(min = 1, message = "*Your service name must have at least 1 character")
    @NotEmpty(message = "*Please provide a user name")
    private String serviceName;
    @Column(name = "price")
    @NotEmpty(message = "*Please provide price")
    private Float price;
}