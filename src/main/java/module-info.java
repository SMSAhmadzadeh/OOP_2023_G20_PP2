module OOP_1402_PP2{
        requires javafx.graphics;
        requires javafx.controls;
    requires javafx.fxml;

    exports view;
        opens view to javafx.fxml;
        }