package com.security.bipro.model;

import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "jwtResponse")
public class JwtResponse {
    private String jwtToken;
    private String username;
}
