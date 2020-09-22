package com.etalase.swagger;


import com.etalase.swagger.response.KongResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@Primary
@EnableAutoConfiguration
public class Documentation  implements SwaggerResourcesProvider{
    private final Logger logger = LoggerFactory.getLogger(Documentation.class);
    @Value("${kong-gateway.host}")
    private String kongGateway;
    @Value("${kong-gateway.external-host}")
    private String kongGatewayExternalHost;
    @Override
    public List<SwaggerResource> get() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(kongGateway+"/services", String.class);
        KongResponse kongResponse = new KongResponse();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            kongResponse = objectMapper.readValue(responseEntity.getBody(),KongResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List resources = new ArrayList();
        kongResponse.getData().forEach(datum -> {
            logger.info("URL DOC : {}",kongGatewayExternalHost.isEmpty() ? kongGateway : kongGatewayExternalHost+"/"+datum.getName()+"/v2/api-docs");
            resources.add(swaggerResource(datum.getName(), kongGatewayExternalHost.isEmpty() ? kongGateway : kongGatewayExternalHost+"/"+datum.getName()+"/v2/api-docs", "2.0"));

        });
        return resources;
    }
    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
