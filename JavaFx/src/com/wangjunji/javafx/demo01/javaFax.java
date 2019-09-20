package com.wangjunji.javafx.demo01;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class javaFax extends Application {
    private static int count = 0;
    private static Label lbl = new Label("Count is 0");


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button inc = new Button("Increment");
        Button dec = new Button("Decrement");
        VBox p = new VBox(8);
        p.setAlignment(Pos.CENTER);
        p.setPadding(new Insets(10));
        p.getChildren().addAll(lbl, inc, dec);

        inc.setOnAction(e -> updateBy(1));
        dec.setOnAction(e -> updateBy(-1));

        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }

    private static void updateBy(int n) {
        count += n;
        lbl.setText("Count is " + count);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}