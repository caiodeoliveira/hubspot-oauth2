#  🔒 hubspot-oauth2 🔓

## Sistema de integração com o Hubspot via OAuth2.

## As instruções desse README destinam-se a outros desenvolvedores (estou assumindo que já tenham o Git instalado em máquina).

## Ferramentas necessárias:

### IDE: <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="5%"/> **IntelliJ IDEA Community Edition** <br>

### JDK (Java Developer Kit) <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="8%"/>

## Passo a passo para rodar o projeto:

### 1 - Antes de tocarmos no projeto, vamos preparar o ambiente necessário. Podemos começar com a instalação e configuração do JDK (Escolha uma versão 8+). Siga o seguinte passo a passo: https://www.devmedia.com.br/instalacao-e-configuracao-do-pacote-java-jdk/23749

### 2 - Agora, acesse o site da JetBrains, role um pouco para baixo e baixe a intelliJ Community Edition (versão gratuida da IDE): https://www.jetbrains.com/idea/download

### 3 - Crie uma conta de cliente no Hubspot: https://app.hubspot.com/signup-hubspot/crm?hubs_signup-cta=login-signup-cta&hubs_signup-url=app.hubspot.com%2Flogin&uuid=1949d445-0ba5-4527-90c4-82114e32582d&step=landing_page

### 4 - Para baixar o projeto numa pasta, clique com o botão direito do mouse, clique na opção "Mostrar mais opções", depois clique em "Open Git Bash here" ou "Abrir Git Bash aqui".<br>

### 5 - Execute o seguinte comando: git clone https://github.com/caiodeoliveira/hubspot-oauth2.git<br>

### 6 - (Caso tenha baixado a IDE) Ao abrir o intelliJ, clique na opção "Open" e navegue até a pasta do projeto | Caso já tenha a IDE e algum projeto aberto, abra sua intelliJ IDE, acesse o menu dropdown no canto superior esquerdo clique em "open..." e navegue até o projeto baixado.<br>

### 7 - Agora clique no menu "m" (Maven) na barra lateral direita da IDE, vá em "Integration" > Lifecycle.<br>

### 8 - Execute os comandos "clean e install": selecione o "clean e o install" e clique na seta verde na barra de ações da Janela do Maven:

![mvn clean   install](https://github.com/user-attachments/assets/196719cd-cb0f-4cff-aa41-37720c7542d6)

### Isso vai limpar do projeto arquivos de compilações anteriores que podem interferir na execução do projeto e gerar uma nova compilação.

### 9 - Crie uma configuração de "run": Na barra superior no lado direito da IDE, clique nos três pontos e selecione opção "Edit". Ao abrir a janela:
####  1 - clique no + na parte superior da janela e selecione a opção "Application".
####  2 - Dê um nome para a configuração (é comum usar o nome do módulo, nesse caso, "integration"). em "Build and run", no primeiro campo, escolha o SDK de sua preferência. No segundo campo, selecione o módulo que vai ser executado (nesse       caso, integration).
####  3 - No campo em seguida (Main class), clique no menu na parte direita do input ("browse...") e selecione a classe "IntegrationApplication". Clique em "Apply" e "OK".

#### Segue o print de exemplo das configurações de Run (no meu caso, usei o SDK correto-17):

![Imagem do WhatsApp de 2025-05-01 à(s) 21 28 55_b3aedfd5](https://github.com/user-attachments/assets/c36b0117-b95e-4e86-8726-57d7cb3b72e1)

#### Feito isso, podemos rodar nossa aplicação:

![Imagem do WhatsApp de 2025-05-01 à(s) 21 32 47_7c4c794d](https://github.com/user-attachments/assets/8cf7e9d8-49b4-4b47-b891-43af975f4e62)



