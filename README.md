# COMP_24_1
 
- Repositório feito para a matéria de Compiladores ofertada pelo docente Daniel Lucrédio ministrada durante o período letivo 2024-1

- Contribuidores:
    - Gabriel Lourenço de Paula Graton - 800432
    - Vitor Matheus da Silva - 800260
    - Rafael Naoki Arakaki Uyeta - 800207

# Considerações Iniciais

Algumas considerações sobre como rodar o projeto sem nenhuma complicação, indicando possíveis caminhos para a instalação das ferramentas necessárias.

Aqui será preciso instalar as ferramentas - java, maven e uma IDE de preferência. Os instegrantes optaram pelas versões e ferramentas:

- Java: 11 ou 22
- Maven: 3.9.6
- Code: Visual Studio Code

## Windows

- Será preciso instalar o java - https://www.java.com/pt-BR/ - priorize o uso das versões 11 até 22.
- Além disso, é preciso instalar o mvn - https://maven.apache.org/download.cgi - utilizando a versão .zip
- Para o VSCode, é preciso ir na Microsoft Store, pesquisa-lo e instala-lo 

**Ajudas**
- Para facilitar a instalação do java - https://www.youtube.com/watch?v=cc9UUnPYs0I&t=5s
- Para facilitar a instalação do mvn - https://www.youtube.com/watch?v=km3tLti4TCM

## Linux - Ubuntu
- Para a instação do java, é possível instalar seguindo este documento - https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-20-04:

```
# Verificar se há alguma versão
sudo apt update
java -version
```

```
# Verificar se há alguma versão
sudo apt update
java -version
```

```
# Instalar java 11 jre
sudo apt install default-jre
java -version

```

```
# Instalar java 11 jdk
sudo apt install default-jdk
javac -version

```
- Para a instalação do maven, é possível instalar seguindo este documento - https://vanessuniq.medium.com/installing-the-latest-apache-maven-on-ubuntu-e71fe47aa204
- Para instalar o VSCode, é preciso somente dar o comando:

```
sudo apt install code
``` 

**Com isso tudo pronto, podemos seguir para a aplicação !**


# T1

- Para abrir o trabalho, será preciso realizar uma série de etapas, especificadas através do roteiro desenvolvido pelo próprio professor https://github.com/dlucredio/cursocompiladores/blob/master/exemplosCodigo/Compiladores.Tópico02.Análise%20Léxica.roteiro.md:

1. Abrir o repositório, entrar na pasta T1 e abri-la pela sua IDE de preferência.
2. Com o projeto aberto, entrar na pasta t1 e abrir o terminal
3. Ao abrir, verifique a presença do Java e do Maven e suas respectivas versões digitando no terminal os seguintes comandos.

```
java --version
mvn -v
``` 

4. Caso tenha dado errado ou as versões não batam, volte para as Considerações Iniciais. Com tudo certo, prossiga.
5. Para garantir, execute na seguinte ordem

```
# Limpar o mvn - Apenas para garantir
mvn clean

# Buildar
mvn package

# Rodar - a 
java -jar {PATH ATÈ A PASTA}\COMP_24_1\T1\t1\target\t1-1.0-SNAPSHOT-jar-with-dependencies.jar  {PATH ATÉ O ARQUIVO PARA O ANALISADOR LEXICO}

```



java -jar \Users\ggrat\OneDrive\Documentos\GitHub\COMP_24_1\T1\t1\target\t1-1.0-SNAPSHOT-jar-with-dependencies.jar \Users\ggrat\OneDrive\Documentos\GitHub\COMP_24_1\T1\testes\teste.txt
