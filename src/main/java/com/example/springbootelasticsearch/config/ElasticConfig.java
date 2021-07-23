package com.example.springbootelasticsearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages
        = "com.example.springbootelasticsearch.repositories")
@ComponentScan(basePackages = {"com.example.springbootelasticsearch"})
public class ElasticConfig extends AbstractElasticsearchConfiguration {

    @Value("${app.elastic-url}")
    private String elasticUrl;

    @Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .connectedTo(elasticUrl)
                        .build();
        return RestClients.create(clientConfiguration).rest();
    }
}
