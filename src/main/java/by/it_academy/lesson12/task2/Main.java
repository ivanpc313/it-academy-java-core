package by.it_academy.lesson12.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("File:");
        var file = scanner.nextLine();
        System.out.println("Enter team name:");
        var team = scanner.nextLine();


        try (var reader = new BufferedReader(new FileReader(file))) {
            var games = new ArrayList<Game>();
            String line;
            while ((line = reader.readLine()) != null) {
                games.add(new Game(line));
            }
            int wins = 0;
            int loses = 0;
            for (Game game : games) {
                if (game.hasTeam(team)) {
                    if (game.winner().equals(team)){
                        wins++;
                    }else {
                        loses++;
                    }
                }
            }
            System.out.println("Total = " + (wins + loses));
            System.out.println("Wins = " + wins);
            System.out.println("Loses = " + loses);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final class Game {
        private final String raw;

        private Game(String raw) {
            this.raw = raw;
        }

        boolean hasTeam(String team) {
            return firstTeam().equals(team) || secondTeam().equals(team);
        }

        String winner() {
            if (firstTeamScore() > secondTeamScore()) {
                return firstTeam();
            }
            return secondTeam();
        }

        private String[] parts() {
            return raw.split(",");
        }

        private String firstTeam() {
            return parts()[0];
        }

        private String secondTeam() {
            return parts()[1];
        }

        private int firstTeamScore() {
            return Integer.parseInt(parts()[2]);
        }

        private int secondTeamScore() {
            return Integer.parseInt(parts()[3]);
        }
    }
}





