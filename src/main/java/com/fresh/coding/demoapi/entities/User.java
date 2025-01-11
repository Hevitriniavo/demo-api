package com.fresh.coding.demoapi.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
public class User {
    private Long id;
    private String lastName;
    private String firstName;
    private String email;
    private LocalDate birthDate;
}
