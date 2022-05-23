package com.dedvDias.minhaLojaVirtual.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Getter
@Setter

public class Produto implements Serializable {

	private static final long serialVersionUID = 4048798961366546485L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String nome;
	private String cpf;
	private String email;
	
	@Column(length = 4000)
	private String observacao;
}
