package com.example.JobPortalbatch1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobSeekerProfile {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String resume;
        private String url;
        private String certifications;
        private String Skills;
        private User user;
        private Set<Job> appliedJobs;



}
