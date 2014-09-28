Example codes in JSF

# Starting Project

## Archetype
Execute command below to create a maven web project:

	mvn archetype:generate -DgroupId={project-packaging} -DartifactId={project-name} -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

## Dependencies
[Mojarra JSF Dependecy](https://javaserverfaces.java.net/download.html)

[PrimeFaces Dependency](http://primefaces.org/downloads)

## Jetty Plugin

[Tutorial Getting Start](http://www.eclipse.org/jetty/documentation/current/maven-and-jetty.html)

You can find the diff of configuration in this [commit](https://github.com/wapmesquita/formacao-jsf/commit/ee8f9b09fccfcf85e08b00829d999dbce2720a0b)

After that you need to add JSF dependecies in Jetty Plugin as in this [commit](https://github.com/wapmesquita/formacao-jsf/commit/2464a102726ce53688ffcf4203eb5463cd14b66f)

# First Pages

* Configure project and create my first JSF page - [HowTo](https://github.com/wapmesquita/formacao-jsf/commit/3b838da3eb0b0b5038b1215ca94f7f5bc1ffd67c)

* Create my fist ManageBean - [HowTo](https://github.com/wapmesquita/formacao-jsf/commit/232d5f90af70aaa7c115ae10f927599c971273eb)

# Using [PrimeFaces](http://www.primefaces.org/)

This section we will see how use PrimeFaces component.

## First test

Changing index.xhtml to use PrimeFaces component - [HowTo](https://github.com/wapmesquita/formacao-jsf/commit/938211895761902dff7589187e3feb0771c7afd8)

## Changing PrimeFaces [Themes](http://www.primefaces.org/themes)

In this [example](https://github.com/wapmesquita/formacao-jsf/commit/e455efc6c96843a9ffffbd42f39e60b366f0a77b) you can see how to use PrimeFaces theme.
