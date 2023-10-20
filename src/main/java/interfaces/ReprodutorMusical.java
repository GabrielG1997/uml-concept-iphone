package interfaces;

import java.util.logging.Logger;

public interface ReprodutorMusical {
    default boolean EscolherMusica(String idMusica) {
        Logger logger = Logger.getLogger(ReprodutorMusical.class.getName());
        logger.info("Ação: EscolherMusica - Descrição: Escolhendo música com ID " + idMusica);
        return true;
    }

    default boolean IniciarReproducao() {
        Logger logger = Logger.getLogger(ReprodutorMusical.class.getName());
        logger.info("Ação: IniciarReproducao - Descrição: Iniciando reprodução de música");
        return true;
    }

    default boolean PausarReproducao() {
        Logger logger = Logger.getLogger(ReprodutorMusical.class.getName());
        logger.info("Ação: PausarReproducao - Descrição: Pausando reprodução de música");
        return true;
    }
}
