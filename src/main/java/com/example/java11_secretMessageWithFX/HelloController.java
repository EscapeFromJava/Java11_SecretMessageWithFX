package com.example.java11_secretMessageWithFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    TextArea txtAreaA;
    @FXML
    TextArea txtAreaB;
    @FXML
    Button btnEncoding;

    public void onButtonEncodingClick() {
        String[] lines = txtAreaA.getText().trim().split("\n");
        int lenghtCipher = Integer.parseInt(lines[0].split(" ")[0]);
        int lenghtNumberBase = Integer.parseInt(lines[0].split(" ")[1]);
        String cipher = lines[1];
        String check;
        for (int i = 0; i < lenghtCipher - lenghtNumberBase; i++) {
            check = cipher.substring(i, i + lenghtNumberBase);
            for (int j = i + 1; j < lenghtCipher - lenghtNumberBase + 1; j++) {
                if (cipher.substring(j, j + lenghtNumberBase).equals(check)) {
                    txtAreaB.setText("YES");
                    return;
                }
            }
        }
        txtAreaB.setText("NO");
    }
}
