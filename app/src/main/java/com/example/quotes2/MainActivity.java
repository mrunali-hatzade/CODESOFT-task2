package com.example.quotes2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button getQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        getQuoteButton = findViewById(R.id.getQuoteButton);

        getQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomQuote();
            }
        });
    }

    private void displayRandomQuote() {
        // In a real app, you would fetch quotes from a data source.
        // For simplicity, let's use a static array for demonstration purposes.
        Quote[] quotes = {
                new Quote("The only limit to our realization of tomorrow will be our doubts of today.", "Franklin D. Roosevelt"),
                new Quote("It always seems impossible until it’s done.", "Nelson Mandela"),
                new Quote("The way to get started is to quit talking and begin doing.", "Walt Disney"),
                // Add more quotes as needed
        };

        // Get a random quote
        int randomIndex = (int) (Math.random() * quotes.length);
        Quote randomQuote = quotes[randomIndex];

        // Display the quote in the TextView
        String quoteText = "\"" + randomQuote.getText() + "\"\n- " + randomQuote.getAuthor();
        quoteTextView.setText(quoteText);
    }
}
