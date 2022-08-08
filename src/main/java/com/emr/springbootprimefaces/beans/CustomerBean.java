package com.emr.springbootprimefaces.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Component
@ManagedBean
@RequestScoped
@Data
public class CustomerBean {
    @NotNull(message = "Name is required")
    private String firstname;
    @NotNull(message = "Lastname is required")
    private String lastname;
    @Email(message = "Wrong email format")
    private String email;
    private String phone;

}
