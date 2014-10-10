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

## Converter nativos

Já temos bastente coisa pronta para alguns tipos de dados. É possível visualizar como utilizar converters de número e data neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/02bd3b571e8a9c32f74221ba73cb11f3ab93bb16)

# Equals e HashCode

Algumas vezes podemos nos deparara com situações que temos que utilizar diferentes instâncias de um objeto em um mesmo ManageBean.

  **Exemplo**
  
  Temos um combo que exibe uma lista resultante de uma consulta ao banco de dados e criamos um converter cujo método *getAsObject* é escrito desta forma:

	@Override
	public Object getAsObject(FacesContext ctx, 
			UIComponent component, String idString) {
		if (idString == null || idString.trim().equals("")) {
			return null;
		}
		long id = Long.parseLong(idString);
		return new CategoriaService().findById(id);
	}

  Nesse caso, o objeto que retornamos em nosso método é diferente do objeto em nossa lista utilizada para preencher o combo. Para que nosso código funcione, precisamos implementar os métodos **equals e hashcode** em nossa classe de domínio, nesse caso, *Categoria.java*. Veja como foi implementado neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/8692f2384543d6bda7879db7b538752fbadbd958).

# ValueChangeListener

Agora veremos um exemplo de como disparar um evento apos alterar o valor de um campo. Para isso criamos o metodo em nosso [ManageBean](https://github.com/wapmesquita/formacao-jsf/blob/e5f045bf09a68fdc84148a3000521907d6d96e54/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/SelectBean.java) e linkamos este metodo com o campo em nosso [.xhtml](https://github.com/wapmesquita/formacao-jsf/blob/e5f045bf09a68fdc84148a3000521907d6d96e54/jsf-project/src/main/webapp/exemplos/select/select-categoria.xhtml). As alteracoes podem ser visualizadas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/e5f045bf09a68fdc84148a3000521907d6d96e54).

# Escopos

Em JSF podemos trabalhar com os ManageBeans em alguns tipos de escopos direfentes. Agora veremos as diferencas entre escopos dos tipos Session e Request.
Para ver essa diferenca temos que criar um ManageBean para cada tipo de escopo - [Session](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/SessionBean.java) e [Request](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/RequestBean.java) - e criamos dois arquivos *.xhtml* para visualizar o comportamento - [Primeiro para inserir os dados](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/webapp/exemplos/scopes/first.xhtml) e o [Segundo para visualizar os dados](https://github.com/wapmesquita/formacao-jsf/blob/eb06cf3e8a769512d63a6372641872a9538952f7/jsf-project/src/main/webapp/exemplos/scopes/second.xhtml). Todas as alteracoes podem ser visualizadas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/eb06cf3e8a769512d63a6372641872a9538952f7).

# Informando o sucesso (Mensagens de sucesso)

É possível informar ao usuário que uma ação executada ocorreu com sucesso, ou teve algum problema. Podemos utilizar o **FacesMessage**. Essas mensagens poderão ser visualizadas no componente p:messages. É possível visualizar como inserir mensagens no FacesContext neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/b4a265c32fb1995fdb8c55142d8714800e56c128).

# Validador Personalizado

Tem algumas páginas que não é possível validar os dados apenas com os validadores nativo do JSF como; *f:validateLength, validateLongRange, validateRegex, entre outros*. Neste caso, é necessário criar nosso próprio validador. Este [commit](https://github.com/wapmesquita/formacao-jsf/commit/129b78d1d5c408a4a294bf715e827c287c6f82d0) mostra como criar um EmailValidator.

# Serializable

**Quando implementar a interface Serializable?**

Em JSF, todo objeto de sessão fica salvo em sua SessionScope. Basicamente, todo atributo utilizado em sessão deveria implementar esta interface. Esta implementação permite que o servidor onde está sua aplicação possa ser reiniciado e seus objetos de sessão restaurados.

# PhaseListener

Agora implementaremos um exemplo de PhaseListener para simular um login na aplicacao. Para este exemplos temos os Beans [UserBean](https://github.com/wapmesquita/formacao-jsf/blob/353fb4e3fcbe1e7f8c98416bf3c0958c5c3f7f5c/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/UserBean.java) e [LoginBean](https://github.com/wapmesquita/formacao-jsf/blob/353fb4e3fcbe1e7f8c98416bf3c0958c5c3f7f5c/jsf-project/src/main/java/br/com/dxt/jsfproject/mb/LoginBean.java) onde tambem e implementado o nosso PhaseListener.
Tambem devemos configurar nosso [faces-config.xml](https://github.com/wapmesquita/formacao-jsf/blob/353fb4e3fcbe1e7f8c98416bf3c0958c5c3f7f5c/jsf-project/src/main/webapp/WEB-INF/faces-config.xml) e entao construir nossa pagina de [login](https://github.com/wapmesquita/formacao-jsf/blob/353fb4e3fcbe1e7f8c98416bf3c0958c5c3f7f5c/jsf-project/src/main/webapp/login.xhtml). Pronto! Nosso PhaseListener esta implementado. Todas as alteracoes podem ser visualizadas neste [commit](https://github.com/wapmesquita/formacao-jsf/commit/353fb4e3fcbe1e7f8c98416bf3c0958c5c3f7f5c).
