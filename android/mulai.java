package com.dimas.projectpi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mulai extends AppCompatActivity {
    Pertanyaan Libray = new Pertanyaan();
    Button tbl1, tbl2, tbl3, tbl4;
    TextView prty;
    TextView skor;
    int nomor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        tbl1 = (Button) findViewById(R.id.btnTombol1);
        tbl2 = (Button) findViewById(R.id.btnTombol2);
        tbl3 = (Button) findViewById(R.id.btnTombol3);
        tbl4 = (Button) findViewById(R.id.btnTombol4);
        prty = (TextView) findViewById(R.id.txtPertanyaan);
        updateQuestion(nomor);
        updatePilihan(nomor);

        tbl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl1.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;

                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);
                }
            }
        });

        tbl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl2.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);
                }
            }


        });

        tbl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl3.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);
                }
            }


        });

        tbl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl4.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    updateQuestion(nomor);
                    updatePilihan(nomor);
                }
            }


        });
    }

    private void updateQuestion(int order) {
        prty.setText(Libray.getQuestion(order));
        Libray.getQuestion(order);
    }

    private void updatePilihan(int order) {

        tbl1.setText(Libray.getChoice1(order));
        tbl2.setText(Libray.getChoice2(order));
        tbl3.setText(Libray.getChoice3(order));
        tbl4.setText(Libray.getChoice4(order));
    }
}
