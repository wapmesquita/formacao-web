Exemplos de código em JSF

# Iniciando um projeto

## Archetype
Execute o comando abaixo para criar um projeto web:

	mvn archetype:generate -DgroupId={project-packaging} -DartifactId={project-name} -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

## Dependências
[Dependência do Mojarra JSF](https://javaserverfaces.java.net/download.html)

[Dependência do PrimeFaces](http://primefaces.org/downloads)

## Jetty Plugin

[Tutorial Getting Start](http://www.eclipse.org/jetty/documentation/current/jetty-maven-plugin.html)

Você pode encontrar como adicionar o plugin do jetty neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/ee8f9b09fccfcf85e08b00829d999dbce2720a0b)

Após adicionar o plugin, é necessário inserir as dependências de JSF para o plugin [commit](https://github.com/wapmesquita/formacao-jsf/commit/2464a102726ce53688ffcf4203eb5463cd14b66f)

# Primeira paǵina

* Configurando o projeto e criando minha primeira página - [Como fazer?](https://github.com/wapmesquita/formacao-jsf/commit/3b838da3eb0b0b5038b1215ca94f7f5bc1ffd67c)

* Criando meu primeiro ManageBean - [Como Fazer?](https://github.com/wapmesquita/formacao-jsf/commit/232d5f90af70aaa7c115ae10f927599c971273eb)

# Utilizando o [PrimeFaces](http://www.primefaces.org/)

Abixo você poderá encontrar como utilizar os componentes do PrimeFaces em seu projeto.

## Primeiro teste

Alterando o index.xhtml para utilizar um componente do PrimeFaces - [Como Fazer?](https://github.com/wapmesquita/formacao-jsf/commit/938211895761902dff7589187e3feb0771c7afd8)

## Alterando [tema](http://www.primefaces.org/themes) do PrimeFaces

Neste [exemplo](https://github.com/wapmesquita/formacao-jsf/commit/e455efc6c96843a9ffffbd42f39e60b366f0a77b) você pode ver como utilizar um tema do PrimeFaces.
