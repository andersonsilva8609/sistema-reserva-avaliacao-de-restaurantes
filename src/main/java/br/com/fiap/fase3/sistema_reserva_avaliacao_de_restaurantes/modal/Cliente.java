package br.com.fiap.fase3.sistema_reserva_avaliacao_de_restaurantes.modal;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente extends EntityBase{
	private LocalDate dataNascimento;
	private Endereco endereco;

}
