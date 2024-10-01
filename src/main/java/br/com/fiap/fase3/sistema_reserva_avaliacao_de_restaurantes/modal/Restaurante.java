package br.com.fiap.fase3.sistema_reserva_avaliacao_de_restaurantes.modal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restaurante extends EntityBase {
	private String nome;
	private String descricao;
	private String localizacao;
	private int capacidade;
	private TipoCozinha tipoCozinha;
	private Proprietario proprietario;
	
}
