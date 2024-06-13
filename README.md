# JokeAPI Consumer

Este é um projeto simples de uma aplicação que consome a API de piadas (jokes) do site [JokeAPI](https://sv443.net/jokeapi/v2/), focando exclusivamente em piadas sobre programação.

## Funcionalidades

- **Consumo da API**: A aplicação consome a API do JokeAPI para obter piadas sobre programação.
- **Exibição no Console**: As piadas obtidas são exibidas no console da aplicação.
- **Atualização Periódica**: A cada 10000ms (10 segundos), a aplicação busca uma nova piada e a exibe no console.

## Como Usar

1. Clone este repositório em sua máquina local usando o seguinte comando:

    ```bash
    git clone https://github.com/Nicholas-Cardoso/Jokes.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd jokeapi
    ```

3. Execute a aplicação:

    ```bash
    ./gradlew run
    ```

4. A aplicação começará a buscar e exibir piadas sobre programação no console. Você verá uma nova piada a cada 10 segundos. E ele automaticamente limpará o console para a chegada de uma nova piada.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um issue ou enviar um pull request com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
