
# Sistema RH (REST-SOAP-JAVA) 🧑‍💼

Este repositório contém um Sistema de Recursos Humanos (RH) desenvolvido em Java, utilizando uma arquitetura modular com serviços RESTful e SOAP. O projeto é construído com Maven e é projetado para ser executado em um servidor Apache Tomcat.

## 📁 Estrutura do Projeto

- **`sisrh`**: Módulo principal que contém a lógica de negócios, DTOs, filtros de segurança (RBAC e Auditoria), e serviços REST e SOAP relacionados a empregados, solicitações e usuários. Inclui scripts SQL para inicialização do banco de dados.
- **`projetorest`**: Módulo dedicado à exposição de serviços RESTful, como a gestão de empregados.
- **`projetosap`**: Módulo responsável pela exposição de serviços SOAP.

## 🚀 Tecnologias Utilizadas

- Java 8+
- Maven
- Spring Framework
- JAX-RS (Jersey)
- JAX-WS (SOAP)
- Apache Tomcat
- Banco de Dados Relacional (ex: PostgreSQL ou MySQL)

## ⚙️ Como Executar o Projeto

1. **Pré-requisitos**:
   - Java 8 ou superior instalado
   - Apache Maven instalado
   - Apache Tomcat configurado
   - Banco de dados relacional disponível

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/JonhnCod/JAVA.git
````

3. **Importar o Projeto**:

   * Importe como um projeto Maven em sua IDE favorita (Eclipse, IntelliJ, etc.)

4. **Configurar o Banco de Dados**:

   * Crie o banco de dados conforme os scripts SQL disponíveis no módulo `sisrh`
   * Atualize as configurações de conexão com o banco de dados nos arquivos de configuração do projeto

5. **Construir o Projeto**:

   ```bash
   mvn clean install
   ```

6. **Implantar no Tomcat**:

   * Copie os arquivos `.war` gerados para o diretório `webapps` do Tomcat
   * Inicie o servidor Tomcat

## 📌 Funcionalidades

* Gestão de Empregados: CRUD completo para informações de funcionários
* Solicitações: Gerenciamento de solicitações internas relacionadas ao RH
* Controle de Acesso: Implementação de RBAC (Role-Based Access Control)
* Auditoria: Registro de ações e eventos para fins de auditoria
* Serviços REST e SOAP: APIs para integração com outros sistemas

## 🛠️ Contribuindo

Contribuições são bem-vindas! Se você deseja melhorar alguma funcionalidade ou corrigir bugs, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](https://github.com/JonhnCod/JAVA/blob/main/LICENSE) para mais detalhes.

```

Se quiser, posso te ajudar a colocar ele direto no repositório também.
```

