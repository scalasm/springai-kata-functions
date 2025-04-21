package me.marioscalas.saikata.weatherexpert;

import me.marioscalas.saikata.weatherexpert.model.Answer;
import me.marioscalas.saikata.weatherexpert.model.Question;

public interface AIPromptService {
    Answer getAnswer(Question question);
}
