package devandroid.ofice.boaviagem;

import static devandroid.ofice.boaviagem.R.id.nova_viagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DashboardActivity extends Activity {

    private Button selectOption;
    TextView novaViagem;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        novaViagem = findViewById(nova_viagem);
        selecionarOpcao();
    }


    public void selecionarOpcao(){

        novaViagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.nova_viagem:
                        startActivity(new Intent(this,ViagemActivity.class));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + v.getId());
                }
            }
        });

    }
}
