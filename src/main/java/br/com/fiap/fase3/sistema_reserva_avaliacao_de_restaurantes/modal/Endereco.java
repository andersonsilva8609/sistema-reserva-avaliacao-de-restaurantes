package br.com.fiap.fase3.sistema_reserva_avaliacao_de_restaurantes.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco extends EntityBase{
	private String cep;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;

}
