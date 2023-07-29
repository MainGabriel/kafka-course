
<h2>📈 Sobre o projeto</h2> 

O projeto é uma aplicação baseada em microserviços Spring que se comunica através do Apache Kafka para processamento de eventos em tempo real. Utiliza o H2 para fins de desenvolvimento, conta com o Lombok para redução de código repetitivo, e gerencia suas dependências e construção com o Maven. O Schema Registry e Rest-Proxy garantem a compatibilidade entre produtores e consumidores do Kafka, enquanto os containers proporcionam uma implantação ágil e escalável do sistema. Através de uma interface de monitoramento, é possível acompanhar a saúde do ecossistema e o fluxo de eventos em tempo real.

Tecnologias Utilizadas:

### Tópicos, Partições e Offsets:
O projeto utiliza o Apache Kafka, uma plataforma de streaming distribuída, para a implementação de tópicos, que são canais de comunicação para os eventos. Os tópicos são divididos em partições, permitindo a distribuição e paralelização do processamento. Cada mensagem em um tópico tem um offset, um identificador único que representa a posição da mensagem na partição.

### Interface para Monitoramento:
Para monitorar o fluxo de eventos e o desempenho do sistema, é utilizada uma interface de monitoramento, que pode ser implementada por meio de ferramentas como Grafana, Dynatrace ou alguma solução personalizada baseada em métricas e logs do Kafka e dos componentes Spring.

### Produtores e Consumidores:
No projeto, há a presença de produtores e consumidores do Kafka. Os produtores são responsáveis por enviar os eventos para os tópicos, enquanto os consumidores capturam, processam e armazenam os eventos. Esses consumidores podem ser implementados como microserviços Spring, que consomem e processam os eventos em tempo real.

### Ecossistema Spring e Lombok:
O ecossistema Spring é amplamente utilizado para o desenvolvimento do projeto. O Spring Framework oferece suporte à criação de aplicativos Java empresariais e simplifica várias tarefas, como a configuração da injeção de dependência, o acesso a bancos de dados e a criação de APIs RESTful. Além disso, a biblioteca Lombok é empregada para reduzir a verbosidade do código, gerando automaticamente métodos como getters, setters e construtores.

### Maven:
O Maven é uma ferramenta de automação de compilação amplamente usada para gerenciar as dependências e o ciclo de vida do projeto. É utilizado para a construção, gerenciamento de dependências e empacotamento do aplicativo, garantindo um processo de desenvolvimento mais organizado e eficiente.

### H2:
O H2 é um banco de dados relacional leve e de código aberto, que é utilizado neste projeto para fins de desenvolvimento e testes. Sua natureza em memória torna-o uma ótima escolha para cenários de testes unitários e integração, além de ser facilmente substituível por um banco de dados mais robusto em ambientes de produção.

### Schema-Registry e Rest-Proxy:
O Schema Registry é uma ferramenta que permite armazenar e gerenciar esquemas de dados para garantir a compatibilidade entre produtores e consumidores do Kafka. O Rest-Proxy, por sua vez, é uma interface HTTP que facilita a integração de aplicativos não nativos do Kafka com a plataforma, permitindo o envio e recebimento de mensagens através de chamadas RESTful.

### Containers:
A tecnologia de containers é utilizada para empacotar e distribuir os componentes do projeto de forma isolada e portátil. O Docker é frequentemente utilizado para criar e gerenciar esses containers, permitindo a execução dos serviços de forma consistente e independente do ambiente de hospedagem.(ver arquivos docker-compose).

Backend
- [x] Apache Kafka - teoria e prática
- [x] Produtores com spring kafka
- [x] consumidores com spring kafka
- [x] Nivelamento Docker
- [X] Subindo kafka e zookeeper via container
- [X] Entendendo Schema-registry
- [X] Entendendo rest-proxy
- [X] Exemplo real completo utilizando kafka, zookeeper, Schema-registry, rest-proxy via container e 
- [X] ecossistesma spring
- [X] Entendendo kafdrop