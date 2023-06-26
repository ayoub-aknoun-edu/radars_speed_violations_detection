package me.project.immatriculationservice.config;

import lombok.AllArgsConstructor;
import me.project.immatriculationservice.web.soap.ImatSoapController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration @AllArgsConstructor
public class CxfConfig {

    private Bus bus;

    private ImatSoapController imatSoapController;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, imatSoapController);
        endpoint.publish("/ImatriculationSoapService");
        return endpoint;
    }
}
