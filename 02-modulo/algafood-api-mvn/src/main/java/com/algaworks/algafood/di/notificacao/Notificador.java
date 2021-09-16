package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

public interface Notificador {
    void notificar(final Cliente cliente, final String mensagem);
}
