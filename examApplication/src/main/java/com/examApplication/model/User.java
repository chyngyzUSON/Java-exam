package com.examApplication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement(name = "user")
public class User {
    private Long id;
    private Date requestDateTime;
    private String name;
    private Date birthYear;
    private String gender;
}
