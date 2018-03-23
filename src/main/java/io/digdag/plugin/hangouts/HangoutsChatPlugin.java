package io.digdag.plugin.hangouts;

import io.digdag.spi.OperatorFactory;
import io.digdag.spi.OperatorProvider;
import io.digdag.spi.Plugin;
import io.digdag.spi.TemplateEngine;

import javax.inject.Inject;

import java.util.Arrays;
import java.util.List;

public class HangoutsChatPlugin
        implements Plugin
{
    @Override
    public <T> Class<? extends T> getServiceProvider(Class<T> type)
    {
        if (type == OperatorProvider.class) {
            return HangoutsChatOperatorProvider.class.asSubclass(type);
        }
        else {
            return null;
        }
    }

    public static class HangoutsChatOperatorProvider
            implements OperatorProvider
    {
        @Inject
        protected TemplateEngine templateEngine;

        @Override
        public List<OperatorFactory> get()
        {
            return Arrays.asList(
                    new HangoutsChatOperatorFactory(templateEngine));
        }
    }
}
