package com.nageta.Avar.processor;

import com.nageta.Avar.structure.Token;
import com.nageta.Avar.structure.TokenNamesEnum;
import com.nageta.Avar.structure.TokenType;
import com.nageta.Avar.util.TokenTypesUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {
    private final String code;
    private Integer position;
    private final List<Token> tokens;

    public Lexer(String code) {
        this.code = code;
        this.position = 0;
        this.tokens = new ArrayList<>();
    }

    public List<Token> analys() {
        while (nextToken()) {}
//        need new variable?
        return tokens.stream()
                .filter(token -> !token.getType().getName().equals(TokenNamesEnum.SPACE))
                .toList();
    }

    private boolean nextToken() {
        if (this.position >= this.code.length()) {
            return false;
        }

        Map<String, TokenType> tokenTypes = TokenTypesUtil.getTokenTypes();
        for (TokenType tokenType: tokenTypes.values()) {
            String regex = "^" + tokenType.getRegex();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(this.code.substring(this.position));
            if (matcher.find() && !matcher.group().isEmpty()) {
                String word = matcher.group();
                Token token = new Token(tokenType, word, this.position);
                this.position += word.length();
                this.tokens.add(token);
                return true;
            }
        }
        throw new Error("Error on " + this.position + " position");
    }

//    TODO: сделать нормально
    private int countLines(String code) {
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(code);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
