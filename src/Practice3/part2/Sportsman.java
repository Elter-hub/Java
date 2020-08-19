package Practice3.part2;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Sportsman implements Runner {

    @Override
    public void run() {
        System.out.println("👟👟 🎽 " );
    }

    public static void main(String[] args) {
        ArrayList<Runner> runners = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            runners.add(new Sportsman());
        }
        runners.forEach(Runner::run);
    }
}
