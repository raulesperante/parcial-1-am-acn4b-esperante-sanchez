package ar.edu.davinci.goldengym;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroActivity extends  AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }

    public void register(View view){
        EditText[] inputs = {
                findViewById(R.id.email),
                findViewById(R.id.phone),
                findViewById(R.id.name),
                findViewById(R.id.surname)
        };

        for (EditText input : inputs) {
            if (input.getText().toString().trim().isEmpty()) {
                Toast.makeText(RegistroActivity.this,
                        "Debe completar todos los campos",
                        Toast.LENGTH_SHORT).show();
                return;
            }
        }

        Intent intent = new Intent(getApplicationContext(), RegisterSuccessActivity.class);
        startActivity(intent);
    }


}

