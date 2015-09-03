Este repositório contém um projeto iniciado com REST e JSF.

Neste código é possível visualizar um projeto REST e um projeto JSF funcionando com uma mesma API de Services e um mesmo Banco de Dados em memória - [HSQLDB](https://www.google.com.br/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0CB0QFjAAahUKEwiAsMTYpdvHAhVEhZAKHYcTDVs&url=http%3A%2F%2Fhsqldb.org%2F&usg=AFQjCNFFhUGsQjk7K8Pu1z-ZbcwZe7Uk7g&sig2=8Ke1mBB4mRP5EHWFMrmuNg&bvm=bv.101800829,d.Y2I).

# Instruções

### Configurando o projeto para importar no eclipse

Para poder importar o projeto no Eclipse, execute o comando 

  mvn eclipse:clean eclipse:eclipse
  
Este comando irá limpar os arquivos .project e .classpath utilizados pelo Eclipse para guardar as configurações do seu projeto.

### Compilando o projeto

Não se esqueça que pode ser necessário compilar o projeto quando alterar uma classe Java. Para isso utilize o comando:

    mvn clean install

### Start no container web

Existem três formas de visualizar a aplicação funcionando.

#### 1. Executando o comando na raiz

Se você executar o comando na raiz do projeto você poderá visualizar as aplicações REST e JSF funcionando em paralelo. Para que não tenha problemas, lembre-se de compilar o projeto antes e, então execute o comando abaixo para dar start no container (Jetty):

    mvn jetty:run
  

#### 2. Executando o comando nas pastas específicas

Caso queira ver somente a aplicação Rest funcionando execute o comando **mvn jetty:run** na pasta do projeto rest. Para acessar a pasta do projeto rest utilize o comando abaixo:

    cd rest

Caso queira ver somente a aplicação JSF funcionando execute o comando **mvn jetty:run** na pasta do projeto JSF. Para acessar a pasta do projeto rest utilize o comando abaixo:

    cd jsf-project

