"""Compile each independent module and exercise its console entry point."""
from pathlib import Path
import subprocess
import tempfile

ROOT = Path(__file__).resolve().parents[1]
CASES = {
    "Agenda de Atividades": ("1\nCaminhada\n09:00\nExemplo\n3\n0\n2\n5\n", "CONCLUIDA"),
    "Cadastro de Usuários/CadastrodeUsuario": ("1\nPessoa fictícia\n70\n000000000\nIdoso\n2\n3\n", "Pessoa fictícia"),
    "Comunicação entre Cuidador e Família": ("1\nMensagem de teste\n3\n4\n", "Mensagem de teste"),
    "Painel do Cuidador": ("", "Maria"),
    "Painel do Idoso": ("3\n0\n2\n4\n5\n", "Concluída"),
    "Registro de Ocorrências e Relatório": ("Pessoa fictícia\n09/10/2026\nExemplo\nExemplo\nExemplo\nNenhuma\nExemplo\n0\n0\n0\n", "RELATÓRIO DIÁRIO"),
    "Alerta de Medicamento": None,
}

def main():
    for module, case in CASES.items():
        sources = sorted((ROOT / "projeto-java" / module).glob("*.java"))
        if not sources:
            raise RuntimeError(f"No sources: {module}")
        with tempfile.TemporaryDirectory() as output:
            subprocess.run(["javac", "-encoding", "UTF-8", "-d", output,
                            *map(str, sources)], check=True)
            if case is not None:
                result = subprocess.run(["java", "-Dfile.encoding=UTF-8", "-cp", output, "Main"],
                                        input=case[0], text=True, encoding="utf-8",
                                        capture_output=True, timeout=10, check=True)
                if case[1] not in result.stdout:
                    raise AssertionError(f"Unexpected output in {module}: {result.stdout}")
        print(f"OK: {module}" + (" (compile only)" if case is None else " (compile + console)"))

if __name__ == "__main__":
    main()
