#encoding "utf8"

PP -> "в" Noun interp (Fact.Field1); //меняем терминал Prep на лемму "в" и выводим (интерпретируем) существительное
S -> Verb PP;
