package ru.britishdesign.rm.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "schools")

public class School {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description_date", nullable = false, length = 500)
    private String descriptionDate;

    @Column(name = "foto", nullable = false, length = 500)
    private String foto;

    public School() {
    }

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

    public String getDescriptionDate() {
        return descriptionDate;
    }

    public void setDescriptionDate(String descriptionDate) {
        this.descriptionDate = descriptionDate;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
