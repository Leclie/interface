package com.ifmo.leclie.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date beginTask;     // когда нужно начать
    @Temporal(TemporalType.DATE)
    private Date endTask;       // когда нужно закончить
    @Temporal(TemporalType.DATE)
    private Date startTask;     // когда сотрудник начал
    @Temporal(TemporalType.DATE)
    private Date finishTask;    // когда сотрудник закончил

    private Boolean controlFlag; // метка о принятии задания

    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBeginTask() {
        return beginTask;
    }

    public void setBeginTask(Date beginTask) {
        this.beginTask = beginTask;
    }

    public Date getEndTask() {
        return endTask;
    }

    public void setEndTask(Date endTask) {
        this.endTask = endTask;
    }

    public Date getStartTask() {
        return startTask;
    }

    public void setStartTask(Date startTask) {
        this.startTask = startTask;
    }

    public Date getFinishTask() {
        return finishTask;
    }

    public void setFinishTask(Date finishTask) {
        this.finishTask = finishTask;
    }

    public Boolean getControlFlag() {
        return controlFlag;
    }

    public void setControlFlag(Boolean controlFlag) {
        this.controlFlag = controlFlag;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
