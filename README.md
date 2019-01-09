‘PREMISSA 
Desenvolver camada visual com AngularJS e um serviço para tratar das 
regras de negócio 
Fique à vontade para definir a arquitetura e o modelo de persistência. 
- Linguagem: Java 
- Front-end: AngularJS 
- Injeção de dependência: Spring 
- Informações devem ser persistidas em um banco de dados. 
FLUXO DE TELA 
Criar um formulário com os seguintes campos: 
- Nome Cliente 
Tipo: texto 
- Limite de credito 
Tipo: numérico (R$) 
- Risco Tipo: lista Valores possíveis: A, B e C 
REGRAS DE NEGÓCIO 
- Todas informações devem ser persistidas mais um campo indicando a 
taxa de juros. 
- Todos campos são obrigatórios 
- Se o risco for do tipo A manter os dados informados 
- Se o risco for do tipo B, a taxa de juros deve ser de 10% 
- Se o risco for do tipo C, a taxa de juros deve ser de 20% 
