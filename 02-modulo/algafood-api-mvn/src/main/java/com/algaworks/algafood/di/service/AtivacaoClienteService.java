package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(final Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(final Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
