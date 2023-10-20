package interfaces;

import com.classes.Contato;

import java.util.logging.Logger;

public interface AparelhoTelefonico {
    // Declaração de métodos

    default boolean AdicionarContato( Contato contato) {
        // Adicione instruções de logging
        Logger logger = Logger.getLogger(AparelhoTelefonico.class.getName());
        logger.info("Ação: AdicionarContato - Descrição: Adicionando contato ");
        // Lógica de implementação do método
        return true; // Substitua isso pela implementação real
    }

    default boolean IniciarChamada(String numero) {
        // Adicione instruções de logging
        Logger logger = Logger.getLogger(AparelhoTelefonico.class.getName());
        logger.info("Ação: IniciarChamada - Descrição: Chamando o número " + numero);
        // Lógica de implementação do método
        return true; // Substitua isso pela implementação real
    }

    default boolean Atender() {
        // Adicione instruções de logging
        Logger logger = Logger.getLogger(AparelhoTelefonico.class.getName());
        logger.info("Ação: Atender - Descrição: Atendendo chamada");
        // Lógica de implementação do método
        return true; // Substitua isso pela implementação real
    }

    default boolean EncerrarChamada() {
        // Adicione instruções de logging
        Logger logger = Logger.getLogger(AparelhoTelefonico.class.getName());
        logger.info("Ação: EncerrarChamada - Descrição: Encerrando chamada");
        // Lógica de implementação do método
        return true; // Substitua isso pela implementação real
    }
}
