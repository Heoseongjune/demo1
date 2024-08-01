module kroryi.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kroryi.demo1 to javafx.fxml;
    exports kroryi.demo1;
}