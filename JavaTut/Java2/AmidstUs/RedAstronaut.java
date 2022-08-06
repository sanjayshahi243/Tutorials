// package Java2.AmidstUs;

public class RedAstronaut extends Player implements Imposter {
    private String skill;

    public RedAstronaut (String name) {
        this (name, 15, 'experienced');
    }
    
    public RedAstronaut (String name, int susLevel, String skill) {
        this.name = name;
        this.susLevel = susLevel;
        this. skill = skill;
    }

    @Override
    public void emergencyMeeting () {
        if (frozen) return;

        Player[] sorted_players = Arrays.sort(players);

        
        if(sorted_players[sorted_players.length-1] == this) {
            if (sorted_players[sorted_players.length-2].compareTo(sorted_players[sorted_players.length-3]) != 0) {
                sorted_players[sorted_players.length-2].setFrozen(true);
            }
        } else {
            if (sorted_players[sorted_players.length-1].compareTo(sorted_players[sorted_players.length-2]) != 0) {
                sorted_players[sorted_players.length-1].setFrozen(true);
            }
        }
    }
}
