package com.ulises.app.rest.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "TasksCrud")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Avisa que el id se va autoincrementado
    private long id;
    @Column //crea columna para el titulo
    private String title;
    @Column //crea columna para la drescripcion
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
