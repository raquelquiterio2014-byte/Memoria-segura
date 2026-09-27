# Memória Segura — módulos acadêmicos

Coleção de exercícios e protótipos de um sistema de apoio à rotina de cuidados com idosos. Há módulos Java independentes em `projeto-java/` (agenda, alerta de medicamento, cadastro, comunicação, painéis e registro de ocorrências) e um protótipo de front-end. **Não há um único aplicativo integrado nem um build na raiz.**

## Estrutura

Cada pasta de `projeto-java/` possui seu próprio conjunto de classes e, em vários casos, um `Main.java` e notas locais. Algumas classes têm o mesmo nome em módulos diferentes; compile cada pasta separadamente, não todos os arquivos juntos.

Exemplo de módulo a explorar: `projeto-java/Agenda de Atividades/`, com `Main.java`, `Atividade.java` e `StatusAtividade.java`. Com um JDK instalado, entre nessa pasta e use `javac *.java` e `java Main`. A compilação Java não foi executada nesta revisão porque o ambiente de verificação não tem `javac`.

## Limites

Os módulos são estudos de programação orientada a objetos. Não são um sistema clínico, não demonstram persistência compartilhada ou notificações médicas confiáveis. O documento Word na raiz registra a documentação acadêmica. Use dados fictícios ao demonstrar o projeto. Licença: consulte `LICENSE`.
