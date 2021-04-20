
<h1 align="center"> back-end-marvel </h1>

<p align="center">Back-End-Marvel Java Spring Boot </p> 

## Como baixar:
  
O download do projeto pode ser realizado diretamente do site do Git, ou via Git Bash.</p>


## Compilação: 

Para compilar o projeto poderá ser utilizado os comandos do Maven "clean package"


## Testes: 

Os testes do projeto podem ser realizado utilizando o Postman para os endpoints a seguir:

* `https://localhost:9001/v1/public/characters`
* `http://localhost:9001/v1/public/characters/{characterId}`
* `http://localhost:9001/v1/public/characters/{characterId}/comics`
* `http://localhost:9001/v1/public/characters/{characterId}/events`
* `http://localhost:9001/v1/public/characters/{characterId}/series`
* `http://localhost:9001/v1/public/characters/{characterId}/stories`
  
#### Obs: 
* A aplicação está definida para rodar na porta 9001. Caso necessário, poderá ser alterado no arquivo application.properties.
* Foi desenvolvidada utilizando SpringBoot. Recomendado utilizar o Spring Tool Suite ou uma IDE com plugin para o SpringBoot.


## Base de Dados: 

Está sendo utilizado o bando de dados H2. Os dados para conexão também estão descritos no arquivo application.properties.


## Carga de Dados: 

Em resources existe o arquivo data.sql que foi utilizado para criar uma massa de dados inicial ao subir a aplicação.
