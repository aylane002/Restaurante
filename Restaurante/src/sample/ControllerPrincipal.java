package sample;

import javafx.fxml.FXML;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ControllerPrincipal {
    @FXML
    private ListView<?> listViewReservadas;

    @FXML
    private ListView<?> listViewLivres;

    @FXML
    private ListView<?> listViewOcupadas;

    @FXML
    private ComboBox<?> ComboBoxPedidos;

    @FXML
    private ComboBox<?> comboBoxGarcom;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<?> comboBoxOcupado;

    @FXML
    private Button botaoDesocuparMesa;

}

