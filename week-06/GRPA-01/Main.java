import java.util.*;
import java.util.stream.Stream;

class CricketPlayer {
  private String name;
  private int wickets;
  private int runs;
  private int matches;

  public CricketPlayer(String s, int w, int r, int m) {
    this.name = s;
    this.wickets = w;
    this.runs = r;
    this.matches = m;
  }

  public String getName() {
    return name;
  }

  public int getWickets() {
    return wickets;
  }

  public int getRuns() {
    return runs;
  }

  public double avgRuns() {
    return runs / matches;
  }

  public double avgWickets() {
    return wickets / matches;
  }

  public String toString() {
    return this.getName();
  }
}

public class Main {
  // Define displayPlayers() method here
  static void displayPlayers(List<CricketPlayer> bw, List<CricketPlayer> bt) {
    final Stream<CricketPlayer> bowlers = bw.stream();
    bowlers.forEach(s -> System.out.print(s + " "));
    System.out.println();
    final Stream<CricketPlayer> batsman = bt.stream();
    batsman.forEach(s -> System.out.print(s + " "));

    // for (CricketPlayer player : bw) {
    // System.out.print(player.getName() + " ");
    // }
    // System.out.println();
    // for (CricketPlayer player : bt) {
    // System.out.print(player.getName() + " ");
    // }
  }

  public static void main(String[] args) {
    System.out.println("Welcome ");
    // Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer("Dhoni", 11,
        11000, 347);
    CricketPlayer p2 = new CricketPlayer("Kohli", 10,
        12285, 257);
    CricketPlayer p3 = new CricketPlayer("Ashwin", 181,
        1000, 90);
    CricketPlayer p4 = new CricketPlayer("Bumrah", 130,
        50, 60);
    // sc.close();

    // Define ArrayList objects here
    final List<CricketPlayer> allPlayers = List.of(p1, p2, p3, p4);

    // Define ArrayList objects here

    final List<CricketPlayer> bw = allPlayers.stream().filter(p -> p.avgRuns() > 25).toList();
    final List<CricketPlayer> bt = allPlayers.stream().filter(p -> p.avgWickets() > 1).toList();

    // for (final CricketPlayer c : allPlayers) {
    // if (c.avgRuns() > Double.valueOf(25)) {
    // bt.add(c);
    // }
    // if (c.avgWickets() > Double.valueOf(1)) {
    // bw.add(c);
    // }
    // }
    displayPlayers(bw, bt);
  }
}
