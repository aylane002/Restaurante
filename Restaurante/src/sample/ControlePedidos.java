package sample;


import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControlePedidos {
    @FXML
    private TableView<?> TableViewPedido;

    @FXML
    private TableColumn<?, ?> tableColumnMesa;

    @FXML
    private TableColumn<?, ?> tableColumnPedido;

    @FXML
    private TableColumn<?, ?> tableColumnGarcom;

    @FXML
    private TableColumn<?, ?> tableColumnHorario;

    @FXML
    private ComboBox<?> comBoxPedidoAtual;

    @FXML
    private ComboBox<?> comboBoxGarcom;

    @FXML
    private TextArea textAreacomentar;

    @FXML
    private Button butaoEditarPedido;

    @FXML
    private Button butaoFecharMesa;
}
