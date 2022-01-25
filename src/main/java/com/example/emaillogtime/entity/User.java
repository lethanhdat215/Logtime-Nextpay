package com.example.emaillogtime.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private String userId;
    @NotBlank(message = "username khong duoc de trong,co chua khoang trang")
    @Email(message = "email khong hop le")
    @Column(name = "mail_notification")
    private String mail;

    @OneToMany(mappedBy = "user")
    private Set<EntriesTime> entriesTimeSet;

//    @Transient
//    private float sum = 44;
//    @Transient
//    private float gioThieu = sum - ((getLogTime() * 5) +4);

}
