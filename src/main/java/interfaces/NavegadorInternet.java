package interfaces;

import com.classes.PaginaWeb;

import java.util.logging.Logger;

public interface NavegadorInternet {
    default boolean AbrirNavegador() {
        Logger logger = Logger.getLogger(NavegadorInternet.class.getName());
        logger.info("Ação: AbrirNavegador - Descrição: Abrindo o navegador de internet");
        return true;
    }

    default PaginaWeb Navegar( String pesquisa) {
        Logger logger = Logger.getLogger(NavegadorInternet.class.getName());
        logger.info("Ação: Navegar - Descrição: Realizando pesquisa na internet: " + pesquisa);
        return new PaginaWeb();
    }

    default PaginaWeb NovaAba() {
        Logger logger = Logger.getLogger(NavegadorInternet.class.getName());
        logger.info("Ação: NovaAba - Descrição: Abrindo uma nova aba no navegador");
        return new PaginaWeb();
    }

    default boolean EncerrarNavegador() {
        Logger logger = Logger.getLogger(NavegadorInternet.class.getName());
        logger.info("Ação: EncerrarNavegador - Descrição: Encerrando o navegador de internet");
        return true;
    }
}
