package com.classes;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

import java.util.logging.Logger;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public static void main( String[] args ) {
        Iphone iphone = new Iphone();
        Contato contato = new Contato("João");
        iphone.Atender();
        iphone.AdicionarContato( contato );
        iphone.IniciarChamada( "05002023050" );
        iphone.EncerrarChamada();
        iphone.AbrirNavegador();
        iphone.NovaAba();
        iphone.Navegar( "https://www.linkedin.com/in/gabrielalvesguimaraes/" );
        iphone.EncerrarNavegador();
        iphone.EscolherMusica( "Indíos" );
        iphone.IniciarReproducao();
        iphone.PausarReproducao();
    }
    public boolean AdicionarContato(Contato contato) {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: AdicionarContato - Descrição: Adicionando contato " + contato.nome);
        return true;
    }

    public boolean IniciarChamada(String numero) {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: IniciarChamada - Descrição: Chamando o número: " + numero);

        return true;
    }

    public boolean Atender() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: Atender - Descrição: Atendendo chamada");

        return true;
    }

    public boolean EncerrarChamada() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: EncerrarChamada - Descrição: Encerrando chamada");

        return true;
    }

    public boolean EscolherMusica(String idMusica) {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: EscolherMusica - Descrição: Escolhendo música com ID: "+idMusica );

        return true;
    }

    public boolean IniciarReproducao() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: IniciarReproducao - Descrição: Iniciando reprodução de música");

        return true;
    }

    public boolean PausarReproducao() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: PausarReproducao - Descrição: Pausando reprodução de música");

        return true;
    }

    public boolean AbrirNavegador() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: AbrirNavegador - Descrição: Abrindo o navegador de internet");

        return true;
    }

    public PaginaWeb Navegar(String pesquisa) {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: Navegar - Descrição: Realizando pesquisa na internet: "+pesquisa);

        return new PaginaWeb();
    }

    public PaginaWeb NovaAba() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: NovaAba - Descrição: Abrindo uma nova aba no navegador");

        return new PaginaWeb();
    }

    public boolean EncerrarNavegador() {
        Logger logger = Logger.getLogger(Iphone.class.getName());
        logger.info("Ação: EncerrarNavegador - Descrição: Encerrando o navegador de internet");

        return true;
    }


}
