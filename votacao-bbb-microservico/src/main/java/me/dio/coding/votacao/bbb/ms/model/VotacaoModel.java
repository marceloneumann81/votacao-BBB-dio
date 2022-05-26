package me.dio.coding.votacao.bbb.ms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Document("votacao")
@NoArgsConstructor
@AllArgsConstructor
public class VotacaoModel {
	
	@Id
	private String id;	
	private ParticipanteModel participante;
	private Date dataHora;
	

}
