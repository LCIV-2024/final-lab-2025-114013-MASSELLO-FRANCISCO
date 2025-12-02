package com.example.demobase.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "words")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Word {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String palabra;
    
    @Column(nullable = false)
    private Boolean utilizada = false;
}

