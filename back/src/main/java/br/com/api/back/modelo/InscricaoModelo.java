package br.com.api.back.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="inscricao")
@Getter
@Setter
@EqualsAndHashCode
public class InscricaoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inscricao;
    private Date horario_inscricao;
    private Date data_inscricao;
    private Long num_inscricao;
    
}
