
import java.util.*;

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
}

class Main {
  // Define displayPlayers() method here
  static void displayPlayers(ArrayList<CricketPlayer> bw, ArrayList<CricketPlayer> bt) {
    for (CricketPlayer player : bw) {
      System.out.print(player.getName() + " ");
    }
    System.out.println();
    for (CricketPlayer player : bt) {
      System.out.print(player.getName() + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CricketPlayer p1 = new CricketPlayer(sc.next(), sc.nextInt(),
        sc.nextInt(), sc.nextInt());
    CricketPlayer p2 = new CricketPlayer(sc.next(), sc.nextInt(),
        sc.nextInt(), sc.nextInt());
    CricketPlayer p3 = new CricketPlayer(sc.next(), sc.nextInt(),
        sc.nextInt(), sc.nextInt());
    CricketPlayer p4 = new CricketPlayer(sc.next(), sc.nextInt(),
        sc.nextInt(), sc.nextInt());

    // Define ArrayList objects here
    final List<CricketPlayer> allPlayers = List.of(p1, p2, p3, p4);

    // Define ArrayList objects here
    final ArrayList<CricketPlayer> bw = new ArrayList<>();

    final ArrayList<CricketPlayer> bt = new ArrayList<>();

    for (final CricketPlayer c : allPlayers) {
      if (c.avgRuns() > Double.valueOf(25)) {
        bt.add(c);
      }
      if (c.avgWickets() > Double.valueOf(1)) {
        bw.add(c);
      }
    }

    displayPlayers(bw, bt);
  }
}
