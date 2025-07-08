package me.marioscalas.saikata.weatherexpert.internal.weather;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class WeatherTools {
    private final WeatherClient weatherClient;

    public WeatherTools(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }

    @Tool(
        name = "getWeather",
        description = "Get the current weather for a given city and optional country"
    )
    public WeatherResponse getWeather(WeatherRequestV2 request) {
        return weatherClient.getWeather(request);
    }    
}
