package br.com.geanmoura.projeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info()
                  .title("Documentação API Jogos e Plataformas")
                  .description("Exemplo de API Restful utilizando Springdoc para documentação. Atividade da disciplina de Tecnologias Disruptivas do curso de ADS.")
                  .version("1.0.0")
                  .license(new License()
                    .name("Apache 2.0")
                    .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                .description("Link do Repositório da Aplicação")
                .url("https://github.com/geanmm/atividade-restapi-springdoc"));
	  }
}