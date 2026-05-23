# Memoria-segura
Projeto BackEnd em Java para Sistema de Apoio ao Cuidado de Idosos. 

# 👴👵 Sistema de Apoio a Idosos
Sistema em Java para apoio ao cuidado de idosos, com foco em controle de medicamentos, agenda de atividades e alertas baseados em horários.


## 📌 Sobre o Projeto
O **Sistema de Apoio a Idosos** foi desenvolvido para facilitar o acompanhamento diário de idosos, permitindo organizar:

- 💊 Medicamentos e dosagens  
- ⏰ Horários de administração  
- 📋 Atividades diárias  
- 🔔 Alertas automáticos baseados em tempo  

O objetivo é tornar a rotina mais segura, organizada e previsível.

---

## ⚙️ Funcionalidades

### 💊 Medicamentos
- Cadastro de medicamentos
- Definição de dosagem
- Configuração de horários
- Listagem de medicamentos cadastrados

### ⏰ Agenda
- Organização de rotina diária
- Associação de atividades por horário
- Visualização simplificada da programação

### 🔔 Alertas
- Notificações baseadas em horário atual
- Verificação automática de medicamentos pendentes
- Exibição de mensagens no console

---

## 🧱 Arquitetura do Projeto

src/
├── model/
│ ├── Idoso.java
│ ├── Medicamento.java
│ ├── Atividade.java
│
├── service/
│ ├── MedicamentoService.java
│ ├── AgendaService.java
│ ├── AlertaService.java
│
├── main/
│ ├── Main.java


---

## 🚀 Como Executar

### 🔧 Pré-requisitos
- Java 11+
- IDE (IntelliJ, Eclipse ou VS Code)

### ▶️ Execução
```bash
# Clonar repositório
git clone https://github.com/seu-usuario/sistema-idosos.git

# Entrar no diretório
cd sistema-idosos

# Compilar
javac main/Main.java

# Executar
java main.Main


## 📋 Regras de Negócio
Cada idoso pode ter múltiplos medicamentos
Um medicamento pode ter vários horários
Alertas são baseados no horário atual do sistema
Não são permitidos horários inválidos ou vazios


## 🛠️ Tecnologias Utilizadas
☕ Java (POO)
📦 Java Collections (List, Map)
⏱️ Scheduler / Timer (opcional)
💻 Aplicação em console (CLI)


## 📈 Melhorias Futuras
🖥️ Interface gráfica (JavaFX / Swing)
🗄️ Persistência em banco de dados (MySQL / SQLite)
📱 Versão mobile
🔔 Notificações em tempo real
📊 Relatórios de adesão ao tratamento


## 👨‍💻 Autor
Projeto acadêmico desenvolvido para estudo de Programação em Java Orientada a Objetos aplicada à área da saúde.

## 📄 Licença
Este projeto está sob a licença MIT.
