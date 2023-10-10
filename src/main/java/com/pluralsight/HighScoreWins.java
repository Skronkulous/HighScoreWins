package com.pluralsight;
import java.util.*;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        String input = "", teams = "", scores = "", winningTeam ="";
        System.out.print("Please enter a game score: ");
        input = kbScanner.nextLine();

        String[] split1 = input.split(Pattern.quote("|"));
        teams = split1[0];
        scores = split1[1];
        String[] teamsSplit = teams.split(Pattern.quote(":"));
        String[] scoresSplit = scores.split(Pattern.quote(":"));

        if(Integer.parseInt(scoresSplit[0]) >  Integer.parseInt(scoresSplit[1])){
            winningTeam = teamsSplit[0];
        }
        else
            winningTeam = teamsSplit[1];

        System.out.print("Winner: " + winningTeam);
    }
}
