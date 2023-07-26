package com.example.demo;

import java.math.BigDecimal;


import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Document(collection ="StudentMongoDB")
public class StudentMongoDB {

@Id
private String id;
private String firstName;
private String lastName;



}
