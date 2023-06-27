package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class User {


    private static long nextId = 1;
    private String name;
    private long id = nextId++;







}
