package cl.telsur.reneignacio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonTomate;
    private Button buttonPepino;
    private TextView textViewPalta;
    private View paltaBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        buttonTomate = findViewById(R.id.idbuttontomate);
        buttonPepino = findViewById(R.id.idbuttonpepino);
        textViewPalta = findViewById(R.id.idtextViewpalta);
        paltaBackground = findViewById(R.id.idpalta);

        // Configurar listeners para los botones
        buttonTomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar background y texto de palta
                paltaBackground.setBackgroundResource(R.color.tomate_background);
                textViewPalta.setText("Tomate");
            }
        });

        buttonPepino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar background y texto de palta
                paltaBackground.setBackgroundResource(R.color.pepino_background);
                textViewPalta.setText("Pepino");
            }
        });
    }
}
