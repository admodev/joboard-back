package com.admodevops.joboard.Jobs;

import com.admodevops.joboard.Areas.Area;
import com.admodevops.joboard.Companies.Company;
import jakarta.persistence.*;
import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Job {
    @Id
    @GeneratedValue
    private Long id;

    private String jobName;

    private String jobDescription;

    @ManyToOne
    @JoinColumn(name = "published_by", referencedColumnName = "id")
    private Company publishedBy;

    @ManyToOne
    @JoinColumn(name = "job_area", referencedColumnName = "id")
    private Area jobArea;

    public Job(String jobName, String jobDescription, Company publishedBy) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.publishedBy = publishedBy;
    }
}
