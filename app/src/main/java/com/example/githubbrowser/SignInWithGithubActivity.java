package com.example.githubbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInWithGithubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in_with_github);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
<<<<<<< HEAD
        Button signInWithGithubButton = findViewById(R.id.signInButton);
        signInWithGithubButton.setOnClickListener(v -> {
            Intent intent01 = new Intent(SignInWithGithubActivity.this, MainActivity.class);
=======
        Button signInWithGithubButton = findViewById(R.id.sign_in);
        signInWithGithubButton.setOnClickListener(v -> {
            Intent intent01 = new Intent(SignInWithGithubActivity.this, ExploreActivity.class);
>>>>>>> d99fa10b40bba0c2f8146cb90d55841649cb5df5
            startActivity(intent01);
        });
    }
}