package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Planet> planetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        planetList = generatePlanetList();
        PlanetAdapter adapter = new PlanetAdapter(this, planetList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Planet planet = planetList.get(position);
                Intent intent = new Intent(MainActivity.this, PlanetDetailActivity.class);
                intent.putExtra("name", planet.getName());
                intent.putExtra("info", planet.getInfo());
                startActivity(intent);
            }
        });
    }

    private List<Planet> generatePlanetList() {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercurio", "Mercúrio é o planeta mais próximo do Sol. Mercúrio é um planeta que não possui uma inclinação semelhante à da Terra. Sem essa inclinação e com uma translação curta, não há existência de estações do ano. Essa baixa inclinação explica também o gelo encontrado nas crateras desse planeta."));
        planets.add(new Planet("Venus", "O planeta Vênus é o segundo do nosso sistema solar a partir do Sol e o mais próximo da Terra, a apenas 61 milhões de quilômetros de distância. Uma de suas principais características é o fato de, como um planeta rochoso, sua superfície ser composta por vales e altas montanhas, cheias de vulcões."));
        planets.add(new Planet("Terra", "O Planeta Terra é conhecido como Planeta Azul, por ter 70% da sua superfície coberta de água. Ouça o texto abaixo! O Planeta Terra é um dos planetas que fazem parte do Sistema Solar e é o terceiro planeta mais próximo do Sol. A sua formação ocorreu há bilhões de anos, assim como a existência de vida aqui ."));
        planets.add(new Planet("Marte", "Marte é o quarto planeta do Sistema Solar, ficando entre a Terra e Júpiter. A 227 milhões de km do Sol, é um planeta formado por superfície rochosa e atmosfera rica em CO2. Representação de Marte, quarto planeta a partir do Sol. Em função de sua coloração, é chamado também de Planeta Vermelho."));
        planets.add(new Planet("Jupiter", "O dia em Júpiter tem 10 horas de duração. Europa, uma das Luas Galileanas, pode ter um oceano líquido em sua superfície. Ventos de 600 km/hora são comuns em Júpiter. A massa de Júpiter é 2,5 vezes maior do que os outros sete planetas do Sistema Solar juntos."));
        planets.add(new Planet("Saturno", "Saturno é o segundo maior planeta do Sistema Solar, com 9 vezes o tamanho da Terra. Está relativamente distante do Sol, sendo o sexto planeta a partir dessa estrela, demorando 29,4 anos terrestres, ou 10.756 dias, para completar uma volta em torno dela."));
        planets.add(new Planet("Urano", "Urano é o sétimo planeta a partir do Sol e o terceiro maior do Sistema Solar, depois de Júpiter e Saturno. Sua massa é, aproximadamente, 14 vezes a da Terra, e possui quatro vezes o seu tamanho."));
        planets.add(new Planet("Netuno", "Netuno é um planeta gasoso pertencente ao Sistema Solar classificado como um gigante de gelo. Trata-se do oitavo planeta a partir do Sol, sendo, portanto, o planeta mais distante do Sol. Em decorrência disso, o tempo que Netuno leva para dar uma volta completa em torno dessa estrela é muito grande: 165 anos."));
        return planets;
    }
}