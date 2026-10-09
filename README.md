# Memória Segura

Projeto acadêmico de apoio à rotina de cuidados com idosos, com módulos independentes em **Java** e um protótipo de painel em **HTML, CSS e JavaScript**. Os exemplos exploram programação orientada a objetos, listas, menus de console e organização de rotinas.

O repositório ainda não possui um aplicativo integrado: cada módulo Java tem suas próprias classes e deve ser compilado separadamente. O painel web depende de uma API que não está incluída.

## Módulos

Todas as pastas abaixo ficam em `projeto-java/`.

| Pasta | O que demonstra |
| --- | --- |
| `Agenda de Atividades` | Cadastro, listagem e alteração de status das atividades |
| `Alerta de Medicamento` | Cadastro de medicamento e alertas no console com temporizadores |
| `Cadastro de Usuários/CadastrodeUsuario` | Cadastro e listagem de pessoas em memória |
| `Comunicação entre Cuidador e Família` | Registro e consulta de mensagens em memória |
| `Painel do Cuidador` | Resumo no console com dados de exemplo |
| `Painel do Idoso` | Consulta de rotina, conclusão de atividades e simulação de pedido de ajuda |
| `Registro de Ocorrências e Relatório` | Relatório diário no console com dados de exemplo |
| `Front End 1` | Protótipo visual que solicita dados de uma API local |

## Executar no Windows

Instale um **JDK 17** e verifique no Prompt de Comando:

```bat
java -version
javac -version
```

Se `java` funcionar e `javac` não, confira a instalação do JDK e a variável `PATH`.

Baixe o repositório em **Code → Download ZIP** e extraia os arquivos. Abra um Prompt de Comando na pasta extraída e execute, por exemplo:

```bat
cd "projeto-java\Agenda de Atividades"
javac -encoding UTF-8 *.java
java -Dfile.encoding=UTF-8 Main
```

Para testar outro módulo, abra um novo terminal na raiz e substitua a pasta pela correspondente na tabela. Todos os módulos Java possuem uma classe `Main`. **Não compile todos juntos:** nomes como `Main`, `Usuario` e `Medicamento` se repetem em módulos diferentes.

No IntelliJ IDEA ou Eclipse, abra cada módulo como um projeto separado, selecione o JDK 17 e execute seu `Main.java`. No Linux/macOS, o exemplo é equivalente usando `/` no caminho.

## Painel web

Abra `projeto-java/Front End 1/index.html` no navegador. O JavaScript tenta acessar `http://localhost:8080/api/dashboard`. Sem um backend disponível, o painel informa que a API está indisponível e os cartões mostram que os dados não foram carregados.

A resposta esperada contém as propriedades `medicamentos`, `rotina`, `ocorrencias`, `alertas`, `mensagens` e `relatorio`. Um futuro backend também precisará permitir o acesso pela origem do painel. Os itens do menu lateral são elementos visuais e ainda não possuem navegação implementada.

## Verificação

Com Python 3 e JDK 17 instalados, execute na raiz:

```bat
python scripts/check_modules.py
```

O script compila os sete módulos em diretórios temporários separados e executa seis exemplos de console, incluindo cadastro, conclusão de atividade e troca de mensagens. O módulo de medicamento é somente compilado; a pontualidade dos alertas não é testada. O workflow `Java modules` executa a mesma verificação no GitHub Actions.

As correções desta revisão incluem três chaves de fechamento ausentes e a renomeação do cadastro para `Main.java`, removendo também o espaço final no nome da pasta. A compilação local não foi executada no ambiente desta revisão, que não possui `javac`; consulte o resultado do workflow para a evidência de compilação.

## Limitações e próximos passos

- Os dados ficam em memória e não são compartilhados entre módulos.
- Não há autenticação, banco de dados ou integração de notificações externas. Telefones cadastrados não recebem mensagens.
- Pedir ajuda apenas imprime uma simulação no console.
- No agendador atual, horários de alerta já passados são disparados imediatamente; os temporizadores exigem revisão de ciclo de vida. Use `Ctrl+C` para encerrar esse módulo.
- Os menus esperam entradas numéricas válidas; tratamento de entradas inválidas ainda precisa ser desenvolvido.
- Próximas melhorias: validação de entradas, testes do agendador, persistência e integração entre os módulos e o painel.

Os exemplos são acadêmicos, usam dados fictícios e não foram validados para uso clínico ou operação real de cuidados.

## Documentação e licença

O arquivo Word na raiz contém a documentação acadêmica original. A licença do repositório está em [LICENSE](LICENSE).
