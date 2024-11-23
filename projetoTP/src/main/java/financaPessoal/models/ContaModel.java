package financaPessoal.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "Conta")
public class ContaModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idConta;
    private double saldo;
    private ArrayList<TransacaoModel> transacoes;
}
