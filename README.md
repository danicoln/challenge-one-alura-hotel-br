# Challenge ONE | Java | Back-end | Hotel Alura

<p align="center" >
     <img width="400" heigth="400" src="https://user-images.githubusercontent.com/101413385/173164615-192ca98a-1a44-480e-9229-9f82f456eec8.png">

</p>

---

#### 🔹 Visite a página do desafio clicando aqui! [Link do Challenge](https://www.alura.com.br/challenges/oracle-one-back-end/hotelalura) 📃 
</br>

## 🖥️ Tecnologias Utilizadas:

- Java 17
- IntellijIDEA
- MySql
- Biblioteca JCalendar
</br>

---
## ⚠️ Importante! ⚠️

☕ 
#### Para este desafio, concentrei-me na parte lógica e de conexão com o Banco de Dados. 
</br>


---


## 🔍 Analisando o repositório!

### Usei o repositório base para o desenvolvimento do backend. Voce pode acessá-lo <a href="https://github.com/alura-challenges/challenge-one-alura-hotel-br">aqui</a>.
</br>


## 📅 JCalendar

Após importar para o seu editor, é necessário instalar a biblioteca <strong>JCalendar</strong>, caso contrário o projeto apresentará um erro e não será possível abrir a janela de <strong>Reservas</strong>. </br>

Para instalar, você precisa baixar o pacote através desse link:
🔹 [Link para o JCalendar](https://toedter.com/jcalendar/)

<p align="center" >
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/101413385/169592420-7ea798d4-b7d2-4fd6-a03c-75f0fbc2e4bc.png">
</p>

A próxima etapa será extrair os arquivos da pasta <strong>lib</strong> para uma pasta local e importar os arquivos para o Eclipse. 

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167366-664a8876-a5c9-45d1-880d-650fbd6f8b07.png">     
</p>

Arquivos da pasta <strong>lib</strong>:
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167517-ed6edd9e-7d56-486f-8d47-f50e7ee2c786.png">
</p>

Clique com o botão direito do mouse sobre o projeto localizado no <strong>Package Explorer</strong> e escolha a opção <em>Build Path</em> e <em>Configure Build Path</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167991-44b111ca-c2d6-4d83-b225-33eb2657448f.png">
</p>

O projeto estará com um aviso de erro, indicando que não existe a rota da biblioteca em seu computador. Clique em <em>Libraries</em>, em seguida em <em>Classpath</em>
selecione o arquivo do JCalendar, escolha a opção <em>Remove</em> e <em>Apply and Close</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173167817-ddbdedc5-c4a6-4f6d-bd86-f86a153d6b88.png">
</p>

Para importar o <strong>Jcalendar</strong> do seu computador, após ter "extraído" os arquivos do download, clique em <em>Classpath</em> e depois em <em>Add External JARS</em> adicione um a um e clique em <em>Apply and Close</em>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169596029-a9fa21ef-8d90-45a6-8aa2-be2d911d4074.png">
</p>

Assim, o projeto deve conter os seguintes arquivos após as importações:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173168583-f6352510-d639-40ef-8339-c161688e78a3.png">
</p>

## 🚧 Projeto

#### Ao clonar ou baixar o projeto base e ter o JCalendar instalado, você terá esta apresentação ao executar o projeto:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/91544872/189409129-1379798d-7dd2-416f-8d37-3a7c661915b9.png">

</p>

### Tela de Login e Cadastro
</br>

![Alt text](src/midia/hotel-login-cadastro.gif)

### Tela de busca e update

![Alt text](src/midia/hotel-sistema-busca.gif)

### Excluindo dados

![Alt text](src/midia/hotel-deletando-dados.gif)

## 📊 Banco de Dados

### Como importar o MySqlConnector no projeto?

É o mesmo caminho descrito para a importação do <strong>JCalendar</strong>, clicar com o botão direito do mouse em cima do projeto, <em>Build Path</em>, <em>Configure Build Path</em>, <em>Libraries</em>, <em>Add External JARs</em>. Para encontar o caminho desse aquivo <strong>.jar</strong>, vá até o disco rígido do seu computador e entre na pasta <em>Arquivos de Programas (x86)</em>.

- Arquivos de Programas (x86):
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169394-a67b528a-c8b7-4f7a-b374-a1da81b1cc5d.png">
</p>

- MySQL
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169551-b32a9978-3a05-4b6e-b077-f586d0c41e31.png">
</p>

- Connector J 8.0:

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169584-48e21a03-e70f-4a65-9197-448a3645f526.png">
</p>

- My SQL Connector Java:
<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/173169737-5f93868e-df8f-4177-90ba-faf9570758ac.png">
</p>

### Modelagem das tabelas:

Para este desafio foi proposto duas tabelas: <strong>Reservas</strong> e <strong>Hóspedes</strong>. A tabela de hóspedes deve conter a chave estrangeiro <em>(foreign key)</em> <strong>idReserva</strong>.

<p align="center" >
     <img width="500" heigth="500" src="https://user-images.githubusercontent.com/101413385/169434993-1d494d38-d122-457d-b973-52b42270114b.png">
    
</p>

<h3> Criando a Connection</h3>

<p>Utilizei como base a aula "Configurando o conector" do curso "Java e JDBC: trabalhando com um banco de dados"</p>


<h1>MySQL na linha de comando</h1>

<p>Utilizei alguns comandos no cmd do windows</p>

<h3> Logando no MySql:</h3>
<pre>
    <code>
    -u {meu-usuario} -p
    </code>
</pre>

<p>Criei as tabelas "reservas" e "hospedes" com o seguinte comando:</p>

<pre>
    <code>
    create table reservas (
        id INT AUTO_INCREMENT PRIMARY KEY, 
        data_entrada DATE, 
        data_saida DATE, 
        valor VARCHAR(255), 
        forma_pagamento VARCHAR(255));
    </code>
</pre>

<pre>
    <code>
    create table hospedes (
        id INT AUTO_INCREMENT PRIMARY KEY, 
        nome VARCHAR(255), 
        sobrenome VARCHAR(255), 
        data_nasc DATE, 
        nacionalidade VARCHAR(255), 
        telefone VARCHAR (15), 
        reserva_id INT, 
        FOREIGN KEY (reserva_id) REFERENCES reservas(id));
    </code>
</pre>

<p> Para visualizar a tabela, é com o seguinte comando:</p>

<pre>
    <code>select * from hospedes </code>
</pre>
    
## 📬 Entrega

### Como incluir meu projeto com a "#" do desafio?

1) Tenha o <strong>Fork</strong> do projeto em seu repositório no Github.
2) Utilize o tópico **#challengeonealurahotelbr4**. Vá na aba esquerda do seu projeto na seção <em>About</em> e clique na engrenagem de configuração selecione o campo **topics** e insira a etiqueta **challengeonealurahotelbr4**.


![gif-vitrine](https://user-images.githubusercontent.com/91544872/153601047-62aee6cb-e3cf-42b3-92c3-7130c996113f.gif)



<a href="https://www.linkedin.com/in/daniellincolndev/" target="_blank">
<img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

📧 lincolndeveloper@outlook.com
