module com.armenise.studiodentisticofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.armenise.studiodentisticofx to javafx.fxml;
    exports com.armenise.studiodentisticofx;
}