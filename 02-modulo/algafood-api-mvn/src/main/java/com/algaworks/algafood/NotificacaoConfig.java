package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        final NotificadorEmail notificador = new NotificadorEmail("stmp.algamail.com.br");
        notificador.setCaixaAlta(false);
        return notificador;
    }
}
