# HtmlAnalyzer – Extração de Texto no Maior Nível de Profundidade HTML

## Descrição

O **HtmlAnalyzer** é um programa desenvolvido em **Java** que acessa uma URL fornecida via linha de comando, lê o conteúdo HTML da página e identifica o trecho de texto localizado no **nível mais profundo da hierarquia de tags HTML**.

O projeto foi implementado seguindo regras específicas de parsing e validação estrutural de HTML, sem utilizar bibliotecas externas ou APIs nativas do Java para manipulação de HTML, XML ou DOM. Toda a lógica de controle de profundidade, empilhamento de tags e detecção de HTML malformado é feita manualmente.

---

## Como instalar e rodar o projeto

O projeto foi desenvolvido para ser executado localmente via **linha de comando**, utilizando apenas o **Java JDK 17**.

## Pré-requisitos
- Java JDK 17 instalado
- Variável de ambiente `JAVA_HOME` configurada corretamente
- Acesso a internet para leitura do HTML via URL

## Passo a passo

1. Certifique-se de que os seguintes arquivos estão no mesmo diretório:
   - `HtmlAnalyzer.java`
   - `DeepTextFinder.java`

2. Abra o terminal e navegue até o diretório onde estão os arquivos.

3. Compile o programa:
- `javac HtmlAnalyzer.java`

4. Execute o programa informando uma URL válida:
- `java HtmlAnalyzer https://exemplo.com/pagina.html`

## Lógica de funcionamento

A análise do HTML é realizada de forma linear, linha por linha, seguindo as premissas do problema:

- Cada tag de abertura incrementa o nível de profundidade e é armazenada em uma pilha
- Cada tag de fechamento reduz a profundidade e é validada contra a pilha de abertura
- Trechos de texto são avaliados apenas quando estão dentro de pelo menos uma tag
- O texto associado ao maior nível de profundidade encontrado é armazenado como resultado
- Caso a estrutura de abertura e fechamento das tags seja inválida, o HTML é considerado malformado

## Saídas possíveis

1. Um trecho de texto, caso o HTML seja válido

2. malformed HTML, caso a estrutura esteja incorreta

3. URL connection error, caso não seja possível acessar a URL informada

## Estrutura do projeto

1. `HtmlAnalyzer.java`
<br>Responsável por validar a entrada, criar a URL e iniciar a análise.

2. `DeepTextFinder.java`
<br>Responsável pela leitura do HTML, controle de profundidade, validação estrutural e extração do texto mais profundo.

