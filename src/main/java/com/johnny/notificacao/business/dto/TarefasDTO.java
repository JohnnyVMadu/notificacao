package com.johnny.notificacao.business.dto;

import com.johnny.notificacao.business.enums.StatusNotificacaoEnum;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {

    private String id;
    private String nomeTarefa;
    private String descricao;

    // 🔁 Agora tudo é String — simples, seguro e sem erro de parse
    private String dataCriacao;
    private String dataEvento;
    private String dataAlteracao;

    private String emailUsuario;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
