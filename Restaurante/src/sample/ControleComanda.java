package sample;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControleComanda {
    @FXML
    private TableView<?> tabelaViewcomanda;

    @FXML
    private TableColumn<?, ?> tabelaGarcom;

    @FXML
    private TableColumn<?, ?> tabelaPedido;

    @FXML
    private TableColumn<?, ?> tabelaValor;

    @FXML
    private Button butaoLibararMesa;

    @FXML
    private Button butaoFinalizarPedido;

    @FXML
    private Button butaoAplicarDesconto;

    @FXML
    private TextField textFieldTotal;

    @FXML
    private TextField textFieldDesconto;
}
