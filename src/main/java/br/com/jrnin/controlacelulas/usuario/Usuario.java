package br.com.jrnin.controlacelulas.usuario;
import java.io.*;
import java.util.*;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
	@Id
	@GeneratedValue
	private Integer codigo;
	private String nome;
	private String email;
	@org.hibernate.annotations.NaturalId 
	private String login;
	private String senha;
	private Date nascimento;
	private String celular;
	private String idioma;
	private boolean ativo;
	// gerar gets e sets
	// gerar hashCode e equals
}