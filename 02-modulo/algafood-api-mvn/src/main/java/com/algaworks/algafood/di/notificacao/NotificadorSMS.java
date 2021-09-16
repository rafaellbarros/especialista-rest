package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(final Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }

}
