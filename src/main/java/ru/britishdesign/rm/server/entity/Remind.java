package ru.britishdesign.rm.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "remind")

public class Remind {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "start_event", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startEvent;

    @Column(name = "end_event", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endEvent;

    @Column(name = "remind_detail", nullable = false, length = 200)
    private String remindDetail;

    @Column(name = "color", nullable = false, length = 6)
    private String color;

    public Remind() {
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

    public Date getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(Date startEvent) {
        this.startEvent = startEvent;
    }

    public Date getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(Date endEvent) {
        this.endEvent = endEvent;
    }

    public String getRemindDetail() {
        return remindDetail;
    }

    public void setRemindDetail(String remindDetail) {
        this.remindDetail = remindDetail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
