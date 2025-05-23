# Sistema RH (REST-SOAP-JAVA)

Este repositório contém um Sistema de Recursos Humanos (RH) desenvolvido em Java, utilizando uma arquitetura modular com serviços RESTful e SOAP. O projeto é construído com Maven e é projetado para ser executado em um servidor Apache Tomcat.

### Visão Geral do Projeto

O Sistema RH é composto por múltiplos módulos, cada um com responsabilidades específicas:

* **`sisrh`**: O módulo principal do sistema de RH, contendo a lógica de negócios, DTOs, filtros de segurança (RBAC e Auditoria), e serviços REST e SOAP relacionados a empregados, solicitações e usuários. Ele também inclui scripts SQL para inicialização do banco de dados.
* **`projetorest`**: Um módulo dedicado à exposição de serviços RESTful, como a gestão de empregados.
* **`projetosap`**: Um módulo responsável pela disponibilização de serviços SOAP, incluindo funcionalidades de busca de UFs (Unidades Federativas) e uma calculadora.
* **`rbac`**: Um módulo de segurança focado em Controle de Acesso Baseado em Função (Role-Based Access Control - RBAC), gerenciando autenticação e autorização através de endpoints REST.

### Tecnologias Utilizadas

* **Java**: Linguagem de programação principal.
* **Maven**: Ferramenta para automação de build e gerenciamento de dependências.
* **JAX-RS (Jersey)**: Para implementação dos serviços web RESTful (em `projetorest` e `sisrh`).
* **JAX-WS**: Para implementação dos serviços web SOAP (em `projetosap` e `sisrh`).
* **Apache Tomcat 9.0.102**: Servidor de aplicações Java utilizado para implantar o sistema.
* **SQL**: Scripts para a criação da estrutura e dados do banco de dados.
* **RBAC (Role-Based Access Control)**: Implementação de segurança para controle de acesso.

### Estrutura do Repositório

O repositório está organizado da seguinte forma:
