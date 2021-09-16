package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.modelo.Produto;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(final Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(final Cliente cliente, final Produto produto) {
        // TODO: emite a nota fiscal aqui...
        this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }
}
