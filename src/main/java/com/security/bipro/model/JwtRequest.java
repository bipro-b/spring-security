package com.security.bipro.model;


import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="jwtRequest")
public class JwtRequest {
    private String email;
    private String password;

}
