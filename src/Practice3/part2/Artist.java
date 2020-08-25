package Practice3.part2;

import Practice3.part1.Square;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Artist implements Singer {

    @Override
    public void sing() {
        System.out.println("La👨‍🎤 la👩‍🎤 ▶ 🎧");
    }

    Square square = new Square(20);
}
