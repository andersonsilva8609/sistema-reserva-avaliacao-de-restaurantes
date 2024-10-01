package br.com.fiap.fase3.sistema_reserva_avaliacao_de_restaurantes.modal;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class EntityBase {
	private UUID id;
	private LocalDateTime dataHoraInicial;
	private LocalDateTime dataHoraAtualizacao;
	private LocalDateTime dataHoraFim;

}
