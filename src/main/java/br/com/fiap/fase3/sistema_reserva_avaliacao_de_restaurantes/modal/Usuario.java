package br.com.fiap.fase3.sistema_reserva_avaliacao_de_restaurantes.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario extends EntityBase{
	private String nome;
	private String email;
	private String password;
	private String telefone;
	
}
