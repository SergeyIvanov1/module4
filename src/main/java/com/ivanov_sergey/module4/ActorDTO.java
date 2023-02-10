package com.ivanov_sergey.module4;

import lombok.*;

import javax.persistence.Column;

@Builder
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ActorDTO {
    private String firstName;
    private String lastName;
}
