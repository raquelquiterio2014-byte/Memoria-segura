const campos = ["medicamentos", "rotina", "ocorrencias", "alertas", "mensagens", "relatorio"];

async function carregarDashboard() {
    try {
        const resposta = await fetch("http://localhost:8080/api/dashboard");
        if (!resposta.ok) throw new Error("HTTP " + resposta.status);
        const dados = await resposta.json();
        for (const campo of campos) {
            document.getElementById(campo).textContent = dados[campo] ?? "Sem dados disponíveis.";
        }
        document.getElementById("status-api").textContent = "Dados recebidos da API local.";
    } catch (erro) {
        document.getElementById("status-api").textContent =
            "API local indisponível. Este repositório contém somente o protótipo visual; o backend não está incluído.";
        for (const campo of campos) {
            document.getElementById(campo).textContent = "Dados indisponíveis — conexão com a API necessária.";
        }
    }
}

carregarDashboard();
