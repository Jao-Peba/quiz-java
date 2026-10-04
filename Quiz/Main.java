import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: João César Medeiros de Oliveira");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Qual é o maior país do mundo em extensão territorial?",
                "Brasil",
                "Rússia",
                "Canadá",
                "China",
                'B'));

        questoes.add(new Questao("2) Qual é a capital do Brasil?",
                "São Paulo",
                "Rio de Janeiro",
                "Brasília",
                "Salvador",
                'C'));

        questoes.add(new Questao("3) Qual é o maior oceano do planeta?",
                "Oceano Atlântico",
                "Oceano Índico",
                "Oceano Ártico",
                "Oceano Pacífico",
                'D'));

        questoes.add(new Questao("4) Quantos estados possui o Brasil?",
                "24",
                "25",
                "26",
                "27",
                'C'));

        questoes.add(new Questao("5) Qual é o rio mais extenso do mundo?",
                "Rio Amazonas",
                "Rio Nilo",
                "Rio Mississippi",
                "Rio Yangtzé",
                'A'));

        questoes.add(new Questao("6) Em qual continente está localizado o Egito?",
                "Ásia",
                "África",
                "Europa",
                "Oceania",
                'B'));

        questoes.add(new Questao("7) Qual é a capital da França?",
                "Roma",
                "Madrid",
                "Paris",
                "Lisboa",
                'C'));

        questoes.add(new Questao("8) Qual é o maior continente do mundo?",
                "África",
                "Europa",
                "América",
                "Ásia",
                'D'));

        questoes.add(new Questao("9) Qual é o menor país do mundo em extensão territorial?",
                "Mônaco",
                "Vaticano",
                "Luxemburgo",
                "Malta",
                'B'));

        questoes.add(new Questao("10) Qual destes países está localizado na América do Sul?",
                "México",
                "Portugal",
                "Chile",
                "Canadá",
                'C'));

        questoes.add(new Questao("11) Qual é a capital da Argentina?",
                "Buenos Aires",
                "Montevidéu",
                "Santiago",
                "Lima",
                'A'));

        questoes.add(new Questao("12) Qual é o maior deserto quente do mundo?",
                "Deserto do Atacama",
                "Deserto do Saara",
                "Deserto da Arábia",
                "Deserto de Gobi",
                'B'));

        questoes.add(new Questao("13) Qual estado brasileiro possui a maior extensão territorial?",
                "Amazonas",
                "Pará",
                "Mato Grosso",
                "Minas Gerais",
                'A'));

        questoes.add(new Questao("14) Em qual continente está localizado o Japão?",
                "Europa",
                "Ásia",
                "África",
                "Oceania",
                'B'));

        questoes.add(new Questao("15) Qual é a capital da Austrália?",
                "Sydney",
                "Melbourne",
                "Canberra",
                "Brisbane",
                'C'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");
            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }
        }

        System.out.println("Foram " + acertos + " acertos");
        double porcentagem = ((acertos * 100.0) / questoes.size());
        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);
        scanner.close();
        System.out.println("Obrigado por participar do quiz");
    }
}

