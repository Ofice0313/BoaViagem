package devandroid.ofice.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BoaViagemActivity extends Activity {

    private EditText usuario;
    private EditText senha;
    private Button btnEntrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.user);
        senha = (EditText) findViewById(R.id.senha);
        btnEntrar = (Button) findViewById(R.id.btnLogin);

        entrarOnClick();
    }

    public void entrarOnClick(){

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioInformado = usuario.getText().toString();
                String senhaInformada = senha.getText().toString();

                if("caleb".equals(usuarioInformado) && "1234".equals(senhaInformada)){
                    startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                }else{
                    String mensagemErro = getString(R.string.erro_autenticacao);
                    Toast toast = Toast.makeText(getApplicationContext(), mensagemErro, Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });

    }
}
