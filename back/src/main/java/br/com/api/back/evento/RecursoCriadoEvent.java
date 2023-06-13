package br.com.api.back.evento;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEvent;

import br.com.api.back.recurso.EventoResource;
import lombok.Getter;

public class RecursoCriadoEvent extends ApplicationEvent {

    private static final Long serialVersionUID = 1L;
    
    @Getter private HttpServletResponse response;
    @Getter private Long codigo;

    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
        super(source);
        this.response = response;
        this.codigo = codigo;
        
    }

    public RecursoCriadoEvent(EventoResource source, HttpServletResponse response2, List<Long> eventoIds) {
        super(eventoIds);
    }
    
}
