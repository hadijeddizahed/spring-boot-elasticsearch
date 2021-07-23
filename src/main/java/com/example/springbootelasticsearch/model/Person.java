package com.example.springbootelasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "persons")
public class Person {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String family;
    @Field
    private String email;

    public Person() {
    }

    public Person(String id, String name, String family, String email) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
