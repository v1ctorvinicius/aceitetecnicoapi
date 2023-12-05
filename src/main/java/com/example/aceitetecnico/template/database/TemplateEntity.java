package com.example.aceitetecnico.template.database;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Template")
public class TemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



}
