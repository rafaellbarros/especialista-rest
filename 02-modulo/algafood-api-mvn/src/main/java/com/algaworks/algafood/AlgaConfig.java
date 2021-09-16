package com.algaworks.algafood;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;

// @Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        final NotificadorEmail notificador = new NotificadorEmail("stmp.algamail.com.br");
        notificador.setCaixaAlta(false);
        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService() {
        return new AtivacaoClienteService(notificadorEmail());
    }
}
