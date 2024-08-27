# Sistema de Xadrez em Java

Este é um projeto de um sistema de xadrez desenvolvido em Java. O objetivo deste projeto é simular um jogo de xadrez no console, permitindo que dois jogadores humanos joguem entre si.

## Funcionalidades

- **Tabuleiro de Xadrez**: Representação do tabuleiro 8x8 com todas as peças.
- **Movimentos das Peças**: Implementação das regras de movimento para todas as peças do xadrez (rei, rainha, bispo, cavalo, torre e peão).
- **Verificação de Xeque e Xeque-Mate**: O sistema identifica quando um rei está em xeque ou em xeque-mate.
- **Promoção de Peão**: Quando um peão alcança a última fileira do tabuleiro, ele pode ser promovido a outra peça (rainha, torre, bispo ou cavalo).
- **Captura En Passant**: Implementação da regra especial de captura en passant para peões.
- **Roque**: Implementação das duas variações de roque (roque pequeno e roque grande).
- **Controle de Turno**: Alternância de turnos entre os jogadores, com indicação de qual jogador está em xeque.
- **Peças Capturadas**: Exibição das peças capturadas ao longo do jogo.

## Como Funciona

O jogo é executado diretamente no console, onde os jogadores inserem as coordenadas das peças para movimentá-las. O sistema valida as jogadas, verifica as regras de xadrez e informa os jogadores sobre situações de xeque e xeque-mate.

### Estrutura do Projeto

- **application**: Contém a classe principal `Program` que inicializa o jogo e a interface `UI` para interação com o usuário.
- **boardgame**: Define as classes genéricas relacionadas ao tabuleiro e às peças, como `Board`, `Piece`, e `Position`.
- **chess**: Contém as classes específicas do jogo de xadrez, como `ChessMatch`, `ChessPiece`, `ChessPosition`, e as enumerações.
- **chess.pieces**: Contém as classes para cada tipo de peça (rei, rainha, bispo, cavalo, torre e peão), com suas respectivas regras de movimento.

## Implementações

- Movimentos de todas as peças conforme as regras do xadrez.
- Verificações de xeque e xeque-mate.
- Implementação dos movimentos especiais: roque, promoção de peão e en passant.
- Exibição do estado atual do jogo e das peças capturadas.

Este projeto foi desenvolvido para fins de aprendizado e prática de programação orientada a objetos em Java, focando na implementação das regras e funcionalidades do xadrez.
