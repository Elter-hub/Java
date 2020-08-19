package Practice3.part2;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Artist implements Singer {

    @Override
    public void sing() {
        System.out.println("La👨‍🎤 la👩‍🎤 ▶ 🎧");
    }

    public static void main(String[] args) {
        ArrayList<Singer> artists = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            artists.add(new Artist());
        }
        artists.forEach(Singer::sing);
    }
}
