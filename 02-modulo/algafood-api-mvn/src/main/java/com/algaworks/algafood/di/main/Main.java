package com.algaworks.algafood.di.main;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.modelo.Produto;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.notificacao.NotificadorSMS;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import com.algaworks.algafood.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        final Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
        final Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177772222");

        final Produto ps4 = new Produto("PS4", new BigDecimal(2000));

        final Notificador notificadorSMS = new NotificadorSMS();

        final AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificadorSMS);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);

        final Notificador notificadorEmail = new NotificadorEmail();
        final EmissaoNotaFiscalService emissaoNotaFiscal = new EmissaoNotaFiscalService(notificadorEmail);
        emissaoNotaFiscal.emitir(joao, ps4);



    }
}
