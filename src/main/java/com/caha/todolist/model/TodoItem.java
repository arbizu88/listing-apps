package com.caha.todolist.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long index;
    private String task;
    private String priority;

    @CreationTimestamp
    @Column(updatable = false)
    private Calendar createdDate;

    @UpdateTimestamp
    private Calendar modifiedDate;

    private String teamMember;
}
