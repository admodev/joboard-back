package com.admodevops.joboard.Areas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Area {
    @Id
    @GeneratedValue
    private Long id;

    private String areaName;
}
