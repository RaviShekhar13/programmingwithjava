package mockoppe;

import java.util.*;

class Shop {
    private String name;
    private int nsold;

    public Shop(String s, int ns) {
        this.name = s;
        this.nsold = ns;
    }

    public String getName() {
        return name;
    }

    public int getItemSold() {
        return nsold;
    }
}

public class MapTest {
    public static void printShopName(List<Shop> sList) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        String shop = "";
        int sold = 0;
        // iterate through sList and add each shop object to map "m"
        sList.stream().forEach(e -> m.put(e.getName(), m.getOrDefault(e.getName(), 0) + e.getItemSold()));
        System.out.println("-------------" + m);
        shop = m.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("No Such Element");
        // .orElse("No Max Scores");
        shop = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
        sold = m.get(shop);

        System.out.println(shop + " : " + sold);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Shop s1 = new Shop("SuperBazar", 30);
        Shop s2 = new Shop("More", 40);
        Shop s3 = new Shop("Shopsy", 30);
        Shop s4 = new Shop("More", 30);
        List<Shop> list = List.of(s1, s2, s3, s4);
        // for (int i = 0; i < 4; i++) {
        // list.add(new Shop(sc.next(), sc.nextInt()));
        // }
        printShopName(list);
    }
}