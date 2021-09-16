package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(final Cliente cliente, final String mensagem) {
        System.out.printf("Notificando %s através do e-email %s: %s\n", cliente.getNome(), cliente.getEmail(),
                mensagem);
    }
}
