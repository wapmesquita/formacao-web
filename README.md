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


# Manipulando páginas e ManageBeans

## Acessando uma classe

Você pode acessar os atributos de uma classe em um arquivo *.xhtml* da mesma forma que acessa um atributo do ManageBena. Neste [exemplo](https://github.com/wapmesquita/formacao-jsf/commit/e73dfb7d696ade6d3897c9b5c105f3cff83a0a0d) criamos a classe *Pessoa*, e acessamos o atributo *name* em nossos arquivo *.xhtml*

## Executando ações em botões

É possível executar determinado método em nosso ManageBean a partir do clique de um botão. Este método pode ser para navegação ou apenas para alguma ação.

### Navegação

Como mostrado neste [exemplo](https://github.com/wapmesquita/formacao-jsf/commit/6797d7fe3cfcc0f0815ab3410705f5f61a3ca467), para executar a navegação, basta retornar o caminho do arquivo desejado.

### Ação

Neste [exemplo](https://github.com/wapmesquita/formacao-jsf/commit/c559460f521c10813b633781165ce46516a742a0), utilizamos apenas a informação enviado do *index.xhtml* para o ManageBean e registramos no console.

## Formulários

Este [exemplo](https://github.com/wapmesquita/formacao-jsf/commit/5c65176682dcd1896d483bd3232493ec7b030e9a) mostra alguns tipos de **validações** possíveis de se fazer diretamente nos arquivos *.xhtml*.

# Templates - Facelets

## ui:insert ui:include

Neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/5c65176682dcd1896d483bd3232493ec7b030e9a) você poderá ver como utilizar um arquivo *.xhtml* em vários lugares. Utilizando a tag **ui:insert**.

## ui:insert ui:define

Também é possível fazer com que vários arquivos *.xhtml* utilize somente uma estrura de layout. Este [commit](https://github.com/wapmesquita/formacao-jsf/commit/6b80b79f3b79f3ae33a9490dbc341222f604c7db) mostra como fazer isto.

# CRUD

### Adicionar

Agora conseguimos construir nosso primeiro cadastro. Para isto temos que criar nossa tela no arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/64d14e67a3886b6c1447b58f5b41d30a8690fd57/jsf-project/src/main/webapp/exemplos/cadastro/categoria.xhtml) e, para gerenciar nossa tela, construimos nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/64d14e67a3886b6c1447b58f5b41d30a8690fd57/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/CategoriaBean.java). As alteracoes para podem ser encontradas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/64d14e67a3886b6c1447b58f5b41d30a8690fd57).

### Remover

Apos conseguir incluir um item em nosso cadastro, podemos contruir a funcionalidade de remover um registro. Para isso, alteramos nosso arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/c1dbd6c238b4677d602b12b67e7b432791291770/jsf-project/src/main/webapp/exemplos/cadastro/categoria.xhtml) e implementamos a funcionalidade em nosso arquivo [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/c1dbd6c238b4677d602b12b67e7b432791291770/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/CategoriaBean.java). As alteracoes podem ser encontradas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/c1dbd6c238b4677d602b12b67e7b432791291770).

### Editar

Para completar nosso cadastro, devemos criar a funcionalidade para editar nosso registro. Esta funcionalidade pode ser feita de duas formas: uma janela modal ou e uma outra pagina.

#### Modal

Para editar nosso registro em uma janela modal, temos que criar um botao e a janela em nosso arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/78c8740863c376626df4e2c494a3119b8a68753e/jsf-project/src/main/webapp/exemplos/cadastro/categoria.xhtml), e tambem, implementar o codigo necessario em nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/78c8740863c376626df4e2c494a3119b8a68753e/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/CategoriaBean.java). Tudo isso pode ser encontrado neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/78c8740863c376626df4e2c494a3119b8a68753e).

#### Outra Pagina

Para editar nosso registro em uma outra pagina, temos que criar um botao em nosso arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/957cc9b0069a8fb8a84f75ee6b2c3c236c563446/jsf-project/src/main/webapp/exemplos/cadastro/categoria.xhtml), e tambem, implementar o codigo necessario em nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/957cc9b0069a8fb8a84f75ee6b2c3c236c563446/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/CategoriaBean.java). Porem, o acesso as funcionalidade de edicao, devem ser feitas em outro arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/957cc9b0069a8fb8a84f75ee6b2c3c236c563446/jsf-project/src/main/webapp/exemplos/cadastro/editar-categoria.xhtml). Tudo isso pode ser encontrado neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/957cc9b0069a8fb8a84f75ee6b2c3c236c563446).

# Selects e Converters

As vezes temos a necessidade de colocar em nossa view, um combo que lista as entidades de nosso sistema. Por exemplo, uma entidade que possui um Id e um atributo Nome. Para colocar um select deste tipo na tela, continuamos criando nosso arquivo [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/a73f1b0a228b47b74997bdb8c27d1901cece459e/jsf-project/src/main/webapp/exemplos/select/select-categoria.xhtml) e nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/master/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/SelectBean.java). Mas para a esta funcionalidade realmente funcionar, criamos um [Converter](https://github.com/wapmesquita/formacao-jsf/blob/a73f1b0a228b47b74997bdb8c27d1901cece459e/jsf-project/src/main/java/br/com/dxt/jsfproject/converter/CategoriaConverter.java). Estas alteracoes podem ser encontradas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/a73f1b0a228b47b74997bdb8c27d1901cece459e).

# ValueChangeListener

Agora veremos um exemplo de como disparar um evento apos alterar o valor de um campo. Para isso criamos o metodo em nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/e5f045bf09a68fdc84148a3000521907d6d96e54/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/SelectBean.java) e linkamos este metodo com o campo em nosso [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/e5f045bf09a68fdc84148a3000521907d6d96e54/jsf-project/src/main/webapp/exemplos/select/select-categoria.xhtml). As alteracoes podem ser visualizadas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/e5f045bf09a68fdc84148a3000521907d6d96e54).


# Escopos

Em JSF podemos trabalhar com os ManageBeans em alguns tipos de escopos direfentes. Agora veremos as diferencas entre escopos dos tipos Session e Request.
Para ver essa diferenca temos que criar um ManageBean para cada tipo de escopo - [Session](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/SessionBean.java) e [Request](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/RequestBean.java) - e criamos dois arquivos *.xhtml* para visualizar o comportamento - [Primeiro para inserir os dados](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/webapp/exemplos/scopes/first.xhtml) e o [Segundo para visualizar os dados](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/webapp/exemplos/scopes/second.xhtml). Todas as alteracoes podem ser visualizadas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/eb06cf3e8a769512d63a6372641872a9538952f7).
