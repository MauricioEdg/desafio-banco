
import lombok.Getter;
import lombok.Setter;

import java.util.List;
public class Banco {
    @Getter
    @Setter
    private String nome;

    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
