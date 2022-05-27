//package pl.edu.agh.softwarestudio.angel;
//
//import io.r2dbc.spi.ConnectionFactories;
//import io.r2dbc.spi.ConnectionFactory;
//import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
//import io.r2dbc.postgresql.PostgresqlConnectionFactory;
//import io.r2dbc.spi.ConnectionFactoryOptions;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
//import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
//
//import java.util.List;
//
//@Configuration
//@EnableR2dbcRepositories
//public class AppConfig extends AbstractR2dbcConfiguration {
//
//    //...
//    private String host = "localhost";
//    private Integer port = 5432;
//    private String database = "postgres";
//    private String user = "postgres";
//    private String pass = "th4u9bgji3no";
//    private String schema = "angel";
//
//    /**
//     * Return a R2DBC {@link ConnectionFactory}. Annotate with {@link Bean} in case you want to expose a
//     * {@link ConnectionFactory} instance to the {@link ApplicationContext}.
//     *
//     * @return the configured {@link ConnectionFactory}.
//     */
//    @Override
//    @Bean
//    public ConnectionFactory connectionFactory() {
////        System.out.println(host+ "|" +port+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        PostgresqlConnectionConfiguration config = PostgresqlConnectionConfiguration
//                .builder()
//                .host(host)
//                .port(port)
//                .database(database)
//                .schema(schema)
//                .username(user)
//                .password(pass)
//                .build();
//        return new PostgresqlConnectionFactory(config);
////        return null;
//    }
//
//
//
//    @Override
//    protected List<Object> getCustomConverters() {
//        return List.of(new HelpPlaceConventer());
//    }
//}
