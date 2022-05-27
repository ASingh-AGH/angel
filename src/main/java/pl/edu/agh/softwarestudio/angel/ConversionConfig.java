package pl.edu.agh.softwarestudio.angel;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import pl.edu.agh.softwarestudio.angel.places.HelpPlaceConventer;

import java.util.List;

@Configuration
@EnableR2dbcRepositories
public class ConversionConfig  extends AbstractR2dbcConfiguration {

    //...

    /**
     * Return a R2DBC {@link ConnectionFactory}. Annotate with {@link Bean} in case you want to expose a
     * {@link ConnectionFactory} instance to the {@link ApplicationContext}.
     *
     * @return the configured {@link ConnectionFactory}.
     */
    @Override
    public ConnectionFactory connectionFactory() {
        return null;

    }

    @Override
    protected List<Object> getCustomConverters() {
        return List.of(new HelpPlaceConventer());
    }
}
