package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(final Cliente cliente) {
        cliente.ativar();

        if (notificador != null) {
            this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
            return;
        }

        System.out.println("Não existe notificador, mas cliente foi ativado");
    }

}
