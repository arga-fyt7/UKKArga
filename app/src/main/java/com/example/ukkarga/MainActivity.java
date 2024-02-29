package com.example.ukkarga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private Button allclear, tambah, kurang, kali, bagi, koma, equal;
    private TextView input, output;
    String data;
    private int angka1;
    private int angka2;

    private static final char OPERASI_TAMBAH = '+';
    private static final char OPERASI_KURANG = '-';
    private static final char OPERASI_KALI = '*';
    private static final char OPERASI_BAGI = '/';
    private char OPERASI_AKTIF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        allclear = findViewById(R.id.allclear);
        koma = findViewById(R.id.koma);
        equal = findViewById(R.id.equal);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "8");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "9");
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "+");
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "-");
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "*");
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + "/");
            }
        });
        koma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = input.getText().toString();
                input.setText(data + ",");
            }
        });
        allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = input.getText().toString();

                // Cek apakah input tidak kosong
                if (!data.isEmpty()) {
                    // Split input menjadi angka dan operator
                    String[] tokens = data.split("[\\+\\-\\*\\/]");

                    // Ambil angka pertama
                    angka1 = Integer.parseInt(tokens[0]);

                    // Ambil operator
                    char operator = data.charAt(tokens[0].length());

                    // Ambil angka kedua
                    angka2 = Integer.parseInt(tokens[1]);

                    // Lakukan operasi matematika
                    switch (operator) {
                        case '+':
                            data = String.valueOf(angka1 + angka2);
                            break;
                        case '-':
                            data = String.valueOf(angka1 - angka2);
                            break;
                        case '*':
                            data = String.valueOf(angka1 * angka2);
                            break;
                        case '/':
                            if (angka2 != 0) {
                                data = String.valueOf(angka1 / angka2);
                            } else {
                                data = "Error";
                            }
                            break;
                    }

                    // Tampilkan hasil operasi di output
                    output.setText(data);

                    // Kosongkan input
                    input.setText(String.format("%d %c %d", angka1, operator, angka2));
                }
            }
        });
    }
}