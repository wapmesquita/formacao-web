Example codes in JSF

# Stating Project

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

# Fist Pages

  1. Configure project and create my first JSF page - [HowTo](https://github.com/wapmesquita/formacao-jsf/commit/3b838da3eb0b0b5038b1215ca94f7f5bc1ffd67c)

  2. Create my fist ManageBean - [HowTo](https://github.com/wapmesquita/formacao-jsf/commit/232d5f90af70aaa7c115ae10f927599c971273eb)
