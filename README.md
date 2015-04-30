# JavaRMI
Aula prática sobre Java RMI - Sistemas Operacionais II

Os arquivos devem estar no diretório appcalculadora.

<b>$ jar cvf classes.jar appcalculadora/*.class</b>

Depois disso é necessário chamar o rmiregistry

<b>$ rmiregistry</b>

e, então, rodar as aplicações cliente e servidor:

<b>$ java -cp classes.jar -Djava.rmi.server.codebase=file://home/aluno/Desktop/classes.jar -Djava.security.policy=appcalculadora/java.policy appcalculadora/Servidor</b>

<b>$ java -cp classes.jar -Djava.rmi.server.codebase=file://home/aluno/Desktop/classes.jar -Djava.security.policy=appcalculadora/java.policy appcalculadora/Cliente</b>
