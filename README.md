# food-ordering-system
Microservice - Clean Architecture 

### generate graph command

![](target/dependency-graph.png)

mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"
