Sistema RH (REST-SOAP-JAVA)
Este repositório contém um Sistema de Recursos Humanos (RH) desenvolvido em Java, utilizando uma arquitetura modular com serviços RESTful e SOAP. O projeto é construído com Maven e é projetado para ser executado em um servidor Apache Tomcat.

Visão Geral do Projeto
O Sistema RH é composto por múltiplos módulos, cada um com responsabilidades específicas:

sisrh: O módulo principal do sistema de RH, contendo a lógica de negócios, DTOs, filtros de segurança (RBAC e Auditoria), e serviços REST e SOAP relacionados a empregados, solicitações e usuários. Ele também inclui scripts SQL para inicialização do banco de dados.
projetorest: Um módulo dedicado à exposição de serviços RESTful, como a gestão de empregados.
projetosap: Um módulo responsável pela disponibilização de serviços SOAP, incluindo funcionalidades de busca de UFs (Unidades Federativas) e uma calculadora.
rbac: Um módulo de segurança focado em Controle de Acesso Baseado em Função (Role-Based Access Control - RBAC), gerenciando autenticação e autorização através de endpoints REST.
Tecnologias Utilizadas
Java: Linguagem de programação principal.
Maven: Ferramenta para automação de build e gerenciamento de dependências.
JAX-RS (Jersey): Para implementação dos serviços web RESTful (em projetorest e sisrh).
JAX-WS: Para implementação dos serviços web SOAP (em projetosap e sisrh).
Apache Tomcat 9.0.102: Servidor de aplicações Java utilizado para implantar o sistema.
SQL: Scripts para a criação da estrutura e dados do banco de dados.
RBAC (Role-Based Access Control): Implementação de segurança para controle de acesso.
Estrutura do Repositório
O repositório está organizado da seguinte forma:

Sistema-RH(REST-SOAP-JAVA)/
├── apache-tomcat-9.0.102/  # Distribuição do Apache Tomcat
├── projetorest/             # Módulo de serviços REST de Empregados
│   ├── pom.xml
│   └── src/main/java/rest/
│       ├── AppRest.java
│       ├── Empregado.java
│       └── EmpregadoRest.java
├── projetosap/              # Módulo de serviços SOAP (UF, Calculadora)
│   ├── pom.xml
│   └── src/main/java/
│       ├── bean/
│       │   ├── ListaUF.java
│       │   └── UF.java
│       ├── exception/
│       │   └── DivisaoPorZeroException.java
│       └── soap/
│           ├── BuscardorUF.java
│           └── Calculadora.java
├── rbac/                    # Módulo de segurança RBAC (Login, Token)
│   ├── pom.xml
│   └── src/main/java/rbac/
│       ├── dto/
│       │   ├── Login.java
│       │   └── TokenRecursoAcao.java
│       └── rest/
│           ├── AppRest.java
│           └── LoginUnicoRest.java
├── sisrh/                   # Módulo principal do Sistema de RH
│   ├── pom.xml
│   └── src/main/
│       ├── java/sisrh/
│       │   ├── banco/
│       │   │   └── Banco.java
│       │   ├── dto/
│       │   │   ├── Empregado.java
│       │   │   ├── Empregados.java
│       │   │   ├── Login.java
│       │   │   ├── Solicitacao.java
│       │   │   ├── Solicitacoes.java
│       │   │   ├── Usuario.java
│       │   │   └── Usuarios.java
│       │   ├── exception/
│       │   │   └── SISRHException.java
│       │   ├── filter/
│       │   │   ├── AuditoriaFilter.java
│       │   │   └── FiltroSegurancaRBAC.java
│       │   ├── rest/
│       │   │   ├── AppRest.java
│       │   │   ├── EmpregadoRest.java
│       │   │   ├── LoginUnicoRest.java
│       │   │   ├── SistemaRest.java
│       │   │   ├── SolicitacaoRest.java
│       │   │   └── UsuarioRest.java
│       │   ├── seguranca/
│       │   │   ├── Autenticador.java
│       │   │   ├── LoginUnico.java
│       │   │   └── RBAC.java
│       │   ├── servlet/
│       │   │   └── InicializarBancoServlet.java
│       │   └── soap/
│       │       ├── ServicoBasico.java
│       │       ├── ServicoEmpregado.java
│       │       └── ServicoSolicitacao.java
│       ├── resources/
│       │   ├── db_sisrh_dados.sql    # Scripts de dados para o banco
│       │   └── db_sisrh_estrutura.sql # Scripts de estrutura para o banco
│       └── webapp/WEB-INF/            # Configurações web (web.xml, sun-jaxws.xml)
└── sisrh_db/                # Arquivo de configuração de banco de dados
    └── rh_db.properties
Configuração e Execução
Para configurar e executar o projeto localmente, siga os passos abaixo:

Pré-requisitos
Java Development Kit (JDK) 8 ou superior
Apache Maven 3.x
Apache Tomcat 9.0.102 (já incluído no repositório, mas é bom ter uma instalação limpa ou configurar o IDE para usar a inclusa)
Um servidor de banco de dados (ex: MySQL, PostgreSQL, H2)
Um IDE Java (ex: Eclipse, IntelliJ IDEA)
Passos para Configuração
Clone o repositório:

Bash

git clone <URL_DO_SEU_REPOSITORIO>
cd Sistema-RH(REST-SOAP-JAVA)
Configurar o Banco de Dados:

Crie um banco de dados vazio para o sistema RH.
Execute os scripts SQL localizados em sisrh/src/main/resources/:
db_sisrh_estrutura.sql: Para criar as tabelas do banco de dados.
db_sisrh_dados.sql: Para popular o banco de dados com dados iniciais (usuários, empregados, etc.).
Ajuste as configurações de conexão com o banco de dados no arquivo sisrh_db/rh_db.properties para corresponder às suas credenciais e URL do banco de dados.
Configurar o Apache Tomcat:

O repositório já inclui uma pasta apache-tomcat-9.0.102. Você pode usar esta instância ou configurar seu IDE para implantar os projetos WAR nesta pasta.
Verifique os arquivos de configuração do Tomcat em apache-tomcat-9.0.102/conf/ e Servers/Tomcat v9.0 Server at localhost-config/ (se houver uma configuração de IDE) para garantir que as portas e outras configurações estejam corretas.
Importar os Projetos para o IDE:

Abra seu IDE (Eclipse ou IntelliJ IDEA).
Importe os projetos Maven: projetorest, projetosap, rbac e sisrh. No Eclipse, você pode ir em File -> Import -> Maven -> Existing Maven Projects. No IntelliJ, File -> Open e selecione o diretório raiz do projeto.
Buildar os Projetos Maven:

Certifique-se de que cada módulo (projetorest, projetosap, rbac, sisrh) seja construído com sucesso usando Maven. Você pode fazer isso a partir do IDE (Maven -> Update Project, Maven -> Install) ou pela linha de comando em cada diretório do projeto:

Bash

cd projetorest
mvn clean install
cd ../projetosap
mvn clean install
cd ../rbac
mvn clean install
cd ../sisrh
mvn clean install
Implantar as Aplicações no Tomcat:

No seu IDE, configure o Apache Tomcat como um servidor de execução.
Adicione os módulos (projetorest, projetosap, rbac, sisrh) à implantação do servidor Tomcat. O IDE geralmente cria arquivos .war e os implanta automaticamente na pasta webapps do Tomcat.
Alternativamente, você pode copiar manualmente os arquivos .war gerados na pasta target de cada projeto para o diretório apache-tomcat-9.0.102/webapps/.
Execução
Iniciar o Servidor Tomcat:

Inicie o Apache Tomcat através do seu IDE ou executando os scripts de inicialização (ex: startup.sh para Linux/macOS ou startup.bat para Windows) localizados em apache-tomcat-9.0.102/bin/.
Acessar as Aplicações:

Uma vez que o Tomcat esteja em execução, você poderá acessar as diferentes partes do sistema:
Sistema RH (web): http://localhost:8080/sisrh/sisfin.html (ou a URL configurada para o seu projeto sisrh).
Serviços REST (Empregados): http://localhost:8080/projetorest/rest/empregados
Serviços SOAP (UF, Calculadora): Os endpoints SOAP podem ser acessados via WSDL, por exemplo: http://localhost:8080/projetosap/Calculadora?wsdl
Serviços REST RBAC (Login): http://localhost:8080/rbac/rest/login
Serviços REST SISRH (Empregados, Usuários, etc.): http://localhost:8080/sisrh/rest/empregados, http://localhost:8080/sisrh/rest/usuarios, etc.
(As portas e os caminhos de contexto podem variar dependendo da sua configuração do Tomcat e do IDE.)

Contribuição
Para contribuir com este projeto, por favor, siga as diretrizes padrão de contribuição de código:

Faça um fork do repositório.
Crie uma nova branch para sua feature (git checkout -b feature/minha-feature).
Faça suas alterações e commit-as (git commit -m 'Adiciona nova feature').
Envie suas alterações para o fork (git push origin feature/minha-feature).
Abra um Pull Request.
