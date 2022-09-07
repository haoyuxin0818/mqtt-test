package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String alarm;
    private String level;
    private int confidence;
}
