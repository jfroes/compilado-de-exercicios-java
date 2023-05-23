module com.example.gerenciadordecurso {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.gerenciadordecurso to javafx.fxml;
    exports com.example.gerenciadordecurso;
}