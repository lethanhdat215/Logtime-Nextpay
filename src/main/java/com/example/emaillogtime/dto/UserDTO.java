package com.example.emaillogtime.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    @NotBlank(message = "username khong duoc de trong,co chua khoang trang")
    @Email(message = "email khong hop le")
    private String mail;
}
