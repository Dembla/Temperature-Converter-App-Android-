package advancetemperatureconverter.magadistudio.com.advancetemperatureconverter;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    DecimalFormat round = new DecimalFormat("0.00");
    private TextView showResultTemp;
    private EditText editTemp;


    private Button celsius_faranButton;
    private Button celsius_kelvinButton;
    private Button celsius_rankineButton;
    private Button celsius_delisleButton;
    private Button celsius_newtonButton;

    private Button faran_celsiusButton;
    private Button faran_kelvinButton;
    private Button faran_rankineButton;
    private Button faran_delisleButton;
    private Button faran_newtonButton;

    private Button kelvin_celsiusButton;
    private Button kelvin_faranButton;
    private Button kelvin_rankineButton;
    private Button kelvin_delisleButton;
    private Button kelvin_newtonButton;

    private Button rankine_celsiusButton;
    private Button rankine_faranButton;
    private Button rankine_kelvinButton;
    private Button rankine_delisleButton;
    private Button rankine_newtonButton;

    private Button delisle_celsiusButton;
    private Button delisle_faranButton;
    private Button delisle_kelvinButton;
    private Button delisle_rankineButton;
    private Button delisle_newtonButton;

    private Button newton_celsiusButton;
    private Button newton_faranButton;
    private Button newton_kelvinButton;
    private Button newton_rankineButton;
    private Button newton_delisleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SpannableString s = new SpannableString("Advance Temperature Converter");
//        s.setSpan(new TypefaceSpan(this, "Signika-Regular.otf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        ActionBar actionBar = getActionBar();
//        actionBar.setTitle(s);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //TextView mTitle = (TextView) toolbar.findViewById(R.id.title_txt);
        setSupportActionBar(toolbar);

        editTemp = (EditText) findViewById(R.id.enter_textId);
        showResultTemp = (TextView) findViewById(R.id.result_textId);


        celsius_faranButton = (Button) findViewById(R.id.celsius_faranId);
        celsius_kelvinButton = (Button) findViewById(R.id.celsius_kelvinId);
        celsius_rankineButton = (Button) findViewById(R.id.celsius_rankineId);
        celsius_delisleButton = (Button) findViewById(R.id.celsius_delisleId);
        celsius_newtonButton = (Button) findViewById(R.id.celsius_newtonId);

        faran_celsiusButton = (Button) findViewById(R.id.faran_celsiusId);
        faran_kelvinButton = (Button) findViewById(R.id.faran_kelvinId);
        faran_rankineButton = (Button) findViewById(R.id.faran_rankineId);
        faran_delisleButton = (Button) findViewById(R.id.faran_delisleId);
        faran_newtonButton = (Button) findViewById(R.id.faran_newtonId);

        kelvin_celsiusButton = (Button) findViewById(R.id.kelvin_celsiusId);
        kelvin_faranButton = (Button) findViewById(R.id.kelvin_faranId);
        kelvin_rankineButton = (Button) findViewById(R.id.kelvin_rankineId);
        kelvin_delisleButton = (Button) findViewById(R.id.kelvin_delisleId);
        kelvin_newtonButton = (Button) findViewById(R.id.kelvin_newtonId);

        rankine_celsiusButton = (Button) findViewById(R.id.rankine_celsiusId);
        rankine_faranButton = (Button) findViewById(R.id.rankine_faranId);
        rankine_kelvinButton = (Button) findViewById(R.id.rankine_kelvinId);
        rankine_delisleButton = (Button) findViewById(R.id.rankine_delisleId);
        rankine_newtonButton = (Button) findViewById(R.id.rankine_newtonId);

        delisle_celsiusButton = (Button) findViewById(R.id.delisle_celsiusId);
        delisle_faranButton = (Button) findViewById(R.id.delisle_faranId);
        delisle_kelvinButton = (Button) findViewById(R.id.delisle_kelvinId);
        delisle_rankineButton = (Button) findViewById(R.id.delisle_rankineId);
        delisle_newtonButton = (Button) findViewById((R.id.delisle_newtonId));

        newton_celsiusButton = (Button) findViewById(R.id.newton_celsiusId);
        newton_faranButton = (Button) findViewById(R.id.newton_faranId);
        newton_kelvinButton = (Button) findViewById(R.id.newton_kelvinId);
        newton_rankineButton = (Button) findViewById(R.id.newton_rankineId);
        newton_delisleButton = (Button) findViewById(R.id.newton_delisleId);


        celsius_faranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertCelsiusToFaran(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚F");
                }
            }
        });

        celsius_kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertCelsiusToKelvin(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " K");
                }
            }
        });

        celsius_rankineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertCelsiusToRankine(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚R");
                }
            }
        });

        celsius_delisleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertCelsiusToDelisle(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚De");
                }
            }
        });

        celsius_newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertCelsiusToNewton(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚N");
                }
            }
        });

        //Fahrenheit conversion

        faran_celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertFahrenToCelsius(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚C");
                }
            }
        });

        faran_kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertFahrenToKelvin(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " K");
                }
            }
        });

        faran_rankineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertFahrenToRankine(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚R");
                }
            }
        });

        faran_delisleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertFahrenToDelisle(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚De");
                }
            }
        });

        faran_newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertFahrenToNewton(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚N");
                }
            }
        });


        //Kelvin conversion

        kelvin_celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                        if (doubleEditTemp < 0) {
                            Toast.makeText(getApplicationContext(), "Kelvin cannot be negative", Toast.LENGTH_SHORT).show();

                        }
                        else {
                            double convertedTemp = convertKelvinToCelsius(doubleEditTemp);

                            String stringResult = String.valueOf(round.format(convertedTemp));
                            showResultTemp.setText(stringResult + " ˚C");
                        }
                }
            }
        });

        kelvin_faranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Kelvin cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertKelvinToFahren(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚F");
                    }
                }
            }
        });

        kelvin_rankineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Kelvin cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertKelvinToRankine(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚R");
                    }
                }
            }
        });

        kelvin_delisleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Kelvin cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertKelvinToDelisle(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚De");
                    }
                }
            }
        });

        kelvin_newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Kelvin cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertKelvinToNewton(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚N");
                    }
                }
            }
        });

        //Rankine conversion

        rankine_celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Rankine cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertRankineToCelsius(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚C");
                    }
                }
            }
        });

        rankine_faranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Rankine cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertRankineToFahren(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚F");
                    }
                }
            }
        });

        rankine_kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Rankine cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertRankineToKelvin(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " K");
                    }
                }
            }
        });

        rankine_delisleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Rankine cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertRankineToDelisle(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚De");
                    }
                }
            }
        });

        rankine_newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    if(doubleEditTemp < 0) {
                        Toast.makeText(getApplicationContext(), "Rankine cannot be negative", Toast.LENGTH_SHORT).show();

                    } else {
                        double convertedTemp = convertRankineToNewton(doubleEditTemp);

                        String stringResult = String.valueOf(round.format(convertedTemp));
                        showResultTemp.setText(stringResult + " ˚N");
                    }
                }
            }
        });

        //Delisle conversion


        delisle_celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertDelisleToCelsius(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚C");
                }
            }
        });

        delisle_faranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertDelisleToFahren(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚F");
                }
            }
        });

        delisle_kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertDelisleToKelvin(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " K");
                }
            }
        });

        delisle_rankineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertDelisleToRankine(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚R");
                }
            }
        });

        delisle_newtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertDelisleToNewton(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚N");
                }
            }
        });


        //Newton conversion

        newton_celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertNewtonToCelsius(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚C");
                }
            }
        });

        newton_faranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertNewtonToFahren(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚F");
                }
            }
        });

        newton_kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertNewtonToKelvin(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " K");
                }
            }
        });

        newton_rankineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertNewtonToRankine(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚R");
                }
            }
        });

        newton_delisleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTempString = editTemp.getText().toString();
                if(editTempString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter a value", Toast.LENGTH_SHORT).show();
                } else {
                    double doubleEditTemp = Double.parseDouble(editTempString);
                    double convertedTemp = convertNewtonToDelisle(doubleEditTemp);

                    String stringResult = String.valueOf(round.format(convertedTemp));
                    showResultTemp.setText(stringResult + " ˚De");
                }
            }
        });

    }

    //Celsius
    public double convertCelsiusToFaran (double val) {
        double resultFar = (val * 1.8) + 32;
        return resultFar;
    }

    public double convertCelsiusToKelvin (double val) {
        double resultKelvin = val + 273.15;
        return resultKelvin;
    }
    public double convertCelsiusToRankine (double val) {
        double resultRankine = (val + 273.15) * 1.8;
        return resultRankine;
    }

    public double convertCelsiusToDelisle (double val) {
        double resultDelisle = (100 - val) * 1.5;
        return resultDelisle;
    }

    public double convertCelsiusToNewton (double val) {
        double resultNewton = val * 0.33;
        return resultNewton;
    }

    //Fahrenheit

    public double convertFahrenToCelsius (double val) {
        double resultCelsius = (val - 32) / 1.8;
        return resultCelsius;
    }

    public double convertFahrenToKelvin (double val) {
        double resultKelvin = (val + 459.67) / 1.8;
        return resultKelvin;
    }

    public double convertFahrenToRankine (double val) {
        double resultRankine = val + 459.67;
        return resultRankine;
    }

    public double convertFahrenToDelisle (double val) {
        double resultDelisle = (212 - val) * 0.83333;
        return resultDelisle;
    }

    public double convertFahrenToNewton (double val) {
        double resultNewton = (val - 32) * 0.183333;
        return resultNewton;
    }


    //Kelvin

    public double convertKelvinToCelsius (double val) {
        double resultCelsius = val - 273.15;
        return resultCelsius;
    }

    public double convertKelvinToFahren (double val) {
        double resultFar = (val * 1.8) - 459.67;
        return resultFar;
    }

    public double convertKelvinToRankine (double val) {
        double resultRankine = val * 1.8;
        return resultRankine;
    }

    public double convertKelvinToDelisle (double val) {
        double resultDelisle = (373.15 - val) * 1.5;
        return resultDelisle;
    }

    public double convertKelvinToNewton (double val) {
        double resultNewton = (val - 273.15) * 0.33;
        return resultNewton;
    }


    //Rankine

    public double convertRankineToCelsius (double val) {
        double resultCelsius = (val - 491.67) / 1.8;
        return resultCelsius;
    }

    public double convertRankineToFahren (double val) {
        double resultFar = val - 459.67;
        return resultFar;
    }

    public double convertRankineToKelvin (double val) {
        double resultKelvin = val / 1.8;
        return resultKelvin;
    }

    public double convertRankineToDelisle (double val) {
        double resultDelisle = (671.67 - val) * 0.83333;
        return resultDelisle;
    }

    public double convertRankineToNewton (double val) {
        double resultNewton = (val - 491.67) * 0.18333;
        return resultNewton;
    }


    //Delisle

    public double convertDelisleToCelsius (double val) {
        double resultCelsius = 100 - (val * 0.66667);
        return resultCelsius;
    }

    public double convertDelisleToFahren (double val) {
        double resultFar = 212 - (val * 1.2);
        return resultFar;
    }

    public double convertDelisleToKelvin (double val) {
        double resultKelvin = 373.15 - (val * 0.66667);
        return resultKelvin;
    }

    public double convertDelisleToRankine (double val) {
        double resultRankine = 671.67 - (val * 1.2);
        return resultRankine;
    }

    public double convertDelisleToNewton (double val) {
        double resultNewton = 33 - (val * 0.22);
        return resultNewton;
    }


    //Newton

    public double convertNewtonToCelsius (double val) {
        double resultCelsius = val * 3.0303;
        return resultCelsius;
    }

    public double convertNewtonToFahren (double val) {
        double resultFar = val * 5.4545 + 32;
        return resultFar;
    }

    public double convertNewtonToKelvin (double val) {
        double resultKelvin = val * 3.0303 + 273.15;
        return resultKelvin;
    }

    public double convertNewtonToRankine (double val) {
        double resultRankine = val * 5.4545 + 491.67;
        return resultRankine;
    }

    public double convertNewtonToDelisle (double val) {
        double resultDelisle = (33 - val) * 4.5454;
        return resultDelisle;
    }


}
