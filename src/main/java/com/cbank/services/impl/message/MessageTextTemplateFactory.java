package com.cbank.services.impl.message;

import com.cbank.domain.message.MessageTemplate;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Locale;
import java.util.Map;

/**
 * @author Podshivalov N.A.
 * @since 21.11.2017.
 */
@Component
@AllArgsConstructor
class MessageTextTemplateFactory {
    private final TemplateEngine templateEngine;

    String create(MessageTemplate template, Map<String, Object> context){
        val filename = "../templates/" + template.name().toLowerCase();
        return templateEngine.process(filename, new Context(Locale.getDefault(), context));
    }

}
